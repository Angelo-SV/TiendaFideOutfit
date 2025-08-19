package tiendafideoutfit.vistas;

import tiendafideoutfit.controladores.GestionPrenda;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RegistroPrendasAdmin extends javax.swing.JFrame {
    private JFrame ventanaInventarioAdmin; 
    
    public RegistroPrendasAdmin(JFrame ventanaInventarioAdmin) {
        this.ventanaInventarioAdmin = ventanaInventarioAdmin;
        initComponents();
        setLocationRelativeTo(null); 
        setResizable(false); 
        setTitle("Añadir nueva Prenda"); 
        limpiarFormularioInventario(); 
    }
    
    public void limpiarFormularioInventario(){
        jTextField1.requestFocus();
        jTextField1.setText("");
        jRadioButton1.setSelected(true);
        jRadioButton4.setSelected(true);
        jComboBox1.setSelectedIndex(0);
        jSpinner1.setValue(0);
        jTextField2.setText("000");
        jFormattedTextField2.setText("0.0");
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
        jBotonAgregarPrenda = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jTextField2 = new javax.swing.JTextField();
        jBotonVolver = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jBotonLimpiarFormulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Descripción: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Rojo", "Verde", "Amarillo", "Blanco", "Negro" }));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel2.setText("Administración de Inventario");

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

        jBotonAgregarPrenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        jBotonAgregarPrenda.setText("Agregar");
        jBotonAgregarPrenda.setToolTipText("Agregar prendas");
        jBotonAgregarPrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAgregarPrendaActionPerformed(evt);
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

        jBotonLimpiarFormulario.setText("Limpiar Formulario");
        jBotonLimpiarFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonLimpiarFormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBotonLimpiarFormulario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBotonAgregarPrenda, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9)
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton5))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel10)))
                .addGap(0, 20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonVolver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBotonAgregarPrenda)
                        .addComponent(jBotonLimpiarFormulario)))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBotonAgregarPrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAgregarPrendaActionPerformed
        String descripcion = jTextField1.getText().trim();
        String codigo = jTextField2.getText().trim();
        String precioTexto = jFormattedTextField2.getText().trim();
        int cantidad = (int) jSpinner1.getValue();

        GestionPrenda gestion = new GestionPrenda();
        if (!gestion.validarDatosPrendaRegistro(descripcion, codigo, precioTexto, cantidad)) {
            return;
        }

        String departamento = jRadioButton4.isSelected() ? "Hombre" :
                              jRadioButton5.isSelected() ? "Mujer" : "";
        String talla = jRadioButton1.isSelected() ? "Small" :
                       jRadioButton2.isSelected() ? "Medium" :
                       jRadioButton3.isSelected() ? "Large" : "";
        String color = jComboBox1.getSelectedItem().toString();
        double precio = Double.parseDouble(precioTexto);
        double total = cantidad * precio;

        gestion.agregarPrendas(descripcion, departamento, talla, color, codigo, cantidad, precio, total);
        JOptionPane.showMessageDialog(this, "¡La prenda fue agregada correctamente!", "Datos guardados", JOptionPane.INFORMATION_MESSAGE);
        limpiarFormularioInventario();
    }//GEN-LAST:event_jBotonAgregarPrendaActionPerformed

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        new InventarioAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    private void jBotonLimpiarFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonLimpiarFormularioActionPerformed
        limpiarFormularioInventario();
    }//GEN-LAST:event_jBotonLimpiarFormularioActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JButton jBotonAgregarPrenda;
    private javax.swing.JButton jBotonLimpiarFormulario;
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