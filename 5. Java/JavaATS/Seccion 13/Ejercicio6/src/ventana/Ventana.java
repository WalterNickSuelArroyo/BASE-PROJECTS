/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.JOptionPane;

/**
 *
 * @author nicod
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        imagenUsuario = new javax.swing.JLabel();
        etiquetaUsuario = new javax.swing.JLabel();
        etiquetaContraseña = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        cajaContraseña = new javax.swing.JPasswordField();
        botonIniciarSesion = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 0, 204));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, 30));

        imagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/persona.png"))); // NOI18N
        panel.add(imagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 250, 250));

        etiquetaUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaUsuario.setText("Usuario:");
        panel.add(etiquetaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        etiquetaContraseña.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        etiquetaContraseña.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaContraseña.setText("Contraseña:");
        panel.add(etiquetaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        cajaUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaUsuarioActionPerformed(evt);
            }
        });
        panel.add(cajaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 170, 30));

        cajaContraseña.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        panel.add(cajaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 170, 30));

        botonIniciarSesion.setBackground(new java.awt.Color(0, 0, 255));
        botonIniciarSesion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonIniciarSesion.setText("Iniciar Sesión");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        panel.add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 433, 120, 30));

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        panel.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaUsuarioActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        String usuarioCorrecto = "nick";
        String contraseñaCorrecta = "programacion";
        
        if (usuarioCorrecto.equals(cajaUsuario.getText())) {
            String contraseña="";
            for (int i = 0; i < cajaContraseña.getPassword().length; i++) {
                contraseña+=cajaContraseña.getPassword()[i];
            }
            if (contraseñaCorrecta.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Ingresaste al sistema");
            }
            else{
                JOptionPane.showMessageDialog(null, "Error, contraseña desconocida");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, usuario desconocido");
        }
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JLabel etiquetaContraseña;
    private javax.swing.JLabel etiquetaUsuario;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel imagenUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
