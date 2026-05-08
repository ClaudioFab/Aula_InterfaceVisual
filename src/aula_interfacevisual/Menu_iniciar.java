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
        jLabel2 = new javax.swing.JLabel();
        jPanelMenuVerm = new javax.swing.JPanel();
        jButtonImgCalculadora = new javax.swing.JButton();
        jButtonImgMedidor = new javax.swing.JButton();
        jLabelCalcula = new javax.swing.JLabel();
        jLabelMedidor = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelCombo = new javax.swing.JLabel();
        jButtonImgGravidade = new javax.swing.JButton();
        jLabelGravidade = new javax.swing.JLabel();
        jMenuBarIniciar = new javax.swing.JMenuBar();
        jMenuFormulario = new javax.swing.JMenu();
        jMenuCalcula = new javax.swing.JMenuItem();
        jMenuMedidor = new javax.swing.JMenuItem();
        jMenuComboBox = new javax.swing.JMenuItem();
        jMenuCalculaGravitacional = new javax.swing.JMenuItem();
        jMenuAjuda = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Iniciar");

        jPanelMenuVerm.setBackground(new java.awt.Color(102, 0, 0));
        jPanelMenuVerm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelMenuVerm.setForeground(new java.awt.Color(0, 0, 0));

        jButtonImgCalculadora.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImgCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calculadora-50.png"))); // NOI18N
        jButtonImgCalculadora.addActionListener(this::jButtonImgCalculadoraActionPerformed);

        jButtonImgMedidor.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImgMedidor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-velocímetro-50.png"))); // NOI18N
        jButtonImgMedidor.addActionListener(this::jButtonImgMedidorActionPerformed);

        jLabelCalcula.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCalcula.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalcula.setText("Calculadora Genérica");

        jLabelMedidor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelMedidor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMedidor.setText("Medidor de Triângulo");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caixa-50.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jLabelCombo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCombo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCombo.setText("Combo Box Pizzaria");

        jButtonImgGravidade.setBackground(new java.awt.Color(255, 255, 255));
        jButtonImgGravidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-gravidade-64.png"))); // NOI18N
        jButtonImgGravidade.addActionListener(this::jButtonImgGravidadeActionPerformed);

        jLabelGravidade.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelGravidade.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGravidade.setText("Peso Gravitacional");

        javax.swing.GroupLayout jPanelMenuVermLayout = new javax.swing.GroupLayout(jPanelMenuVerm);
        jPanelMenuVerm.setLayout(jPanelMenuVermLayout);
        jPanelMenuVermLayout.setHorizontalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuVermLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonImgGravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonImgMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonImgCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabelCombo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelGravidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanelMenuVermLayout.setVerticalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuVermLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonImgCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonImgMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMedidor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonImgGravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelGravidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        jMenuFormulario.setText("Formulários");

        jMenuCalcula.setText("Calculadora Genérica");
        jMenuCalcula.addActionListener(this::jMenuCalculaActionPerformed);
        jMenuFormulario.add(jMenuCalcula);

        jMenuMedidor.setText("Medidor de Triângulo");
        jMenuMedidor.addActionListener(this::jMenuMedidorActionPerformed);
        jMenuFormulario.add(jMenuMedidor);

        jMenuComboBox.setText("Combo Box Pizzaria");
        jMenuComboBox.addActionListener(this::jMenuComboBoxActionPerformed);
        jMenuFormulario.add(jMenuComboBox);

        jMenuCalculaGravitacional.setText("Calculadora de Peso Gravitacional");
        jMenuCalculaGravitacional.addActionListener(this::jMenuCalculaGravitacionalActionPerformed);
        jMenuFormulario.add(jMenuCalculaGravitacional);

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

    private void jButtonImgCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImgCalculadoraActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
    }//GEN-LAST:event_jButtonImgCalculadoraActionPerformed

    private void jButtonImgMedidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImgMedidorActionPerformed
        Medidor c1 = new Medidor();
        c1.setVisible(true);
    }//GEN-LAST:event_jButtonImgMedidorActionPerformed

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

    private void jButtonImgGravidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonImgGravidadeActionPerformed
        CalculaPeso c1 = new CalculaPeso();
        c1.setVisible(true);
    }//GEN-LAST:event_jButtonImgGravidadeActionPerformed

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
    private javax.swing.JButton jButtonImgCalculadora;
    private javax.swing.JButton jButtonImgGravidade;
    private javax.swing.JButton jButtonImgMedidor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCalcula;
    private javax.swing.JLabel jLabelCombo;
    private javax.swing.JLabel jLabelGravidade;
    private javax.swing.JLabel jLabelMedidor;
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
    // End of variables declaration//GEN-END:variables

}
