package tiendafideoutfit.vistas;

import tiendafideoutfit.modelos.Prenda;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import tiendafideoutfit.controladores.GestionPrenda;

public class InventarioAdmin extends javax.swing.JFrame {
    GestionPrenda gestion = new GestionPrenda();
    
    public InventarioAdmin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Inventario de Prendas");
        configurarTabla(); 
        cargarTablaPrendas();
    }
    
    private void configurarTabla() {
        String[] columnas = {"Código", "Descripción", "Departamento", "Talla", "Color", "Cantidad", "Precio", "Editar", "Eliminar"};
        DefaultTableModel modelo = new DefaultTableModel(null, columnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 7 || column == 8; // Solo las columnas de botones son editables
            }
        };
        jTable1.setModel(modelo);
        jTable1.getColumn("Editar").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox(), jTable1, "Editar"));
        jTable1.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), jTable1, "Eliminar"));
    }
    
    private void cargarTablaPrendas() {
        gestion.cargarPrendasDesdeArchivo(); 
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de llenar
        for (Prenda p : GestionPrenda.listaPrendas) {
            Object[] fila = {
                p.getCodigo(),
                p.getDescripcion(),
                p.getDepartamento(),
                p.getTalla(),
                p.getColor(),
                p.getCantidad(),
                String.format("¢%.2f", p.getPrecio()),
                "Editar",
                "Eliminar"
            };
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBotonVolver = new javax.swing.JButton();
        jBotonAgregarPrenda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("TIENDA FIDEOUTFIT");

        jLabel2.setText("Prendas Disponibles:");

        jBotonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jBotonVolver.setText("Volver");
        jBotonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonVolverActionPerformed(evt);
            }
        });

        jBotonAgregarPrenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        jBotonAgregarPrenda.setText("Agregar Nueva Prenda");
        jBotonAgregarPrenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonAgregarPrendaActionPerformed(evt);
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
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBotonVolver)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBotonAgregarPrenda))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jBotonAgregarPrenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBotonVolver)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonVolverActionPerformed
        new Admin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonVolverActionPerformed

    private void jBotonAgregarPrendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonAgregarPrendaActionPerformed
        RegistroPrendasAdmin registro = new RegistroPrendasAdmin(this);
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonAgregarPrendaActionPerformed

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

        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected,int row, int column) {
            label = (value == null) ? "" : value.toString();
            button.setText(label);
            clicked = true;
            return button;
        }

        public Object getCellEditorValue() {
            if (clicked) {
                String codigo = table.getValueAt(table.getSelectedRow(), 0).toString();
                Prenda prenda = gestion.obtenerPrendaPorCodigo(codigo);
                if (action.equals("Editar")) {
                    EditarPrendaAdmin editar = new EditarPrendaAdmin(InventarioAdmin.this, prenda);
                    editar.setVisible(true);
                    dispose();
                } else if (action.equals("Eliminar")) {
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar la prenda?", "Confirmación", 
                            JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        gestion.eliminarPrendaPorCodigo(codigo);
                        cargarTablaPrendas();
                        JOptionPane.showMessageDialog(null, "Prenda eliminada exitosamente.");
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
    private javax.swing.JButton jBotonAgregarPrenda;
    private javax.swing.JButton jBotonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}