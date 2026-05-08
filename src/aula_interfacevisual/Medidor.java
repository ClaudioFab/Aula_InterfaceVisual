package aula_interfacevisual;

import javax.swing.JOptionPane;

public class Medidor extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Medidor.class.getName());

    public Medidor() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainelMedidorVerm = new javax.swing.JPanel();
        jLabelNomeMedidor = new javax.swing.JLabel();
        jLabelLado1 = new javax.swing.JLabel();
        jLabelLado2 = new javax.swing.JLabel();
        jLabelLado3 = new javax.swing.JLabel();
        txfMedida1 = new javax.swing.JTextField();
        txfMedida2 = new javax.swing.JTextField();
        txfMedida3 = new javax.swing.JTextField();
        jbVerifica = new javax.swing.JButton();
        jLabelResultado = new javax.swing.JLabel();
        jbLimparMedidor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medidor");

        jPainelMedidorVerm.setBackground(new java.awt.Color(102, 0, 0));
        jPainelMedidorVerm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPainelMedidorVerm.setForeground(new java.awt.Color(0, 0, 0));

        jLabelNomeMedidor.setBackground(new java.awt.Color(0, 0, 0));
        jLabelNomeMedidor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeMedidor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeMedidor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeMedidor.setText("Medidor do Triângulo");

        jLabelLado1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLado1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLado1.setText("Lado 1:");

        jLabelLado2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLado2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLado2.setText("Lado 2:");

        jLabelLado3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelLado3.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLado3.setText("Lado 3:");

        txfMedida1.setBackground(new java.awt.Color(0, 0, 0));
        txfMedida1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfMedida1.setForeground(new java.awt.Color(255, 255, 255));

        txfMedida2.setBackground(new java.awt.Color(0, 0, 0));
        txfMedida2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfMedida2.setForeground(new java.awt.Color(255, 255, 255));
        txfMedida2.addActionListener(this::txfMedida2ActionPerformed);

        txfMedida3.setBackground(new java.awt.Color(0, 0, 0));
        txfMedida3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfMedida3.setForeground(new java.awt.Color(255, 255, 255));

        jbVerifica.setBackground(new java.awt.Color(54, 47, 47));
        jbVerifica.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbVerifica.setForeground(new java.awt.Color(255, 255, 255));
        jbVerifica.setText("Verificar Tipo");
        jbVerifica.addActionListener(this::jbVerificaActionPerformed);

        jLabelResultado.setBackground(new java.awt.Color(255, 255, 255));
        jLabelResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelResultado.setForeground(new java.awt.Color(255, 255, 255));

        jbLimparMedidor.setBackground(new java.awt.Color(54, 47, 47));
        jbLimparMedidor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbLimparMedidor.setForeground(new java.awt.Color(255, 255, 255));
        jbLimparMedidor.setText("Resetar");
        jbLimparMedidor.addActionListener(this::jbLimparMedidorActionPerformed);

        javax.swing.GroupLayout jPainelMedidorVermLayout = new javax.swing.GroupLayout(jPainelMedidorVerm);
        jPainelMedidorVerm.setLayout(jPainelMedidorVermLayout);
        jPainelMedidorVermLayout.setHorizontalGroup(
            jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelMedidorVermLayout.createSequentialGroup()
                .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelMedidorVermLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPainelMedidorVermLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbLimparMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbVerifica, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPainelMedidorVermLayout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPainelMedidorVermLayout.createSequentialGroup()
                                        .addComponent(jLabelLado3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfMedida3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPainelMedidorVermLayout.createSequentialGroup()
                                        .addComponent(jLabelLado2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfMedida2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPainelMedidorVermLayout.createSequentialGroup()
                                        .addComponent(jLabelLado1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txfMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPainelMedidorVermLayout.setVerticalGroup(
            jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelMedidorVermLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelNomeMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLado1)
                    .addComponent(txfMedida1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfMedida2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLado2))
                .addGap(32, 32, 32)
                .addGroup(jPainelMedidorVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfMedida3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLado3))
                .addGap(38, 38, 38)
                .addComponent(jbVerifica, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jbLimparMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelMedidorVerm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainelMedidorVerm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfMedida2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfMedida2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfMedida2ActionPerformed

    private void jbVerificaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerificaActionPerformed

        if (txfMedida1.getText().isEmpty() || txfMedida2.getText().isEmpty() || txfMedida3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Entrada inválida!\nUtilize apenas Números!","Erro",JOptionPane.ERROR_MESSAGE);            
        }
        try {
            int lado1 = Integer.parseInt(txfMedida1.getText());
            int lado2 = Integer.parseInt(txfMedida2.getText());
            int lado3 = Integer.parseInt(txfMedida3.getText());

            if (lado1 == lado2 && lado1 == lado3) {
                jLabelResultado.setText("Triângulo Equilátero"); 
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){            
                jLabelResultado.setText("Triângulo Isósceles"); 
            }else{
                jLabelResultado.setText("Triângulo Escaleno"); 
            }
            
        } catch (Exception e) {
            txfMedida1.setText("");
            txfMedida2.setText("");
            txfMedida3.setText("");
            jLabelResultado.setText("");
        }
        

    }//GEN-LAST:event_jbVerificaActionPerformed

    private void jbLimparMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparMedidorActionPerformed
        txfMedida1.setText("");
        txfMedida2.setText("");
        txfMedida3.setText("");
        jLabelResultado.setText("");
    }//GEN-LAST:event_jbLimparMedidorActionPerformed

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new Medidor().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelLado1;
    private javax.swing.JLabel jLabelLado2;
    private javax.swing.JLabel jLabelLado3;
    private javax.swing.JLabel jLabelNomeMedidor;
    private javax.swing.JLabel jLabelResultado;
    private javax.swing.JPanel jPainelMedidorVerm;
    private javax.swing.JButton jbLimparMedidor;
    private javax.swing.JButton jbVerifica;
    private javax.swing.JTextField txfMedida1;
    private javax.swing.JTextField txfMedida2;
    private javax.swing.JTextField txfMedida3;
    // End of variables declaration//GEN-END:variables

}
