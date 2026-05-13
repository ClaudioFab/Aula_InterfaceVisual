package aula_interfacevisual;

import javax.swing.JOptionPane;

public class ConfiguracoesJogo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ConfiguracoesJogo.class.getName());

    public ConfiguracoesJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDificuldade = new javax.swing.ButtonGroup();
        jPanelOpcoesJogo = new javax.swing.JPanel();
        jCheckBoxMusica = new javax.swing.JCheckBox();
        jCheckBoxLegendas = new javax.swing.JCheckBox();
        jCheckBoxTelaCheia = new javax.swing.JCheckBox();
        jPanelDificuldade = new javax.swing.JPanel();
        jRadioButtonFacil = new javax.swing.JRadioButton();
        jRadioButtonMedio = new javax.swing.JRadioButton();
        jRadioButtonDificil = new javax.swing.JRadioButton();
        jPanelVolume = new javax.swing.JPanel();
        jSliderVolume = new javax.swing.JSlider();
        jPanelBotãoConfig = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações de Jogo");

        jPanelOpcoesJogo.setBackground(new java.awt.Color(102, 0, 0));
        jPanelOpcoesJogo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Opções de Jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelOpcoesJogo.setForeground(new java.awt.Color(0, 0, 0));
        jPanelOpcoesJogo.setPreferredSize(new java.awt.Dimension(450, 199));

        jCheckBoxMusica.setBackground(new java.awt.Color(102, 0, 0));
        jCheckBoxMusica.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxMusica.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxMusica.setText("Ativar Música");
        jCheckBoxMusica.addActionListener(this::jCheckBoxMusicaActionPerformed);

        jCheckBoxLegendas.setBackground(new java.awt.Color(102, 0, 0));
        jCheckBoxLegendas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxLegendas.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxLegendas.setText("Ativar Legendas");

        jCheckBoxTelaCheia.setBackground(new java.awt.Color(102, 0, 0));
        jCheckBoxTelaCheia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxTelaCheia.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxTelaCheia.setText("Modo Tela Cheia");

        javax.swing.GroupLayout jPanelOpcoesJogoLayout = new javax.swing.GroupLayout(jPanelOpcoesJogo);
        jPanelOpcoesJogo.setLayout(jPanelOpcoesJogoLayout);
        jPanelOpcoesJogoLayout.setHorizontalGroup(
            jPanelOpcoesJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoesJogoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanelOpcoesJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCheckBoxTelaCheia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxMusica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCheckBoxLegendas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOpcoesJogoLayout.setVerticalGroup(
            jPanelOpcoesJogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoesJogoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jCheckBoxMusica)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxLegendas)
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxTelaCheia)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanelDificuldade.setBackground(new java.awt.Color(102, 0, 0));
        jPanelDificuldade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Dificuldade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelDificuldade.setForeground(new java.awt.Color(0, 0, 0));
        jPanelDificuldade.setPreferredSize(new java.awt.Dimension(450, 199));

        jRadioButtonFacil.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroupDificuldade.add(jRadioButtonFacil);
        jRadioButtonFacil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonFacil.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonFacil.setText("Fácil");

        jRadioButtonMedio.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroupDificuldade.add(jRadioButtonMedio);
        jRadioButtonMedio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonMedio.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonMedio.setText("Médio");
        jRadioButtonMedio.addActionListener(this::jRadioButtonMedioActionPerformed);

        jRadioButtonDificil.setBackground(new java.awt.Color(102, 0, 0));
        buttonGroupDificuldade.add(jRadioButtonDificil);
        jRadioButtonDificil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonDificil.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonDificil.setText("Difícil");
        jRadioButtonDificil.addActionListener(this::jRadioButtonDificilActionPerformed);

        javax.swing.GroupLayout jPanelDificuldadeLayout = new javax.swing.GroupLayout(jPanelDificuldade);
        jPanelDificuldade.setLayout(jPanelDificuldadeLayout);
        jPanelDificuldadeLayout.setHorizontalGroup(
            jPanelDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDificuldadeLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jRadioButtonFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jRadioButtonMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jRadioButtonDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanelDificuldadeLayout.setVerticalGroup(
            jPanelDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDificuldadeLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelDificuldadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonFacil)
                    .addComponent(jRadioButtonMedio)
                    .addComponent(jRadioButtonDificil))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelVolume.setBackground(new java.awt.Color(102, 0, 0));
        jPanelVolume.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Volume", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelVolume.setForeground(new java.awt.Color(0, 0, 0));
        jPanelVolume.setPreferredSize(new java.awt.Dimension(450, 199));

        jSliderVolume.setBackground(new java.awt.Color(102, 0, 0));
        jSliderVolume.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSliderVolume.setForeground(new java.awt.Color(255, 255, 255));
        jSliderVolume.setMajorTickSpacing(10);
        jSliderVolume.setPaintLabels(true);
        jSliderVolume.setPaintTicks(true);
        jSliderVolume.setSnapToTicks(true);

        javax.swing.GroupLayout jPanelVolumeLayout = new javax.swing.GroupLayout(jPanelVolume);
        jPanelVolume.setLayout(jPanelVolumeLayout);
        jPanelVolumeLayout.setHorizontalGroup(
            jPanelVolumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVolumeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSliderVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVolumeLayout.setVerticalGroup(
            jPanelVolumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVolumeLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jSliderVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanelBotãoConfig.setBackground(new java.awt.Color(102, 0, 0));
        jPanelBotãoConfig.setForeground(new java.awt.Color(0, 0, 0));

        jButtonSalvar.setBackground(new java.awt.Color(54, 47, 47));
        jButtonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvar.setText("Salvar Configurações");
        jButtonSalvar.addActionListener(this::jButtonSalvarActionPerformed);

        javax.swing.GroupLayout jPanelBotãoConfigLayout = new javax.swing.GroupLayout(jPanelBotãoConfig);
        jPanelBotãoConfig.setLayout(jPanelBotãoConfigLayout);
        jPanelBotãoConfigLayout.setHorizontalGroup(
            jPanelBotãoConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotãoConfigLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addGap(118, 118, 118))
        );
        jPanelBotãoConfigLayout.setVerticalGroup(
            jPanelBotãoConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotãoConfigLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelVolume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBotãoConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelDificuldade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelOpcoesJogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelOpcoesJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotãoConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void nãoPode() {
        JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
    }

    private void jRadioButtonDificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonDificilActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jRadioButtonDificilActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String dificuldade = "";

        //Radion Button
        if (jRadioButtonFacil.isSelected()) {
            dificuldade = "Fácil";
        } else if (jRadioButtonMedio.isSelected()) {
            dificuldade = "Médio";
        } else if (jRadioButtonDificil.isSelected()) {
            dificuldade = "Difícil";
        } else {
            nãoPode();
            return;
        }

        String mensagem = "";
        //Formação de mensagem.
        mensagem += "Música: " + (jCheckBoxMusica.isSelected() ? "Ativado" : "Desativado") + "\n";
        mensagem += "Legenda: " + (jCheckBoxLegendas.isSelected() ? "Ativado" : "Desativado") + "\n";
        mensagem += "Tela Cheia: " + (jCheckBoxTelaCheia.isSelected() ? "Ativado" : "Desativado") + "\n";

        mensagem += "Dificuldade: " + dificuldade + ".\n";

        mensagem += "Volume: " + jSliderVolume.getValue() + ".";

        JOptionPane.showMessageDialog(null, mensagem, "Configurações Salvas!", JOptionPane.WARNING_MESSAGE);


    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jCheckBoxMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMusicaActionPerformed

    private void jRadioButtonMedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMedioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new ConfiguracoesJogo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupDificuldade;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxLegendas;
    private javax.swing.JCheckBox jCheckBoxMusica;
    private javax.swing.JCheckBox jCheckBoxTelaCheia;
    private javax.swing.JPanel jPanelBotãoConfig;
    private javax.swing.JPanel jPanelDificuldade;
    private javax.swing.JPanel jPanelOpcoesJogo;
    private javax.swing.JPanel jPanelVolume;
    private javax.swing.JRadioButton jRadioButtonDificil;
    private javax.swing.JRadioButton jRadioButtonFacil;
    private javax.swing.JRadioButton jRadioButtonMedio;
    private javax.swing.JSlider jSliderVolume;
    // End of variables declaration//GEN-END:variables

}
