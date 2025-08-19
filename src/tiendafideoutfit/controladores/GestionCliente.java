package tiendafideoutfit.controladores;

import tiendafideoutfit.modelos.Cliente;
import java.awt.Component;
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
import javax.swing.JOptionPane;

public class GestionCliente{
    static ArrayList<Cliente> listaClientes = new  ArrayList<>();
    private static final String FILE_PATH = "Datos/clientes.txt";
    
    public void guardarClientesEnArchivo() {
        File archivo = new File(FILE_PATH);
        // Asegura que el directorio exista
        archivo.getParentFile().mkdirs();
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(archivo), StandardCharsets.UTF_8))) {
            for (Cliente cliente : listaClientes) {
                writer.write(String.join("|",
                        cliente.getNombre(),
                        cliente.getApellido(),
                        cliente.getCedula(),
                        cliente.getCorreo(),
                        cliente.getTelefono(),
                        cliente.getDireccion()
                ));
                writer.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar clientes: " + e.getMessage());
        }
    }
    
    public void agregarCliente(String nombre, String apellido, String cedula, String correo, String telefono, String direccion){
        Cliente clientes = new Cliente();
        clientes.setNombre(nombre);
        clientes.setApellido(apellido);
        clientes.setCedula(cedula);
        clientes.setCorreo(correo);
        clientes.setTelefono(telefono);
        clientes.setDireccion(direccion);
        listaClientes.add(clientes);
        guardarClientesEnArchivo();
    }
    
    public void cargarClientesDesdeArchivo() {
        listaClientes.clear();
        File archivo = new File(FILE_PATH);
        if (!archivo.exists()) return;
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(archivo), StandardCharsets.UTF_8))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split("\\|");
                if (datos.length == 6) {
                    Cliente cliente = new Cliente();
                    cliente.setNombre(datos[0]);
                    cliente.setApellido(datos[1]);
                    cliente.setCedula(datos[2]);
                    cliente.setCorreo(datos[3]);
                    cliente.setTelefono(datos[4]);
                    cliente.setDireccion(datos[5]);
                    listaClientes.add(cliente);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar clientes: " + e.getMessage());
        }
    }
    
    public String mostrarClientes() {
        cargarClientesDesdeArchivo();  
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%-12s %-12s %-12s %-28s %-12s %-20s\n",
                "Nombre", "Apellido", "Cédula", "Correo", "Teléfono", "Dirección"));
        sb.append("--------------------------------------------------------------------------------------------------------\n");
        for (Cliente c : listaClientes) {
            sb.append(String.format("%-12s %-12s %-12s %-28s %-12s %-20s\n",
                    c.getNombre(), c.getApellido(), c.getCedula(),
                    c.getCorreo(), c.getTelefono(), c.getDireccion()));
        }
        return sb.toString();
    }
    
    public Cliente buscarClientePorCedula(String cedula) {
    cargarClientesDesdeArchivo(); 
        for (Cliente cliente : listaClientes) {
            if (cliente.getCedula().equals(cedula)) {
                return cliente;
            }
        }
        return null;
    }
    
    public void actualizarCliente(Cliente clienteActualizado) {
    cargarClientesDesdeArchivo();
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCedula().equals(clienteActualizado.getCedula())) {
                listaClientes.set(i, clienteActualizado);
                break;
            }
        }
        guardarClientesEnArchivo();
    }
    
    public boolean validarCampos(String nombre, String apellido, String cedula, String correo, String telefono, String direccion, 
            Component parent) {
        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty()
                || correo.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {
            JOptionPane.showMessageDialog(parent, "Existen espacios en blanco, por favor verifique.", "Error de registro", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!correo.contains("@") || !correo.endsWith(".com")) {
            JOptionPane.showMessageDialog(parent, "El correo electrónico es inválido .",
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!cedula.matches("\\d-\\d{4}-\\d{4}")) {
            JOptionPane.showMessageDialog(parent, "Cédula inválida. Formato esperado: 1-2345-6789.",
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!telefono.matches("\\d{4}-\\d{4}")) {
            JOptionPane.showMessageDialog(parent, "Teléfono inválido. Formato esperado: 1234-5678.",
                    "Error de validación", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}