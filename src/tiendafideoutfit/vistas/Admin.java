package tiendafideoutfit.vistas;

public class Admin extends javax.swing.JFrame {
    
    public Admin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Pefil Administrador");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBotonInventario = new javax.swing.JButton();
        jBotonClientes = new javax.swing.JButton();
        jBotonPedidos = new javax.swing.JButton();
        jBotonSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel1.setText("TIENDA FIDEOUTFIT");

        jLabel2.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel2.setText("Perfil Administrador");

        jBotonInventario.setBackground(new java.awt.Color(255, 255, 255));
        jBotonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.jpg"))); // NOI18N
        jBotonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonInventarioActionPerformed(evt);
            }
        });

        jBotonClientes.setBackground(new java.awt.Color(255, 255, 255));
        jBotonClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        jBotonClientes.setToolTipText("Clientes");
        jBotonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonClientesActionPerformed(evt);
            }
        });

        jBotonPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jBotonPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedido.jpg"))); // NOI18N
        jBotonPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonPedidosActionPerformed(evt);
            }
        });

        jBotonSalir.setText("Cerrar Sesión");
        jBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Inventario");

        jLabel5.setText("Clientes");

        jLabel6.setText("Pedidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2)))))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jBotonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBotonClientes)
                        .addGap(28, 28, 28)
                        .addComponent(jBotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 62, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel3)
                .addGap(117, 117, 117)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBotonClientes)
                    .addComponent(jBotonPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addComponent(jBotonSalir)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBotonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonInventarioActionPerformed
        new InventarioAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonInventarioActionPerformed
    
    private void jBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonSalirActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonSalirActionPerformed

    private void jBotonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonClientesActionPerformed
        new ClientesAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonClientesActionPerformed

    private void jBotonPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonPedidosActionPerformed
        new PedidosAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jBotonPedidosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonClientes;
    private javax.swing.JButton jBotonInventario;
    private javax.swing.JButton jBotonPedidos;
    private javax.swing.JButton jBotonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}