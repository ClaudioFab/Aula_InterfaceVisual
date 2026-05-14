package aula_interfacevisual;

import javax.swing.JOptionPane;

public class SistemaCadastro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SistemaCadastro.class.getName());

    public SistemaCadastro() {
        initComponents();
        iniciando();
    }

    public void iniciando() {
        int num = jSliderExperiencia.getValue();
        jLabelExperiencia.setText("Experiência: " + num);
    }

    public void nãoPode() {
        JOptionPane.showMessageDialog(null, "Entrada inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
        jTextFieldNomeFuncionario.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupTurnoTrabalho = new javax.swing.ButtonGroup();
        jPanelCentral = new javax.swing.JPanel();
        jLabelNomeCadastroFun = new javax.swing.JLabel();
        jPanelSetor = new javax.swing.JPanel();
        jComboBoxSetor = new javax.swing.JComboBox<>();
        jPanelNomeFunc = new javax.swing.JPanel();
        jTextFieldNomeFuncionario = new javax.swing.JTextField();
        jPanelBeneficios = new javax.swing.JPanel();
        jCheckBoxValeAlimentacao = new javax.swing.JCheckBox();
        jCheckBoxPlanoSaude = new javax.swing.JCheckBox();
        jCheckBoxValeTransporte = new javax.swing.JCheckBox();
        jCheckBoxHomeOffice = new javax.swing.JCheckBox();
        jPanelTurnoTrabalho = new javax.swing.JPanel();
        jRadioButtonManha = new javax.swing.JRadioButton();
        jRadioButtonTarde = new javax.swing.JRadioButton();
        jRadioButtonNoite = new javax.swing.JRadioButton();
        jPanelNivelExp = new javax.swing.JPanel();
        jSliderExperiencia = new javax.swing.JSlider();
        jLabelExperiencia = new javax.swing.JLabel();
        jPanelSalvarCadastro = new javax.swing.JPanel();
        jButtonSalvarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelCentral.setBackground(new java.awt.Color(102, 0, 0));
        jPanelCentral.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNomeCadastroFun.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeCadastroFun.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroFun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeCadastroFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cadastro-60.png"))); // NOI18N
        jLabelNomeCadastroFun.setText("Cadastro de Funcionário");

        javax.swing.GroupLayout jPanelCentralLayout = new javax.swing.GroupLayout(jPanelCentral);
        jPanelCentral.setLayout(jPanelCentralLayout);
        jPanelCentralLayout.setHorizontalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeCadastroFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelCentralLayout.setVerticalGroup(
            jPanelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCentralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSetor.setBackground(new java.awt.Color(102, 0, 0));
        jPanelSetor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Setor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelSetor.setPreferredSize(new java.awt.Dimension(315, 110));

        jComboBoxSetor.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxSetor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComboBoxSetor.setForeground(new java.awt.Color(0, 0, 0));
        jComboBoxSetor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI - Técnologia da Informação", "RH - Recursos Humanos", "Financeiro", "Administrativo" }));

        javax.swing.GroupLayout jPanelSetorLayout = new javax.swing.GroupLayout(jPanelSetor);
        jPanelSetor.setLayout(jPanelSetorLayout);
        jPanelSetorLayout.setHorizontalGroup(
            jPanelSetorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxSetor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSetorLayout.setVerticalGroup(
            jPanelSetorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSetorLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jComboBoxSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelNomeFunc.setBackground(new java.awt.Color(102, 0, 0));
        jPanelNomeFunc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelNomeFunc.setPreferredSize(new java.awt.Dimension(304, 110));

        jTextFieldNomeFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldNomeFuncionario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldNomeFuncionario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelNomeFuncLayout = new javax.swing.GroupLayout(jPanelNomeFunc);
        jPanelNomeFunc.setLayout(jPanelNomeFuncLayout);
        jPanelNomeFuncLayout.setHorizontalGroup(
            jPanelNomeFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomeFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldNomeFuncionario)
                .addContainerGap())
        );
        jPanelNomeFuncLayout.setVerticalGroup(
            jPanelNomeFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomeFuncLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextFieldNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelBeneficios.setBackground(new java.awt.Color(102, 0, 0));
        jPanelBeneficios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Benefícios Desejados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelBeneficios.setPreferredSize(new java.awt.Dimension(213, 351));

        jCheckBoxValeAlimentacao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxValeAlimentacao.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxValeAlimentacao.setText("Vale Alimentação");

        jCheckBoxPlanoSaude.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxPlanoSaude.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPlanoSaude.setText("Plano de Saúde");

        jCheckBoxValeTransporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxValeTransporte.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxValeTransporte.setText("Vale Transporte");

        jCheckBoxHomeOffice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jCheckBoxHomeOffice.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxHomeOffice.setText("Home Office");

        javax.swing.GroupLayout jPanelBeneficiosLayout = new javax.swing.GroupLayout(jPanelBeneficios);
        jPanelBeneficios.setLayout(jPanelBeneficiosLayout);
        jPanelBeneficiosLayout.setHorizontalGroup(
            jPanelBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBeneficiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxValeAlimentacao)
                    .addComponent(jCheckBoxPlanoSaude)
                    .addComponent(jCheckBoxValeTransporte)
                    .addComponent(jCheckBoxHomeOffice))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanelBeneficiosLayout.setVerticalGroup(
            jPanelBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBeneficiosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jCheckBoxValeAlimentacao)
                .addGap(30, 30, 30)
                .addComponent(jCheckBoxPlanoSaude)
                .addGap(30, 30, 30)
                .addComponent(jCheckBoxValeTransporte)
                .addGap(30, 30, 30)
                .addComponent(jCheckBoxHomeOffice)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanelTurnoTrabalho.setBackground(new java.awt.Color(102, 0, 0));
        jPanelTurnoTrabalho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turno de Trabalho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        buttonGroupTurnoTrabalho.add(jRadioButtonManha);
        jRadioButtonManha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonManha.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonManha.setText("Manhã");

        buttonGroupTurnoTrabalho.add(jRadioButtonTarde);
        jRadioButtonTarde.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonTarde.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTarde.setText("Tarde");

        buttonGroupTurnoTrabalho.add(jRadioButtonNoite);
        jRadioButtonNoite.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButtonNoite.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNoite.setText("Noite");

        javax.swing.GroupLayout jPanelTurnoTrabalhoLayout = new javax.swing.GroupLayout(jPanelTurnoTrabalho);
        jPanelTurnoTrabalho.setLayout(jPanelTurnoTrabalhoLayout);
        jPanelTurnoTrabalhoLayout.setHorizontalGroup(
            jPanelTurnoTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnoTrabalhoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanelTurnoTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonManha)
                    .addComponent(jRadioButtonTarde)
                    .addComponent(jRadioButtonNoite))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanelTurnoTrabalhoLayout.setVerticalGroup(
            jPanelTurnoTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTurnoTrabalhoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jRadioButtonManha)
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonTarde)
                .addGap(50, 50, 50)
                .addComponent(jRadioButtonNoite)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanelNivelExp.setBackground(new java.awt.Color(102, 0, 0));
        jPanelNivelExp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nível de Experiência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 16), new java.awt.Color(255, 255, 255))); // NOI18N

        jSliderExperiencia.setBackground(new java.awt.Color(255, 255, 255));
        jSliderExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jSliderExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        jSliderExperiencia.setMajorTickSpacing(1);
        jSliderExperiencia.setMaximum(10);
        jSliderExperiencia.setOrientation(javax.swing.JSlider.VERTICAL);
        jSliderExperiencia.setPaintLabels(true);
        jSliderExperiencia.setPaintTicks(true);
        jSliderExperiencia.setSnapToTicks(true);
        jSliderExperiencia.setValue(5);
        jSliderExperiencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelExperiencia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelExperiencia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelExperiencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelExperiencia.setText("Experiência: 0");

        javax.swing.GroupLayout jPanelNivelExpLayout = new javax.swing.GroupLayout(jPanelNivelExp);
        jPanelNivelExp.setLayout(jPanelNivelExpLayout);
        jPanelNivelExpLayout.setHorizontalGroup(
            jPanelNivelExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNivelExpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExperiencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanelNivelExpLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jSliderExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanelNivelExpLayout.setVerticalGroup(
            jPanelNivelExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNivelExpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelExperiencia)
                .addGap(30, 30, 30)
                .addComponent(jSliderExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSalvarCadastro.setBackground(new java.awt.Color(102, 0, 0));

        jButtonSalvarCadastro.setBackground(new java.awt.Color(54, 47, 47));
        jButtonSalvarCadastro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSalvarCadastro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalvarCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-guardar-todos-30.png"))); // NOI18N
        jButtonSalvarCadastro.setText("Salvar Cadastro");
        jButtonSalvarCadastro.addActionListener(this::jButtonSalvarCadastroActionPerformed);

        javax.swing.GroupLayout jPanelSalvarCadastroLayout = new javax.swing.GroupLayout(jPanelSalvarCadastro);
        jPanelSalvarCadastro.setLayout(jPanelSalvarCadastroLayout);
        jPanelSalvarCadastroLayout.setHorizontalGroup(
            jPanelSalvarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalvarCadastroLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSalvarCadastroLayout.setVerticalGroup(
            jPanelSalvarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalvarCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSalvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelSalvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelTurnoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanelNomeFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addComponent(jPanelSetor, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelNivelExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelTurnoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelNivelExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarCadastroActionPerformed
        String hora = "", mensagem = "", beneficios = "";

        if (jTextFieldNomeFuncionario.getText().isEmpty()) {
            nãoPode();
            return;
        }

        if (jRadioButtonManha.isSelected()) {
            hora = "Manhã";
        } else if (jRadioButtonTarde.isSelected()) {
            hora = "Tarde";
        } else if (jRadioButtonNoite.isSelected()) {
            hora = "Noite";
        } else {
            nãoPode();
            return;
        }

        try {
            if (jCheckBoxValeAlimentacao.isSelected()) {
                beneficios += "Vale Alimentação\n";
            }
            if (jCheckBoxPlanoSaude.isSelected()) {
                beneficios += "Plano de Saúde\n";
            }
            if (jCheckBoxValeTransporte.isSelected()) {
                beneficios += "Vale Transporte\n";
            }
            if (jCheckBoxHomeOffice.isSelected()) {
                beneficios += "Home Office\n";
            }

        } catch (Exception e) {
            nãoPode();
            return;
        }

        //Formação de mensagem.
        mensagem += "Funcionário: " + jTextFieldNomeFuncionario.getText() + "\n\n";
        String setor = jComboBoxSetor.getSelectedItem().toString();
        mensagem += "Setor: " + setor + "\n\n";
        mensagem += "Turno: " + hora + "\n\n";
        mensagem += "Beneficios: \n" + beneficios + "\n";
        mensagem += "Experiência: " + jSliderExperiencia.getValue();
        int num = jSliderExperiencia.getValue();
        jLabelExperiencia.setText("Experiência: " + num);
        JOptionPane.showMessageDialog(null, mensagem, "Configurações Salvas!", JOptionPane.WARNING_MESSAGE);

        jTextFieldNomeFuncionario.setText("");
    }//GEN-LAST:event_jButtonSalvarCadastroActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new SistemaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupTurnoTrabalho;
    private javax.swing.JButton jButtonSalvarCadastro;
    private javax.swing.JCheckBox jCheckBoxHomeOffice;
    private javax.swing.JCheckBox jCheckBoxPlanoSaude;
    private javax.swing.JCheckBox jCheckBoxValeAlimentacao;
    private javax.swing.JCheckBox jCheckBoxValeTransporte;
    private javax.swing.JComboBox<String> jComboBoxSetor;
    private javax.swing.JLabel jLabelExperiencia;
    private javax.swing.JLabel jLabelNomeCadastroFun;
    private javax.swing.JPanel jPanelBeneficios;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelNivelExp;
    private javax.swing.JPanel jPanelNomeFunc;
    private javax.swing.JPanel jPanelSalvarCadastro;
    private javax.swing.JPanel jPanelSetor;
    private javax.swing.JPanel jPanelTurnoTrabalho;
    private javax.swing.JRadioButton jRadioButtonManha;
    private javax.swing.JRadioButton jRadioButtonNoite;
    private javax.swing.JRadioButton jRadioButtonTarde;
    private javax.swing.JSlider jSliderExperiencia;
    private javax.swing.JTextField jTextFieldNomeFuncionario;
    // End of variables declaration//GEN-END:variables

}
