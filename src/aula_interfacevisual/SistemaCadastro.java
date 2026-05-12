package aula_interfacevisual;

public class SistemaCadastro extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SistemaCadastro.class.getName());

    public SistemaCadastro() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNomeCadastroFun = new javax.swing.JLabel();
        jLabelImagNomeCadastroFun = new javax.swing.JLabel();
        jPanelSetor = new javax.swing.JPanel();
        jPanelNomeFunc = new javax.swing.JPanel();
        jPanelBeneficios = new javax.swing.JPanel();
        jPanelTurnoTrabalho = new javax.swing.JPanel();
        jPanelNivelExp = new javax.swing.JPanel();
        jPanelSalvarCadastro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabelNomeCadastroFun.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeCadastroFun.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeCadastroFun.setText("Cadastro de Funcionário");

        jLabelImagNomeCadastroFun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-caixa-50.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelImagNomeCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelImagNomeCadastroFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNomeCadastroFun, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelSetor.setBackground(new java.awt.Color(102, 0, 0));
        jPanelSetor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Setor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelSetor.setPreferredSize(new java.awt.Dimension(315, 110));

        javax.swing.GroupLayout jPanelSetorLayout = new javax.swing.GroupLayout(jPanelSetor);
        jPanelSetor.setLayout(jPanelSetorLayout);
        jPanelSetorLayout.setHorizontalGroup(
            jPanelSetorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 305, Short.MAX_VALUE)
        );
        jPanelSetorLayout.setVerticalGroup(
            jPanelSetorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanelNomeFunc.setBackground(new java.awt.Color(102, 0, 0));
        jPanelNomeFunc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome do Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanelNomeFunc.setPreferredSize(new java.awt.Dimension(304, 110));

        javax.swing.GroupLayout jPanelNomeFuncLayout = new javax.swing.GroupLayout(jPanelNomeFunc);
        jPanelNomeFunc.setLayout(jPanelNomeFuncLayout);
        jPanelNomeFuncLayout.setHorizontalGroup(
            jPanelNomeFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );
        jPanelNomeFuncLayout.setVerticalGroup(
            jPanelNomeFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );

        jPanelBeneficios.setBackground(new java.awt.Color(102, 0, 0));
        jPanelBeneficios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Benefícios Desejados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanelBeneficiosLayout = new javax.swing.GroupLayout(jPanelBeneficios);
        jPanelBeneficios.setLayout(jPanelBeneficiosLayout);
        jPanelBeneficiosLayout.setHorizontalGroup(
            jPanelBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );
        jPanelBeneficiosLayout.setVerticalGroup(
            jPanelBeneficiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelTurnoTrabalho.setBackground(new java.awt.Color(102, 0, 0));
        jPanelTurnoTrabalho.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Turno de Trabalho", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanelTurnoTrabalhoLayout = new javax.swing.GroupLayout(jPanelTurnoTrabalho);
        jPanelTurnoTrabalho.setLayout(jPanelTurnoTrabalhoLayout);
        jPanelTurnoTrabalhoLayout.setHorizontalGroup(
            jPanelTurnoTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        jPanelTurnoTrabalhoLayout.setVerticalGroup(
            jPanelTurnoTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanelNivelExp.setBackground(new java.awt.Color(102, 0, 0));
        jPanelNivelExp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nível de Experiência", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanelNivelExpLayout = new javax.swing.GroupLayout(jPanelNivelExp);
        jPanelNivelExp.setLayout(jPanelNivelExpLayout);
        jPanelNivelExpLayout.setHorizontalGroup(
            jPanelNivelExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelNivelExpLayout.setVerticalGroup(
            jPanelNivelExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 174, Short.MAX_VALUE)
        );

        jPanelSalvarCadastro.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout jPanelSalvarCadastroLayout = new javax.swing.GroupLayout(jPanelSalvarCadastro);
        jPanelSalvarCadastro.setLayout(jPanelSalvarCadastroLayout);
        jPanelSalvarCadastroLayout.setHorizontalGroup(
            jPanelSalvarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelSalvarCadastroLayout.setVerticalGroup(
            jPanelSalvarCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 62, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBeneficios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTurnoTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelNivelExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelSalvarCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNomeFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBeneficios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelTurnoTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelNivelExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelSalvarCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new SistemaCadastro().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelImagNomeCadastroFun;
    private javax.swing.JLabel jLabelNomeCadastroFun;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBeneficios;
    private javax.swing.JPanel jPanelNivelExp;
    private javax.swing.JPanel jPanelNomeFunc;
    private javax.swing.JPanel jPanelSalvarCadastro;
    private javax.swing.JPanel jPanelSetor;
    private javax.swing.JPanel jPanelTurnoTrabalho;
    // End of variables declaration//GEN-END:variables

}
