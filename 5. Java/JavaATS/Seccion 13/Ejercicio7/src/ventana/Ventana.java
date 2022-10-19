/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        imagenPelicula1 = new javax.swing.JLabel();
        tituloPelicula1 = new javax.swing.JLabel();
        generoPelicula1 = new javax.swing.JLabel();
        imagenPelicula2 = new javax.swing.JLabel();
        tituloPelicula2 = new javax.swing.JLabel();
        generoPelicula2 = new javax.swing.JLabel();
        imagenPelicula3 = new javax.swing.JLabel();
        tituloPelicula3 = new javax.swing.JLabel();
        generoPelicula3 = new javax.swing.JLabel();
        imagenPelicula4 = new javax.swing.JLabel();
        tituloPelicula4 = new javax.swing.JLabel();
        generoPelicula4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peliculas para Programadores");

        panel.setLayout(new java.awt.GridBagLayout());

        imagenPelicula1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mark.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenPelicula1, gridBagConstraints);

        tituloPelicula1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tituloPelicula1.setText("Título: La Red Social");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloPelicula1, gridBagConstraints);

        generoPelicula1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        generoPelicula1.setText("Género: Drama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panel.add(generoPelicula1, gridBagConstraints);

        imagenPelicula2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jobs.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenPelicula2, gridBagConstraints);

        tituloPelicula2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tituloPelicula2.setText("Título: Jobs");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(tituloPelicula2, gridBagConstraints);

        generoPelicula2.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        generoPelicula2.setText("Género: Cine Biográfico - Drama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(generoPelicula2, gridBagConstraints);

        imagenPelicula3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cientifico.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenPelicula3, gridBagConstraints);

        tituloPelicula3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tituloPelicula3.setText("Título: Código Enigma");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloPelicula3, gridBagConstraints);

        generoPelicula3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        generoPelicula3.setText("Género: Drama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panel.add(generoPelicula3, gridBagConstraints);

        imagenPelicula4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/becarios.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 0);
        panel.add(imagenPelicula4, gridBagConstraints);

        tituloPelicula4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        tituloPelicula4.setText("Título: Aprendices fuera de Linea");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloPelicula4, gridBagConstraints);

        generoPelicula4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        generoPelicula4.setText("Género: Drama - Comedia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 0);
        panel.add(generoPelicula4, gridBagConstraints);

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel generoPelicula1;
    private javax.swing.JLabel generoPelicula2;
    private javax.swing.JLabel generoPelicula3;
    private javax.swing.JLabel generoPelicula4;
    private javax.swing.JLabel imagenPelicula1;
    private javax.swing.JLabel imagenPelicula2;
    private javax.swing.JLabel imagenPelicula3;
    private javax.swing.JLabel imagenPelicula4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel tituloPelicula1;
    private javax.swing.JLabel tituloPelicula2;
    private javax.swing.JLabel tituloPelicula3;
    private javax.swing.JLabel tituloPelicula4;
    // End of variables declaration//GEN-END:variables
}
