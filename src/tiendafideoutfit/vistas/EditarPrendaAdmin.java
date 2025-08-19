package tiendafideoutfit.vistas;

import tiendafideoutfit.controladores.GestionPrenda;
import tiendafideoutfit.modelos.Prenda;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EditarPrendaAdmin extends javax.swing.JFrame {
    private JFrame ventanaInventarioAdmin;
    private Prenda prendaActual;
    
    public EditarPrendaAdmin(JFrame ventanaInventarioAdmin, Prenda prenda) {
        this.ventanaInventarioAdmin = ventanaInventarioAdmin;
        initComponents();
        this.prendaActual = prenda;
        setLocationRelativeTo(null); 
        setResizable(false);
        setTitle("Edición de Prenda");        
        jTextField1.setText(prenda.getDescripcion());
        jTextField2.setText(prenda.getCodigo());
        jTextField2.setEnabled(false);
        switch (prenda.getTalla()) {
            case "Small":
                jRadioButton1.setSelected(true);
                break;
            case "Medium":
                jRadioButton2.setSelected(true);
                break;
            case "Large":
                jRadioButton3.setSelected(true);
                break;
        }
        switch (prenda.getDepartamento()) {
            case "Hombre":
                jRadioButton4.setSelected(true);
                break;
            case "Mujer":
                jRadioButton5.setSelected(true);
                break;
        }
        jComboBox1.setSelectedItem(prenda.getColor());
        jSpinner1.setValue(prenda.getCantidad());
        jFormattedTextField2.setText(String.valueOf(prenda.getPrecio()));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jBotonEditar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jBotonVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripción: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Verde", "Amarillo", "Blanco", "Negro" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel2.setText("Adminitración de Inventario");

        jLabel3.setText("Departamento:");

        jLabel4.setText("Color: ");

        jLabel5.setText("Talla: ");

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setText("Small");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setText("Medium");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Large");

        jLabel6.setText("Cantidad:");

        jLabel7.setText("Código:");

        jLabel8.setText("Precio:");

        jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jBotonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBotonEditar.setText("Editar");
        jBotonEditar.setToolTipText("Agregar prendas");
        jBotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonEditarActionPerformed(evt);
            }
        });

        jLabel9.setText("colones");

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Hombre");

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Mujer");

        jBotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jBotonVolver.setText("Volver");
        jBotonVolver.setToolTipText("Volver al menú Administrador");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel10.setText("TIENDA FIDEOUTFIT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel2)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(24, 24, 24)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3)))))
                        .addContainerGap(266, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jBotonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButton5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonVolver)
                    .addComponent(jBotonEditar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonEditarActionPerformed
        String codigo = jTextField2.getText().trim();
        String descripcion = jTextField1.getText().trim();
        String talla = jRadioButton1.isSelected() ? "Small" :
                       jRadioButton2.isSelected() ? "Medim" : "Large";
        String departamento = jRadioButton4.isSelected() ? "Hombre" : "Mujer";
        String color = jComboBox1.getSelectedItem().toString();
        int cantidad = (int) jSpinner1.getValue();
        String precioTexto = jFormattedTextField2.getText().trim();

        if (!new GestionPrenda().validarDatosPrendaEdicion(descripcion, codigo, prendaActual.getCodigo(), precioTexto, cantidad)) {
            return;
        }
        double precio = Double.parseDouble(precioTexto);
        double total = precio * cantidad;

        prendaActual.setDescripcion(descripcion);
        prendaActual.setTalla(talla);
        prendaActual.setDepartamento(departamento);
        prendaActual.setColor(color);
        prendaActual.setCantidad(cantidad);
        prendaActual.setPrecio(precio);
        prendaActual.setTotal(total);
        new GestionPrenda().editarPrenda(
            prendaActual.getCodigo(),
            prendaActual.getDescripcion(),
            prendaActual.getDepartamento(),
            prendaActual.getTalla(),
            prendaActual.getColor(),
            prendaActual.getCantidad(),
            prendaActual.getPrecio()
            );
        JOptionPane.showMessageDialog(this, "¡Prenda actualizada correctamente!");
        ventanaInventarioAdmin.dispose();
        new InventarioAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonEditarActionPerformed
    
    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        new InventarioAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBotonEditar;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}