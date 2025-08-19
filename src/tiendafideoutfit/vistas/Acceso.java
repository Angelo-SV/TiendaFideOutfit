package tiendafideoutfit.vistas;

import java.awt.event.KeyEvent; //Librería de control de teclas
import java.io.File;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {
    private int intentos = 0;//Contador de intentos para el inicio de sesión
    private JFrame ventanaInicio; //Referencia de la ventana inicio
    
    public Acceso(JFrame ventanaInicio) {
        this.ventanaInicio = ventanaInicio;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false); 
        setTitle("Inicio de Sesión"); 
        jTextField1.requestFocus();
    }
        
    public boolean autenticarUsuarioDesdeArchivo(String usuarioIngresado, String contraseñaIngresada) {
        File archivo = new File("Datos/usuariosAdmin.txt");
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(this, "No se encontró el archivo de usuarios.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();
                String[] partes = linea.split(":");
                if (partes.length == 2) {
                    String usuarioArchivo = partes[0].trim();
                    String contraseñaArchivo = partes[1].trim();
                    if (usuarioArchivo.equals(usuarioIngresado) && contraseñaArchivo.equals(contraseñaIngresada)) {
                        return true;
                    }
                }
            }
        } catch (Exception e) {            
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return false;
    }
    
    public void validaUsuarioArchivo() {
        String usuario = jTextField1.getText();
        String contraseña = jPasswordField1.getText();
        if (autenticarUsuarioDesdeArchivo(usuario, contraseña)) {
            new Admin().setVisible(true);
            this.dispose();
                if (ventanaInicio != null) {
                    ventanaInicio.dispose();
                }
        } else {
            intentos++;
            JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos, inténtelo de nuevo.",
                    "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jPasswordField1.setText("");
            jTextField1.requestFocus();
            if (intentos == 3) {
                JOptionPane.showMessageDialog(this, "Intentos permitidos agotados, el programa se cerrará");
                System.exit(0);
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jBotonIngresar = new javax.swing.JButton();
        jBotonCancelar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jBotonIngresar.setText("Iniciar Sesión");
        jBotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIngresarActionPerformed(evt);
            }
        });

        jBotonCancelar.setText("Cancelar");
        jBotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCancelarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Aharoni", 0, 20)); // NOI18N
        jLabel3.setText("TIENDA FIDEOUTFIT");

        jCheckBox1.setText("Mostrar Contraseña");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jCheckBox1)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBotonIngresar)
                .addGap(18, 18, 18)
                .addComponent(jBotonCancelar)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonIngresar)
                    .addComponent(jBotonCancelar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jBotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIngresarActionPerformed
        validaUsuarioArchivo();
    }//GEN-LAST:event_jBotonIngresarActionPerformed

    private void jBotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBotonCancelarActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if(jCheckBox1.isSelected()){
        jPasswordField1.setEchoChar((char) 0);//Muestra la contraseña en texto plano
        } else {
        jPasswordField1.setEchoChar('•');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {                                       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           jPasswordField1.requestFocus();
        }
    } 

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {                                       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           jBotonIngresar.requestFocus();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonCancelar;
    private javax.swing.JButton jBotonIngresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}