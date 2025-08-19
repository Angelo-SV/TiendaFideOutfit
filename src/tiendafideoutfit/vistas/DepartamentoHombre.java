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

public class DepartamentoHombre extends javax.swing.JFrame {
    private List<Prenda> prendasDisponiblesHombre;
    private List<ItemCarrito> carrito = new ArrayList<>();
    
    public DepartamentoHombre() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Departamento para Hombre");
        cargarPrendasHombreDesdeArchivo();
        configurarDropdown();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jBotonAgregarCarrito = new javax.swing.JButton();
        jBotonVolver = new javax.swing.JButton();
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

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Camisa", "Pantalon", "Saco", "Abrigo", "Zapatos", "Ropa Interior" }));

        jLabel2.setText("Departamento para Hombre");

        jLabel3.setText("Prenda: ");

        jLabel4.setText("Color:");

        jLabel5.setText("Talla:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Small");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Medium");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Large");

        jLabel6.setText("Cantidad: ");

        jBotonAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carrito-de-compras.png"))); // NOI18N
        jBotonAgregarCarrito.setText("Agregar al carrito");
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

        jLabel7.setText("Precio: ");

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
                        .addGap(126, 126, 126)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton1)
                                .addGap(10, 10, 10)
                                .addComponent(jRadioButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addComponent(jRadioButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonVerCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonAgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonVolver)))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonAgregarCarrito)
                    .addComponent(jBotonVolver)
                    .addComponent(jBotonVerCarrito))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPrendasHombreDesdeArchivo() {
        GestionPrenda gestion = new GestionPrenda();
        gestion.cargarPrendasDesdeArchivo();
        prendasDisponiblesHombre = GestionPrenda.listaPrendas.stream()
            .filter(p -> p.getDepartamento().equalsIgnoreCase("Hombre") && p.getCantidad() > 0)
            .collect(Collectors.toList());
        jComboBox1.removeAllItems();
        for (Prenda p : prendasDisponiblesHombre) {
            jComboBox1.addItem(p.getDescripcion());
        }      
        if (prendasDisponiblesHombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Actualmente no hay prendas disponibles en este departamento.", "Sin stock", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void configurarDropdown() {
        jComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    actualizarDatosSegunPrenda();
                }
            }
        });
        if (jComboBox1.getItemCount() > 0) {
            jComboBox1.setSelectedIndex(0);
            actualizarDatosSegunPrenda();
        }
    }
    
    private void actualizarDatosSegunPrenda() {
        String prendaSeleccionada = jComboBox1.getSelectedItem().toString();
        Prenda prenda = prendasDisponiblesHombre.stream()
            .filter(p -> p.getDescripcion().equalsIgnoreCase(prendaSeleccionada))
            .findFirst().orElse(null);
        if (prenda != null) {
            jLabel11.setText("¢" + prenda.getPrecio());
            jLabel12.setText(prenda.getColor());
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
        if (jComboBox1.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, "No hay prendas disponibles.");
        return;
        }
        String descripcion = jComboBox1.getSelectedItem().toString();
        Prenda prendaSeleccionada = prendasDisponiblesHombre.stream()
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
    private javax.swing.JComboBox<String> jComboBox1;
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