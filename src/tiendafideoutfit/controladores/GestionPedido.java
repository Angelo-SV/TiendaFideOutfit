package tiendafideoutfit.controladores;

import tiendafideoutfit.modelos.ItemCarrito;
import tiendafideoutfit.modelos.Cliente;
import tiendafideoutfit.modelos.ResumenPedido;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import tiendafideoutfit.vistas.Factura;

public class GestionPedido {
    private static final String ARCHIVO_PEDIDOS = "Datos/pedidos.txt";
    private static int contadorPedido = obtenerUltimoNumeroPedido();

    public static boolean registrarPedido(Cliente cliente, List<ItemCarrito> items, double total, JFrame parent) {
        if (items == null || items.isEmpty()) {
            JOptionPane.showMessageDialog(parent, "El carrito está vacío. No se puede registrar el pedido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        GestionCliente gestionCliente = new GestionCliente();
        if (gestionCliente.buscarClientePorCedula(cliente.getCedula()) == null) {
            boolean valido = gestionCliente.validarCampos(
                cliente.getNombre(), cliente.getApellido(), cliente.getCedula(),
                cliente.getCorreo(), cliente.getTelefono(), cliente.getDireccion(), parent
            );
            if (!valido) return false;
            gestionCliente.agregarCliente(
                cliente.getNombre(), cliente.getApellido(), cliente.getCedula(),
                cliente.getCorreo(), cliente.getTelefono(), cliente.getDireccion()
            );
        }
        boolean inventarioActualizado = GestionPrenda.restarInventario(items);
        if (!inventarioActualizado) {
            JOptionPane.showMessageDialog(parent, "Error al actualizar el inventario.", "Inventario", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        contadorPedido++;
        StringBuilder factura = new StringBuilder();
        factura.append("=== Factura #").append(contadorPedido).append(" ===\n");
        factura.append("Fecha: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))).append("\n");
        factura.append("Cliente: ").append(cliente.getNombre()).append(" ").append(cliente.getApellido()).append("\n");
        factura.append("Cédula: ").append(cliente.getCedula()).append("\n");
        factura.append("Teléfono: ").append(cliente.getTelefono()).append("\n");
        factura.append("Correo: ").append(cliente.getCorreo()).append("\n");
        factura.append("Dirección: ").append(cliente.getDireccion()).append("\n");
        factura.append("\nItems:\n");
        factura.append(String.format("%-12s %-10s %-9s %-9s %-12s %-12s\n",
                "Descripción", "Talla", "Color", "Cantidad", "Precio", "Total"));
        factura.append("-------------------------------------------------------------------\n");
        for (ItemCarrito item : items) {
            factura.append(String.format("%-12s %-10s %-9s %-9d ¢%-11.2f ¢%-11.2f\n",
                    item.getDescripcion(),
                    item.getTalla(),
                    item.getColor(),
                    item.getCantidadSeleccionada(),
                    item.getPrecio(),
                    item.getTotal()));
        }
        factura.append("\nTotal del pedido: ¢").append(total).append("\n");
        factura.append("===========================\n\n");

         try (BufferedWriter writer = new BufferedWriter(
            new OutputStreamWriter(new FileOutputStream(ARCHIVO_PEDIDOS, true), StandardCharsets.UTF_8))) {
            writer.write(factura.toString());
            writer.flush(); // aseguramos que se escriba todo
        } catch (IOException e) {
            JOptionPane.showMessageDialog(parent, "Error al guardar el pedido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
         
        GestionCarrito.limpiarCarrito();
        Factura ventanaFactura = new Factura();
        ventanaFactura.mostrarFactura(factura.toString());
        ventanaFactura.setVisible(true);
        return true;
    }

    private static int obtenerUltimoNumeroPedido() {
        int ultimo = 0;
        File archivo = new File(ARCHIVO_PEDIDOS);
        if (!archivo.exists()) return 0;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("=== Factura #")) {
                    String numeroStr = linea.replace("=== Factura #", "").replace(" ===", "").trim();
                    try {
                        int num = Integer.parseInt(numeroStr);
                        if (num > ultimo) {
                            ultimo = num;
                        }
                    } catch (NumberFormatException ignored) {}
                }
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo de pedidos: " + e.getMessage());
        }
        return ultimo;
    }

    public static List<ResumenPedido> obtenerResumenPedidos() {
        List<ResumenPedido> lista = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(
            new InputStreamReader(new FileInputStream(ARCHIVO_PEDIDOS), StandardCharsets.UTF_8))) {
            String linea;
            int numero = 0;
            String fecha = "";
            String cliente = "";
            double total = 0;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("=== Factura #")) {
                    numero = Integer.parseInt(linea.replace("=== Factura #", "").replace(" ===", "").trim());
                } else if (linea.startsWith("Fecha:")) {
                    fecha = linea.replace("Fecha:", "").trim();
                } else if (linea.startsWith("Cliente:")) {
                    cliente = linea.replace("Cliente:", "").trim();
                } else if (linea.startsWith("Total del pedido:")) {
                    String totalStr = linea.replace("Total del pedido:", "").replace("¢", "").trim();
                    total = Double.parseDouble(totalStr.replace(",", "."));
                    lista.add(new ResumenPedido(numero, fecha, cliente, total));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public static String obtenerDetallePedido(int numeroPedido) {
        StringBuilder detalle = new StringBuilder();
        boolean enPedido = false;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(ARCHIVO_PEDIDOS), StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith("=== Factura #")) {
                    int numero = Integer.parseInt(linea.replace("=== Factura #", "").replace(" ===", "").trim());
                    enPedido = numero == numeroPedido;
                }
                if (enPedido) {
                    detalle.append(linea).append("\n");
                    if (linea.startsWith("===========================")) {
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return detalle.toString();
    }
}