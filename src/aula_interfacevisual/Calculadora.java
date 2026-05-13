
package aula_interfacevisual;

import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculadora.class.getName());

    public Calculadora() {
        initComponents();
    }
    
    public void calculando(String operante){
        double n1;
        double n2;
        try {            
            switch (operante) {
                case "+":
                    n1 = Double.parseDouble(txfNumero1.getText());
                    n2 = Double.parseDouble(txfNumero2.getText());
                    txfResultado.setText(String.valueOf(n1+n2));
                    break;
                case "-":
                    n1 = Double.parseDouble(txfNumero1.getText());
                    n2 = Double.parseDouble(txfNumero2.getText());
                    txfResultado.setText(String.valueOf(n1-n2));
                    break;
                case "*":
                    n1 = Double.parseDouble(txfNumero1.getText());
                    n2 = Double.parseDouble(txfNumero2.getText());
                    txfResultado.setText(String.valueOf(n1*n2));
                    break;
                case "/":
                    n1 = Double.parseDouble(txfNumero1.getText());
                    n2 = Double.parseDouble(txfNumero2.getText());
                    txfResultado.setText(String.valueOf(n1/n2));
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Entrada inválida!","Erro",JOptionPane.ERROR_MESSAGE);
                    throw new AssertionError();
            }
            txfNumero1.setText("");
            txfNumero2.setText("");

        } catch (Exception e) {
            txfNumero1.setText("");
            txfNumero2.setText("");
            txfResultado.setText("");
            JOptionPane.showMessageDialog(null,"Entrada inválida!\nUtilize apenas Números!","Erro",JOptionPane.ERROR_MESSAGE);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeCalcula = new javax.swing.JLabel();
        jLabelNumero01 = new javax.swing.JLabel();
        jLabelNumero02 = new javax.swing.JLabel();
        txfNumero1 = new javax.swing.JTextField();
        txfNumero2 = new javax.swing.JTextField();
        txfResultado = new javax.swing.JTextField();
        jLabelResult = new javax.swing.JLabel();
        jbSomar = new javax.swing.JButton();
        jbSubtrair = new javax.swing.JButton();
        jbDividir = new javax.swing.JButton();
        jbMultiplicar = new javax.swing.JButton();
        jbLimparCalcula = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeCalcula.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNomeCalcula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeCalcula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCalcula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeCalcula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calculadora-50.png"))); // NOI18N
        jLabelNomeCalcula.setText("Calculadora Genérica");

        jLabelNumero01.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNumero01.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero01.setText("Número 1");

        jLabelNumero02.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNumero02.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNumero02.setText("Número 2");

        txfNumero1.setBackground(new java.awt.Color(0, 0, 0));
        txfNumero1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfNumero1.setForeground(new java.awt.Color(255, 255, 255));
        txfNumero1.addActionListener(this::txfNumero1ActionPerformed);

        txfNumero2.setBackground(new java.awt.Color(0, 0, 0));
        txfNumero2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfNumero2.setForeground(new java.awt.Color(255, 255, 255));

        txfResultado.setEditable(false);
        txfResultado.setBackground(new java.awt.Color(0, 0, 0));
        txfResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfResultado.setForeground(new java.awt.Color(255, 255, 255));
        txfResultado.addActionListener(this::txfResultadoActionPerformed);

        jLabelResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResult.setText("Resultado:");

        jbSomar.setBackground(new java.awt.Color(54, 47, 47));
        jbSomar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSomar.setForeground(new java.awt.Color(255, 255, 255));
        jbSomar.setText("Somar (+)");
        jbSomar.addActionListener(this::jbSomarActionPerformed);

        jbSubtrair.setBackground(new java.awt.Color(54, 47, 47));
        jbSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        jbSubtrair.setText("Subtrair (-)");
        jbSubtrair.addActionListener(this::jbSubtrairActionPerformed);

        jbDividir.setBackground(new java.awt.Color(54, 47, 47));
        jbDividir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbDividir.setForeground(new java.awt.Color(255, 255, 255));
        jbDividir.setText("Dividir (/)");
        jbDividir.addActionListener(this::jbDividirActionPerformed);

        jbMultiplicar.setBackground(new java.awt.Color(54, 47, 47));
        jbMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        jbMultiplicar.setText("Multiplicar (*)");
        jbMultiplicar.addActionListener(this::jbMultiplicarActionPerformed);

        jbLimparCalcula.setBackground(new java.awt.Color(54, 47, 47));
        jbLimparCalcula.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbLimparCalcula.setForeground(new java.awt.Color(255, 255, 255));
        jbLimparCalcula.setText("Resetar");
        jbLimparCalcula.addActionListener(this::jbLimparCalculaActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelResult)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbLimparCalcula)
                            .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbMultiplicar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jbSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSubtrair, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelNumero01)
                                .addComponent(jLabelNumero02))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txfNumero2)
                                .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(44, 44, 44))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeCalcula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelNomeCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero01)
                    .addComponent(txfNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumero02)
                    .addComponent(txfNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSubtrair)
                    .addComponent(jbSomar))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbMultiplicar)
                    .addComponent(jbDividir))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelResult)
                    .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jbLimparCalcula)
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMultiplicarActionPerformed
        calculando("*");
        
    }//GEN-LAST:event_jbMultiplicarActionPerformed

    private void jbSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSubtrairActionPerformed
        calculando("-");
    }//GEN-LAST:event_jbSubtrairActionPerformed

    private void jbDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDividirActionPerformed
        calculando("/");
    }//GEN-LAST:event_jbDividirActionPerformed

    private void jbSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSomarActionPerformed
        calculando("+");
    }//GEN-LAST:event_jbSomarActionPerformed

    private void jbLimparCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparCalculaActionPerformed
        txfNumero1.setText("");
        txfNumero2.setText("");
        txfResultado.setText("");
    }//GEN-LAST:event_jbLimparCalculaActionPerformed

    private void txfNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumero1ActionPerformed

    private void txfResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfResultadoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Calculadora().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelNomeCalcula;
    private javax.swing.JLabel jLabelNumero01;
    private javax.swing.JLabel jLabelNumero02;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbDividir;
    private javax.swing.JButton jbLimparCalcula;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField txfNumero1;
    private javax.swing.JTextField txfNumero2;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
