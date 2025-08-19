package tiendafideoutfit.vistas;

import tiendafideoutfit.controladores.GestionPedido;
import tiendafideoutfit.vistas.Admin;
import java.awt.Component;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import tiendafideoutfit.modelos.ResumenPedido;

public class PedidosAdmin extends javax.swing.JFrame {
    public PedidosAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Lista de Pedidos");
        configurarTabla();
        cargarTablaPedidos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("TIENDA FIDEOUTFIT");

        jLabel2.setText("Lista de pedidos:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarTabla() {
        String[] columnas = {"Factura", "Fecha", "Cliente", "Total", "Detalles"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 4;
            }
        };
        jTable1.setModel(modelo);
        jTable1.getColumn("Detalles").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Detalles").setCellEditor(new ButtonEditor(new JCheckBox(), jTable1, "Ver") {
            @Override
            public void onClick(int row) {
                int factura = (int) jTable1.getValueAt(row, 0);
                String detalle = GestionPedido.obtenerDetallePedido(factura);
                DetallePedido ventanaDetalle = new DetallePedido(detalle);
                ventanaDetalle.setVisible(true);
            }
        });
    }

    private void cargarTablaPedidos() {
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        List<ResumenPedido> resumenes = GestionPedido.obtenerResumenPedidos();
        for (ResumenPedido pedido : resumenes) {
            Object[] fila = {
                pedido.getNumero(),
                pedido.getFecha(),
                pedido.getCliente(),
                String.format("¢%.2f", pedido.getTotal()),
                "Ver"
            };
            modelo.addRow(fila);
        }
    }
    
    class ButtonRenderer extends JButton implements TableCellRenderer {
        public ButtonRenderer() {
            setOpaque(true);
        }
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                       boolean hasFocus, int row, int column) {
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
            button.addActionListener(e -> {
                fireEditingStopped();
                int row = table.getSelectedRow();
                onClick(row);
            });
        }

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            clicked = false;
            return label;
        }

        public boolean stopCellEditing() {
            clicked = false;
            return super.stopCellEditing();
        }

        public void onClick(int row) {}
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}