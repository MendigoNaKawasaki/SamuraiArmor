package samuraiarmor;
public class Main extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName());

    public Main(){
        setTitle("Samurai Armor");
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCriarEcomenda = new javax.swing.JButton();
        btnVerEcomendas = new javax.swing.JButton();
        btnAddStock = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVerStock = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCriarEcomenda.setText("Criar Ecomenda");
        btnCriarEcomenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarEcomendaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCriarEcomenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        btnVerEcomendas.setText("Ver Ecomendas");
        btnVerEcomendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerEcomendasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerEcomendas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        btnAddStock.setText("Adicionar ao Stock");
        btnAddStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/samuraiarmor/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnVerStock.setText("Ver Stock");
        btnVerStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerStockActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerEcomendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerEcomendasActionPerformed
        new VerEcomendas().setVisible(true); 
    }//GEN-LAST:event_btnVerEcomendasActionPerformed

    private void btnCriarEcomendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarEcomendaActionPerformed
        new CriarEcomenda().setVisible(true);
    }//GEN-LAST:event_btnCriarEcomendaActionPerformed

    private void btnAddStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStockActionPerformed
        new AdicionarStock().setVisible(true);
    }//GEN-LAST:event_btnAddStockActionPerformed

    private void btnVerStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerStockActionPerformed
        new VerStock().setVisible(true);
    }//GEN-LAST:event_btnVerStockActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Loja.carregarProdutos();
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddStock;
    private javax.swing.JButton btnCriarEcomenda;
    private javax.swing.JButton btnVerEcomendas;
    private javax.swing.JButton btnVerStock;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
