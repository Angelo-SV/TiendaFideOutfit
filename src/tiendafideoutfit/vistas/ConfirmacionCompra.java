package tiendafideoutfit.vistas;

import tiendafideoutfit.controladores.GestionCarrito;
import tiendafideoutfit.modelos.ItemCarrito;
import tiendafideoutfit.controladores.GestionCliente;
import tiendafideoutfit.modelos.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tiendafideoutfit.controladores.GestionPedido;

public class ConfirmacionCompra extends javax.swing.JFrame {
    public ConfirmacionCompra() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Confirmación de Compra");
        setCamposFormularioHabilitados(false);
        configurarTabla(); 
        cargarTablaCarrito(); 
    }

    public void limpiarFormulario(){
        jTextField1.setText("");
        jTextField2.setText("");
        jFormattedTextField2.setText("");
        jTextField4.setText("");
        jFormattedTextField1.setText("");
        jTextArea1.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jBotonComprar = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jBotonBuscarCedula = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBotonLimpiarFormulario = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("TIENDA FIDEOUTFIT");

        jLabel2.setText("Completa los datos para finalizar tu compra:");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("Apellido: ");

        jLabel5.setText("Cédula:");

        jLabel6.setText("Dirección:");

        jLabel7.setText("Correo Electrónico: ");

        jLabel8.setText("Teléfono: ");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jBotonComprar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/comprar.png"))); // NOI18N
        jBotonComprar.setText("Comprar");
        jBotonComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonComprarActionPerformed(evt);
            }
        });

        jBotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jBotonVolver.setText("Volver");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        try {
            jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });

        jBotonBuscarCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jBotonBuscarCedula.setText("Buscar por cédula");
        jBotonBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonBuscarCedulaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jBotonLimpiarFormulario.setText("Limpiar Formluario");
        jBotonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonLimpiarFormularioActionPerformed(evt);
            }
        });

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBotonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3))
                                    .addGap(18, 18, 18))
                                .addComponent(jBotonLimpiarFormulario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBotonBuscarCedula))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonBuscarCedula))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonLimpiarFormulario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonVolver)
                    .addComponent(jBotonComprar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void setCamposFormularioHabilitados(boolean habilitar) {
        jTextField1.setEnabled(habilitar); // Nombre
        jTextField2.setEnabled(habilitar); // Apellido
        jFormattedTextField2.setEnabled(false); // Cédula (no editable)
        jTextField4.setEnabled(habilitar); // Correo
        jFormattedTextField1.setEnabled(habilitar); // Teléfono
        jTextArea1.setEnabled(habilitar); // Dirección
        jBotonLimpiarFormulario.setEnabled(habilitar);
    }

    private void configurarTabla() {
        String[] columnas = {"Código", "Descripción", "Departamento", "Talla", "Color", "Cantidad", "Precio", "Total"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {};
        jTable1.setModel(modelo);
    }
    
    private void cargarTablaCarrito() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de llenar
        for (ItemCarrito item : GestionCarrito.getItemsCarrito()) {
            Object[] fila = {
                item.getCodigo(),
                item.getDescripcion(),
                item.getDepartamento(),
                item.getTalla(),
                item.getColor(),
                item.getCantidad(),
                String.format("¢%.2f", item.getPrecio()),
                String.format("¢%.2f", item.getTotal()),
            };
            modelo.addRow(fila);
            double totalCarrito = GestionCarrito.getTotalCarrito();
            jLabel9.setText("Total del carrito: ¢" + String.format("%.2f", totalCarrito));
        }
    }
        
    private void jBotonComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonComprarActionPerformed
        String nombre = jTextField1.getText().trim();
        String apellido = jTextField2.getText().trim();
        String cedula = jFormattedTextField2.getText().trim();
        String correo = jTextField4.getText().trim();
        String telefono = jFormattedTextField1.getText().trim();
        String direccion = jTextArea1.getText().trim();

        Cliente cliente = new Cliente(nombre, apellido, cedula, correo, telefono, direccion);
        double total = GestionCarrito.getTotalCarrito();
        List<ItemCarrito> items = GestionCarrito.getItemsCarrito();
        if (items.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El carrito está vacío. No se puede completar la compra.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean exito = GestionPedido.registrarPedido(cliente, items, total, this);
        if (exito) {
            this.dispose();
        }
    }//GEN-LAST:event_jBotonComprarActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        new VistaCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void jBotonBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonBuscarCedulaActionPerformed
        String cedulaBuscada = jFormattedTextField3.getText().trim();

        GestionCliente gestion = new GestionCliente();
        Cliente clienteEncontrado = gestion.buscarClientePorCedula(cedulaBuscada);

        if (clienteEncontrado != null) {
            jTextField1.setText(clienteEncontrado.getNombre());
            jTextField2.setText(clienteEncontrado.getApellido());
            jFormattedTextField2.setText(clienteEncontrado.getCedula());
            jTextField4.setText(clienteEncontrado.getCorreo());
            jFormattedTextField1.setText(clienteEncontrado.getTelefono());
            jTextArea1.setText(clienteEncontrado.getDireccion());
            setCamposFormularioHabilitados(false);
            JOptionPane.showMessageDialog(this, "Cliente encontrado. Datos cargados.");
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado. Ingrese los datos para registrarlo.");
            setCamposFormularioHabilitados(true);
            jFormattedTextField2.setText(cedulaBuscada);
        }
    }//GEN-LAST:event_jBotonBuscarCedulaActionPerformed

    private void jBotonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonLimpiarFormularioActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_jBotonLimpiarFormularioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonBuscarCedula;
    private javax.swing.JButton jBotonComprar;
    private javax.swing.JButton jBotonLimpiarFormulario;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}