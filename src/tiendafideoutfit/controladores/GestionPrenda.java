package tiendafideoutfit.controladores;

import tiendafideoutfit.modelos.Prenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import tiendafideoutfit.modelos.ItemCarrito;

public class GestionPrenda {
    public static ArrayList<Prenda> listaPrendas = new  ArrayList<>();
    private static final String FILE_PATH = "Datos/prendas.txt";
    
    public static void guardarPrendasEnArchivo() {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(FILE_PATH), StandardCharsets.UTF_8))) {
            for (Prenda p : listaPrendas) {
                writer.write(p.getDescripcion() + "|" + p.getDepartamento() + "|" +
                             p.getTalla() + "|" + p.getColor() + "|" + p.getCodigo() + "|" +
                             p.getCantidad() + "|" + p.getPrecio() + "|" + p.getTotal());
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar prendas: " + e.getMessage());
        }
    }
    
    public void agregarPrendas(String descripcion, String departamento, String 
            talla, String color, String codigo, int cantidad, double precio,
            double total){
        Prenda prendas = new Prenda();
        prendas.setDescripcion(descripcion);
        prendas.setDepartamento(departamento);
        prendas.setTalla(talla);
        prendas.setColor(color);
        prendas.setCodigo(codigo);
        prendas.setCantidad(cantidad);
        prendas.setPrecio(precio);
        prendas.setTotal(total);
        listaPrendas.add(prendas);
        guardarPrendasEnArchivo();
    }
    
    public static void cargarPrendasDesdeArchivo() {
        listaPrendas.clear();
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(FILE_PATH), StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 8) {
                    Prenda p = new Prenda();
                    p.setDescripcion(datos[0]);
                    p.setDepartamento(datos[1]);
                    p.setTalla(datos[2]);
                    p.setColor(datos[3]);
                    p.setCodigo(datos[4]);
                    p.setCantidad(Integer.parseInt(datos[5]));
                    p.setPrecio(Double.parseDouble(datos[6]));
                    p.setTotal(Double.parseDouble(datos[7]));
                    listaPrendas.add(p);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar prendas: " + e.getMessage());
        }
    }
   
    public boolean validarDatosPrendaRegistro(String descripcion, String codigo, String precioTexto, int cantidad) {
        if (descripcion == null || descripcion.trim().isEmpty() ||
            codigo == null || codigo.trim().isEmpty() ||
            precioTexto == null || precioTexto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay espacios en blanco, ¡verifique!",
                    "Error de registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (codigo.equals("000")) {
            JOptionPane.showMessageDialog(null, "El código '000' no es válido. Por favor, use un código diferente.",
                    "Código inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        for (Prenda p : listaPrendas) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                JOptionPane.showMessageDialog(null, "Ya existe una prenda con el código ingresado.",
                        "Código duplicado", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        try {
            double precio = Double.parseDouble(precioTexto);
            if (precio <= 0) throw new NumberFormatException();
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.",
                        "Cantidad inválida", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio válido mayor a cero.",
                    "Precio inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    public boolean validarDatosPrendaEdicion(String descripcion, String codigoNuevo, String codigoOriginal, String precioTexto, int cantidad) {
        if (descripcion == null || descripcion.trim().isEmpty() ||
            codigoNuevo == null || codigoNuevo.trim().isEmpty() ||
            precioTexto == null || precioTexto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hay espacios en blanco, ¡verifique!",
                    "Error de edición", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (codigoNuevo.equals("000")) {
            JOptionPane.showMessageDialog(null, "El código '000' no es válido.",
                    "Código inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!codigoNuevo.equalsIgnoreCase(codigoOriginal)) {
            for (Prenda p : listaPrendas) {
                if (p.getCodigo().equalsIgnoreCase(codigoNuevo)) {
                    JOptionPane.showMessageDialog(null, "Ya existe otra prenda con ese código.",
                            "Código duplicado", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        }
        try {
            double precio = Double.parseDouble(precioTexto);
            if (precio <= 0) throw new NumberFormatException();
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a cero.",
                        "Cantidad inválida", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un precio válido mayor a cero.",
                    "Precio inválido", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static Prenda obtenerPrendaPorCodigo(String codigo) {
        for (Prenda prenda : listaPrendas) {
            if (prenda.getCodigo().equals(codigo)) {
                return prenda;
            }
        }
        return null;
    }
    
    public boolean eliminarPrendaPorCodigo(String codigo) {
        Prenda prenda = obtenerPrendaPorCodigo(codigo);
        if (prenda != null) {
            listaPrendas.remove(prenda);
            guardarPrendasEnArchivo();
            return true;
        }
        return false;
    }

    public boolean editarPrenda(String codigo, String nuevaDescripcion, String nuevoDepartamento, String nuevaTalla, String nuevoColor, 
            int nuevaCantidad, double nuevoPrecio) {
        Prenda prenda = obtenerPrendaPorCodigo(codigo);
        if (prenda != null) {
            prenda.setDescripcion(nuevaDescripcion);
            prenda.setDepartamento(nuevoDepartamento);
            prenda.setTalla(nuevaTalla);
            prenda.setColor(nuevoColor);
            prenda.setCantidad(nuevaCantidad);
            prenda.setPrecio(nuevoPrecio);
            prenda.setTotal(nuevaCantidad * nuevoPrecio);
            guardarPrendasEnArchivo();
            return true;
        }
        return false;
    }
    
    public static boolean restarInventario(List<ItemCarrito> items) {
        cargarPrendasDesdeArchivo();
        for (ItemCarrito item : items) {
            Prenda prendaInventario = obtenerPrendaPorCodigo(item.getCodigo());
            if (prendaInventario == null || prendaInventario.getCantidad() < item.getCantidadSeleccionada()) {
                return false; // No hay suficiente stock o la prenda no existe
            }
        }
        for (ItemCarrito item : items) {
            for (Prenda p : listaPrendas) {
                if (p.getCodigo().equals(item.getCodigo())) {
                    int nuevaCantidad = p.getCantidad() - item.getCantidadSeleccionada();
                    p.setCantidad(nuevaCantidad);
                    break;
                }
            }
        }
        guardarPrendasEnArchivo();
        return true;
    }
}