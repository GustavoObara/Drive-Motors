package view;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author gusta
 */
public class ViewLoading extends javax.swing.JFrame {

    public ViewLoading() {
        initComponents();
        
        new Thread(){
            @Override
            public void run(){
                for (int i = 0; i < 101; i++) {
                    pbLoading.setValue(i);
                    try {
                        sleep(30);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ViewLoading.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                ViewLogin myLogin = new ViewLogin(); //cria janela
                myLogin.setVisible(true); // dx visivel
                dispose(); // fecho janela load
            }
        } .start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pbLoading = new javax.swing.JProgressBar();
        lbImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pbLoading.setStringPainted(true);
        jPanel1.add(pbLoading, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 330, 20));

        lbImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HOME BREW.png"))); // NOI18N
        lbImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbImage.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lbImageAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lbImage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lbImageKeyPressed(evt);
            }
        });
        jPanel1.add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbImageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbImageKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbImageKeyPressed

    private void lbImageAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lbImageAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lbImageAncestorAdded

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
            java.util.logging.Logger.getLogger(ViewLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLoading.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLoading().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JProgressBar pbLoading;
    // End of variables declaration//GEN-END:variables
}
