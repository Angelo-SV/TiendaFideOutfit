package tiendafideoutfit.vistas;

import tiendafideoutfit.modelos.ItemCarrito;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import tiendafideoutfit.controladores.GestionCarrito;

public class VistaCarrito extends javax.swing.JFrame {
    private JFrame ventanaOrigen;
    
    public VistaCarrito(JFrame ventanaOrigen) {
        this.ventanaOrigen = ventanaOrigen;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Carrito de Compras");
        configurarTabla(); 
        cargarTablaCarrito(); 
    }
    
    private void configurarTabla() {
        String[] columnas = {"Código", "Descripción", "Departamento", "Talla", "Color", "Cantidad", "Precio", "Total", "Eliminar"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 8; // Solo la columna "Eliminar" es editable
            }
        };
        jTable1.setModel(modelo);
        jTable1.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), jTable1, "Eliminar"));
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
                "Eliminar"
            };
            modelo.addRow(fila);
        }
        double totalCarrito = GestionCarrito.getTotalCarrito();
        jLabel4.setText("Total del carrito: ¢" + String.format("%.2f", totalCarrito));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        jBotonAgregarMasPrendas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jBotonVaciarCarrito = new javax.swing.JButton();
        jBotonFinalizarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("Carrito de Compras");

        jLabel2.setText("Prendas Añadidas:");

        jBotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jBotonVolver.setText("Cerrar");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        jBotonAgregarMasPrendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/carrito-de-compras.png"))); // NOI18N
        jBotonAgregarMasPrendas.setText("Agregar más prendas");
        jBotonAgregarMasPrendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAgregarMasPrendasActionPerformed(evt);
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

        jLabel4.setText("jLabel4");

        jBotonVaciarCarrito.setText("Vaciar el Carrito");
        jBotonVaciarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVaciarCarritoActionPerformed(evt);
            }
        });

        jBotonFinalizarCompra.setText("Finalizar Compra");
        jBotonFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonFinalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonFinalizarCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonVaciarCarrito)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotonVolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBotonAgregarMasPrendas))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jBotonAgregarMasPrendas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonVolver)
                    .addComponent(jLabel4)
                    .addComponent(jBotonVaciarCarrito)
                    .addComponent(jBotonFinalizarCompra))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jBotonAgregarMasPrendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAgregarMasPrendasActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBotonAgregarMasPrendasActionPerformed

    private void jBotonVaciarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVaciarCarritoActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this,"¿Está seguro que desea eliminar todos los items del carrito?", "Confirmación",
        JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            GestionCarrito.limpiarCarrito();
            cargarTablaCarrito();
            jLabel4.setText("Total del carrito: ¢0.00");
            JOptionPane.showMessageDialog(this, "Carrito vaciado exitosamente.");
        }
    }//GEN-LAST:event_jBotonVaciarCarritoActionPerformed

    private void jBotonFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonFinalizarCompraActionPerformed
        if (ventanaOrigen != null) {
        ventanaOrigen.dispose();
        }
        new ConfirmacionCompra().setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_jBotonFinalizarCompraActionPerformed

    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }
    
    class ButtonEditor extends DefaultCellEditor {
        private JButton button;
        private String label;
        private boolean clicked;
        private JTable table;
        private String action;

        public ButtonEditor(JCheckBox checkBox, JTable table, String action) {
            super(checkBox);
            this.table = table;
            this.action = action;
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(e -> fireEditingStopped());
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                String codigo = table.getValueAt(table.getSelectedRow(), 0).toString();
                if ("Eliminar".equals(action)) {
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la prenda del carrito?", "Confirmación", 
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        GestionCarrito.eliminarItemPorCodigo(codigo);
                        // Esperar a que termine el editor antes de recargar la tabla
                        SwingUtilities.invokeLater(() -> {
                            cargarTablaCarrito();
                            JOptionPane.showMessageDialog(null, "Prenda eliminada del carrito.");
                        });
                    }
                }
            }
            clicked = false;
            return label;
        }
        
        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonAgregarMasPrendas;
    private javax.swing.JButton jBotonFinalizarCompra;
    private javax.swing.JButton jBotonVaciarCarrito;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}