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
        jMenuBarIniciar = new javax.swing.JMenuBar();
        jMenuFormulario = new javax.swing.JMenu();
        jMenuICalcula = new javax.swing.JMenuItem();
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

        javax.swing.GroupLayout jPanelMenuVermLayout = new javax.swing.GroupLayout(jPanelMenuVerm);
        jPanelMenuVerm.setLayout(jPanelMenuVermLayout);
        jPanelMenuVermLayout.setHorizontalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuVermLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbImgMedidor)
                    .addComponent(jbImgCalculadora))
                .addGap(18, 18, 18)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCalcula2)
                    .addComponent(jLabelMedidor2))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanelMenuVermLayout.setVerticalGroup(
            jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuVermLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbImgCalculadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCalcula2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addGroup(jPanelMenuVermLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbImgMedidor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMedidor2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        jMenuFormulario.setText("Formulários");

        jMenuICalcula.setText("Calculadora");
        jMenuICalcula.addActionListener(this::jMenuICalculaActionPerformed);
        jMenuFormulario.add(jMenuICalcula);

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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMenuVerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelMenuVerm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuICalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuICalculaActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
    }//GEN-LAST:event_jMenuICalculaActionPerformed

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
    private javax.swing.JLabel jLabelCalcula2;
    private javax.swing.JLabel jLabelMedidor2;
    private javax.swing.JMenu jMenuAjuda;
    private javax.swing.JMenuBar jMenuBarIniciar;
    private javax.swing.JMenu jMenuFormulario;
    private javax.swing.JMenuItem jMenuICalcula;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuMedidor;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JPanel jPanelMenuVerm;
    private javax.swing.JButton jbImgCalculadora;
    private javax.swing.JButton jbImgMedidor;
    // End of variables declaration//GEN-END:variables

}
