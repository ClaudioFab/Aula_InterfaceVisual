
package aula_interfacevisual;

import javax.swing.GroupLayout;

public class Form1 extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Form1.class.getName());

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTituloCalcul = new javax.swing.JLabel();
        jLabelNumero01 = new javax.swing.JLabel();
        jLabelNumero02 = new javax.swing.JLabel();
        txfNumero1 = new javax.swing.JTextField();
        txfNumero2 = new javax.swing.JTextField();
        txfResult = new javax.swing.JTextField();
        jLabelResult = new javax.swing.JLabel();
        jbSomar = new javax.swing.JButton();
        jbSubtrair = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jTituloCalcul.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTituloCalcul.setForeground(new java.awt.Color(0, 0, 0));
        jTituloCalcul.setText("Super Blaster Calculadora Overpower");

        jLabelNumero01.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumero01.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNumero01.setText("Número 01");

        jLabelNumero02.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelNumero02.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNumero02.setText("Número 02");

        txfResult.setEditable(false);
        txfResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabelResult.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelResult.setForeground(new java.awt.Color(0, 0, 0));
        jLabelResult.setText("Resultado:");

        jbSomar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSomar.setText("Somar (+)");
        jbSomar.addActionListener(this::jbSomarActionPerformed);

        jbSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSubtrair.setText("Subtrair (-)");
        jbSubtrair.addActionListener(this::jbSubtrairActionPerformed);

        jbDividir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbDividir.setText("Dividir (*)");
        jbDividir.addActionListener(this::jbDividirActionPerformed);

        jbMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbMultiplicar.setText("Multiplicar (/)");
        jbMultiplicar.addActionListener(this::jbMultiplicarActionPerformed);

        jbLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbLimpar.setText("Resetar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTituloCalcul, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNumero01)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabelNumero02)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txfNumero2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(jLabelResult))
                            .addComponent(txfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimpar))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTituloCalcul)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero01)
                    .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero02)
                    .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSomar)
                    .addComponent(jbSubtrair))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMultiplicar)
                    .addComponent(jbDividir))
                .addGap(42, 42, 42)
                .addComponent(jLabelResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfResult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jbLimpar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbMultiplicarActionPerformed

    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbDividirActionPerformed

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        String num1Str = txfNumero1.getText();
        
        double n1 = Double.parseDouble(num1Str);
        double n2 = Double.parseDouble(txfNumero2.getText());
        
        double total = n1+n2;
        
        String result = String.valueOf(total);
        
        txfResult.setText(result);
   
    }//GEN-LAST:event_jbSomarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Form1().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNumero01;
    private javax.swing.JLabel jLabelNumero02;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTituloCalcul;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField txfNumero1;
    private javax.swing.JTextField txfNumero2;
    private javax.swing.JTextField txfResult;
    // End of variables declaration//GEN-END:variables
}
