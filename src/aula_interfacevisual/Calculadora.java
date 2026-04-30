
package aula_interfacevisual;

import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Calculadora.class.getName());

    public Calculadora() {
        initComponents();
    }
    
    public void calculando(String operante){
        String valor;
        try {
            //double n1 = Double.parseDouble(txfNumero1.getText());
            //double n2 = Double.parseDouble(txfNumero2.getText());
            switch (operante) {
                case "+":
                    valor = "n1+n2";
                    break;
                case "-":
                    valor = "n1-n2";
                    break;
                case "*":
                    valor = "n1*n2";
                    break;
                case "/":
                    valor = "n1/n2";
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Entrada inválida!","Erro",JOptionPane.ERROR_MESSAGE);
                    throw new AssertionError();
            }
            txfResultado.setText(String.valueOf(valor));           
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
        jbLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeCalcula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeCalcula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCalcula.setText("Super Calculadora Genérica");

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

        jLabelResult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelResult.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResult.setText("Resultado:");

        jbSomar.setBackground(new java.awt.Color(0, 0, 0));
        jbSomar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSomar.setForeground(new java.awt.Color(255, 255, 255));
        jbSomar.setText("Somar (+)");
        jbSomar.addActionListener(this::jbSomarActionPerformed);

        jbSubtrair.setBackground(new java.awt.Color(0, 0, 0));
        jbSubtrair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSubtrair.setForeground(new java.awt.Color(255, 255, 255));
        jbSubtrair.setText("Subtrair (-)");
        jbSubtrair.addActionListener(this::jbSubtrairActionPerformed);

        jbDividir.setBackground(new java.awt.Color(0, 0, 0));
        jbDividir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbDividir.setForeground(new java.awt.Color(255, 255, 255));
        jbDividir.setText("Dividir (/)");
        jbDividir.addActionListener(this::jbDividirActionPerformed);

        jbMultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        jbMultiplicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbMultiplicar.setForeground(new java.awt.Color(255, 255, 255));
        jbMultiplicar.setText("Multiplicar (*)");
        jbMultiplicar.addActionListener(this::jbMultiplicarActionPerformed);

        jbLimpar.setBackground(new java.awt.Color(0, 0, 0));
        jbLimpar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbLimpar.setForeground(new java.awt.Color(255, 255, 255));
        jbLimpar.setText("Resetar");
        jbLimpar.addActionListener(this::jbLimparActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelResult)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbLimpar)
                                    .addComponent(txfResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelNomeCalcula)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelNumero01)
                                        .addComponent(jLabelNumero02))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txfNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                        .addComponent(txfNumero2))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabelNomeCalcula)
                .addGap(57, 57, 57)
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
                .addComponent(jbLimpar)
                .addContainerGap(40, Short.MAX_VALUE))
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

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        txfNumero1.setText("");
        txfNumero2.setText("");
        txfResultado.setText("");
    }//GEN-LAST:event_jbLimparActionPerformed

    private void txfNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNumero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfNumero1ActionPerformed

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
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbMultiplicar;
    private javax.swing.JButton jbSomar;
    private javax.swing.JButton jbSubtrair;
    private javax.swing.JTextField txfNumero1;
    private javax.swing.JTextField txfNumero2;
    private javax.swing.JTextField txfResultado;
    // End of variables declaration//GEN-END:variables
}
