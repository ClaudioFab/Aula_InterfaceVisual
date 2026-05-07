package aula_interfacevisual;

public class Menu_iniciar extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Menu_iniciar.class.getName());

    public Menu_iniciar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanelMenuVerm = new javax.swing.JPanel();
        jbImgCalculadora = new javax.swing.JButton();
        jbImgMedidor = new javax.swing.JButton();
        jLabelCalcula2 = new javax.swing.JLabel();
        jLabelMedidor2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBarIniciar = new javax.swing.JMenuBar();
        jMenuFormulario = new javax.swing.JMenu();
        jMenuCalculaGravitacional = new javax.swing.JMenuItem();
        jMenuComboBox = new javax.swing.JMenuItem();
        jMenuCalcula = new javax.swing.JMenuItem();
        jMenuMedidor = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Iniciar");

        jPanelMenuVerm.setBackground(new java.awt.Color(102, 0, 0));
        jPanelMenuVerm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenuVerm.setForeground(new java.awt.Color(0, 0, 0));

        jbImgCalculadora.setBackground(new java.awt.Color(255, 255, 255));
        jbImgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calculadora-50.png"))); // NOI18N
        jbImgCalculadora.addActionListener(this::jbImgCalculadoraActionPerformed);

        jbImgMedidor.setBackground(new java.awt.Color(255, 255, 255));
        jbImgMedidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-velocímetro-50.png"))); // NOI18N
        jbImgMedidor.addActionListener(this::jbImgMedidorActionPerformed);

        jLabelCalcula2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCalcula2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalcula2.setText("Calculadora");

        jLabelMedidor2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMedidor2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedidor2.setText("Medidor");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caixa-50.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Combo Box");

        javax.swing.GroupLayout jPanelMenuVermLayout = new javax.swing.GroupLayout(jPanelMenuVerm);
        jPanelMenuVerm.setLayout(jPanelMenuVermLayout);
        jPanelMenuVermLayout.setHorizontalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuVermLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbImgMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbImgCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMenuVermLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabelCalcula2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMedidor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94))
        );
        jPanelMenuVermLayout.setVerticalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuVermLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbImgCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabelCalcula2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbImgMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabelMedidor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jMenuFormulario.setText("Formulários");

        jMenuCalculaGravitacional.setText("Calculadora Gravitacional");
        jMenuCalculaGravitacional.addActionListener(this::jMenuCalculaGravitacionalActionPerformed);
        jMenuFormulario.add(jMenuCalculaGravitacional);

        jMenuComboBox.setText("Combo Box");
        jMenuComboBox.addActionListener(this::jMenuComboBoxActionPerformed);
        jMenuFormulario.add(jMenuComboBox);

        jMenuCalcula.setText("Calculadora");
        jMenuCalcula.addActionListener(this::jMenuCalculaActionPerformed);
        jMenuFormulario.add(jMenuCalcula);

        jMenuMedidor.setText("Medidor");
        jMenuMedidor.addActionListener(this::jMenuMedidorActionPerformed);
        jMenuFormulario.add(jMenuMedidor);

        jMenuBarIniciar.add(jMenuFormulario);

        jMenuAjuda.setText("Ajuda");
        jMenuBarIniciar.add(jMenuAjuda);

        jMenuSair.setText("Sair");
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBarIniciar.add(jMenuSair);

        setJMenuBar(jMenuBarIniciar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuVerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMenuVerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCalculaActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuCalculaActionPerformed

    private void jMenuMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMedidorActionPerformed
        Medidor c1 = new Medidor();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuMedidorActionPerformed

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jbImgCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImgCalculadoraActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
    }//GEN-LAST:event_jbImgCalculadoraActionPerformed

    private void jbImgMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImgMedidorActionPerformed
        Medidor c1 = new Medidor();
        c1.setVisible(true);
    }//GEN-LAST:event_jbImgMedidorActionPerformed

    private void jMenuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuComboBoxActionPerformed
        ComboBox c1 = new ComboBox();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ComboBox c1 = new ComboBox();
        c1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuCalculaGravitacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCalculaGravitacionalActionPerformed
        CalculaPeso c1 = new CalculaPeso();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuCalculaGravitacionalActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(() -> new Menu_iniciar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelCalcula2;
    private javax.swing.JLabel jLabelMedidor2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarIniciar;
    private javax.swing.JMenuItem jMenuCalcula;
    private javax.swing.JMenuItem jMenuCalculaGravitacional;
    private javax.swing.JMenuItem jMenuComboBox;
    private javax.swing.JMenu jMenuFormulario;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuMedidor;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelMenuVerm;
    private javax.swing.JButton jbImgCalculadora;
    private javax.swing.JButton jbImgMedidor;
    // End of variables declaration//GEN-END:variables

}
