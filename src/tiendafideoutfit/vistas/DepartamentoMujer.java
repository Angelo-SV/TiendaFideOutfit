package tiendafideoutfit.vistas;

import tiendafideoutfit.controladores.GestionPrenda;
import tiendafideoutfit.modelos.Prenda;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import tiendafideoutfit.controladores.GestionCarrito;
import tiendafideoutfit.modelos.ItemCarrito;

public class DepartamentoMujer extends javax.swing.JFrame {
    private List<Prenda> prendasDisponiblesMujer;
    private List<ItemCarrito> carrito = new ArrayList<>();
    
    public DepartamentoMujer() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Departamento para Mujer");
        cargarPrendasMujerDesdeArchivo();
        configurarDropdown(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBotonAgregarCarrito = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jBotonVerCarrito = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("TIENDA FIDEOUTFIT");

        jLabel2.setText("Departamento de Mujer");

        jBotonAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carrito-de-compras.png"))); // NOI18N
        jBotonAgregarCarrito.setText("Agregar al Carrito");
        jBotonAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAgregarCarritoActionPerformed(evt);
            }
        });

        jBotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jBotonVolver.setText("Volver");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        jLabel4.setText("Talla:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Small");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Medium");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Large");

        jLabel5.setText("Color:");

        jLabel6.setText("Cantidad: ");

        jLabel3.setText("Prenda: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blusa", "Vestido", "Falda", "Abrigo", "Tacones", "Ropa Interior" }));

        jLabel7.setText("Precio:");

        jLabel9.setText("Disponibles:");

        jLabel10.setText("jLabel10");

        jBotonVerCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/comprar.png"))); // NOI18N
        jBotonVerCarrito.setText("Ver Carrito");
        jBotonVerCarrito.setToolTipText("Carrito");
        jBotonVerCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVerCarritoActionPerformed(evt);
            }
        });

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jRadioButton1)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jRadioButton2)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBotonVerCarrito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotonAgregarCarrito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotonVolver)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButton1)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton3))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonAgregarCarrito)
                    .addComponent(jBotonVolver)
                    .addComponent(jBotonVerCarrito))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void cargarPrendasMujerDesdeArchivo() {
        GestionPrenda gestion = new GestionPrenda();
        gestion.cargarPrendasDesdeArchivo();
        prendasDisponiblesMujer = GestionPrenda.listaPrendas.stream()
            .filter(p -> p.getDepartamento().equalsIgnoreCase("Mujer") && p.getCantidad() > 0)
            .collect(Collectors.toList());
        jComboBox2.removeAllItems();
        for (Prenda p : prendasDisponiblesMujer) {
            jComboBox2.addItem(p.getDescripcion());
        }
        if (prendasDisponiblesMujer.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Actualmente no hay prendas disponibles en este departamento.", "Sin stock", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void configurarDropdown() {
        jComboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualizarDatosSegunPrenda();
                }
            }
        });
        if (jComboBox2.getItemCount() > 0) {
            jComboBox2.setSelectedIndex(0);
            actualizarDatosSegunPrenda();
        }
    }
    
    private void actualizarDatosSegunPrenda() {
        String prendaSeleccionada = jComboBox2.getSelectedItem().toString();
        Prenda prenda = prendasDisponiblesMujer.stream()
            .filter(p -> p.getDescripcion().equalsIgnoreCase(prendaSeleccionada))
            .findFirst().orElse(null);
        if (prenda != null) {
            jLabel12.setText("¢" + prenda.getPrecio());
            jLabel11.setText(prenda.getColor());
            jLabel10.setText(String.valueOf(prenda.getCantidad()));
            actualizarTallas(prenda.getTalla());
            actualizarCantidadMaxima(prenda.getCantidad());
        }
    }

    private void actualizarTallas(String talla) {
        jRadioButton1.setEnabled(false);
        jRadioButton2.setEnabled(false);
        jRadioButton3.setEnabled(false);
        switch (talla) {
            case "Small":
                jRadioButton1.setSelected(true);
                jRadioButton1.setEnabled(true);
                break;
            case "Medium":
                jRadioButton2.setSelected(true);
                jRadioButton2.setEnabled(true);
                break;
            case "Large":
                jRadioButton3.setSelected(true);
                jRadioButton3.setEnabled(true);
                break;
        }
    }

    private void actualizarCantidadMaxima(int max) {
        SpinnerNumberModel model = new SpinnerNumberModel(0, 0, max, 1);
        jSpinner1.setModel(model);
    }
    
    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        new VistaCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jBotonAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAgregarCarritoActionPerformed
        if (jComboBox2.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "No hay prendas disponibles.");
        return;
        }
        String descripcion = jComboBox2.getSelectedItem().toString();
        Prenda prendaSeleccionada = prendasDisponiblesMujer.stream()
            .filter(p -> p.getDescripcion().equalsIgnoreCase(descripcion))
            .findFirst().orElse(null);
        if (prendaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Prenda no encontrada.");
            return;
        }
        int cantidadSeleccionada = (int) jSpinner1.getValue();
        if (cantidadSeleccionada <= 0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar al menos una unidad.");
            return;
        }
        if (cantidadSeleccionada > prendaSeleccionada.getCantidad()) {
            JOptionPane.showMessageDialog(this, "No hay suficiente stock disponible.");
            return;
        }
        // Clonar la prenda para no alterar el inventario
        Prenda copia = new Prenda();
        copia.setDescripcion(prendaSeleccionada.getDescripcion());
        copia.setCodigo(prendaSeleccionada.getCodigo());
        copia.setColor(prendaSeleccionada.getColor());
        copia.setDepartamento(prendaSeleccionada.getDepartamento());
        copia.setTalla(prendaSeleccionada.getTalla());
        copia.setPrecio(prendaSeleccionada.getPrecio());
        GestionCarrito.agregarItem(prendaSeleccionada, cantidadSeleccionada);
        JOptionPane.showMessageDialog(this, "¡La prenda fue agregada al carrito!");
        // Actualizar cantidad disponible en inventario temporalmente
        prendaSeleccionada.setCantidad(prendaSeleccionada.getCantidad() - cantidadSeleccionada);
        actualizarDatosSegunPrenda();
    }//GEN-LAST:event_jBotonAgregarCarritoActionPerformed

    private void jBotonVerCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVerCarritoActionPerformed
        if (GestionCarrito.getItemsCarrito().isEmpty()) {
        JOptionPane.showMessageDialog(this, "El carrito está vacío.", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            new VistaCarrito(this).setVisible(true);
        }
    }//GEN-LAST:event_jBotonVerCarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBotonAgregarCarrito;
    private javax.swing.JButton jBotonVerCarrito;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}