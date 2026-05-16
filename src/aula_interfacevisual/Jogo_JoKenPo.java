package aula_interfacevisual;

import java.util.Random;
import javax.swing.JOptionPane;

public class Jogo_JoKenPo extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Jogo_JoKenPo.class.getName());

    public Jogo_JoKenPo() {
        initComponents();
        jTextAreaTela.setText("Escolha Pedra, Papel ou Tesoura.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJoKenPo = new javax.swing.ButtonGroup();
        jPanelEscolhaJoKenPo = new javax.swing.JPanel();
        jRadioButtonPedra = new javax.swing.JRadioButton();
        jRadioButtonPapel = new javax.swing.JRadioButton();
        jRadioButtonTesoura = new javax.swing.JRadioButton();
        jPanelBotao = new javax.swing.JPanel();
        jButtonComecar = new javax.swing.JButton();
        jPanelTela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaTela = new javax.swing.JTextArea();
        jPanelNomeTopo = new javax.swing.JPanel();
        jLabelTituloJoKenPo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedra / Papel / Tesoura");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanelEscolhaJoKenPo.setBackground(new java.awt.Color(102, 0, 0));

        buttonGroupJoKenPo.add(jRadioButtonPedra);
        jRadioButtonPedra.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jRadioButtonPedra.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPedra.setText("  Pedra");

        buttonGroupJoKenPo.add(jRadioButtonPapel);
        jRadioButtonPapel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jRadioButtonPapel.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonPapel.setText("  Papel");

        buttonGroupJoKenPo.add(jRadioButtonTesoura);
        jRadioButtonTesoura.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jRadioButtonTesoura.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonTesoura.setText("  Tesoura");

        javax.swing.GroupLayout jPanelEscolhaJoKenPoLayout = new javax.swing.GroupLayout(jPanelEscolhaJoKenPo);
        jPanelEscolhaJoKenPo.setLayout(jPanelEscolhaJoKenPoLayout);
        jPanelEscolhaJoKenPoLayout.setHorizontalGroup(
            jPanelEscolhaJoKenPoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaJoKenPoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanelEscolhaJoKenPoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonPedra)
                    .addComponent(jRadioButtonPapel)
                    .addComponent(jRadioButtonTesoura))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanelEscolhaJoKenPoLayout.setVerticalGroup(
            jPanelEscolhaJoKenPoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEscolhaJoKenPoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jRadioButtonPedra)
                .addGap(36, 36, 36)
                .addComponent(jRadioButtonPapel)
                .addGap(36, 36, 36)
                .addComponent(jRadioButtonTesoura)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanelBotao.setBackground(new java.awt.Color(102, 0, 0));

        jButtonComecar.setBackground(new java.awt.Color(54, 47, 47));
        jButtonComecar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonComecar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComecar.setText("Começar!");
        jButtonComecar.addActionListener(this::jButtonComecarActionPerformed);

        javax.swing.GroupLayout jPanelBotaoLayout = new javax.swing.GroupLayout(jPanelBotao);
        jPanelBotao.setLayout(jPanelBotaoLayout);
        jPanelBotaoLayout.setHorizontalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotaoLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jButtonComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanelBotaoLayout.setVerticalGroup(
            jPanelBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotaoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jButtonComecar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTela.setBackground(new java.awt.Color(102, 0, 0));

        jTextAreaTela.setEditable(false);
        jTextAreaTela.setBackground(new java.awt.Color(0, 0, 0));
        jTextAreaTela.setColumns(19);
        jTextAreaTela.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextAreaTela.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaTela.setRows(3);
        jTextAreaTela.setTabSize(5);
        jScrollPane1.setViewportView(jTextAreaTela);

        javax.swing.GroupLayout jPanelTelaLayout = new javax.swing.GroupLayout(jPanelTela);
        jPanelTela.setLayout(jPanelTelaLayout);
        jPanelTelaLayout.setHorizontalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTelaLayout.setVerticalGroup(
            jPanelTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTelaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanelNomeTopo.setBackground(new java.awt.Color(102, 0, 0));

        jLabelTituloJoKenPo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTituloJoKenPo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloJoKenPo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloJoKenPo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-arcade-de-maçã-50.png"))); // NOI18N
        jLabelTituloJoKenPo.setText(" Jogo Pedra  Papel  Tesoura");
        jLabelTituloJoKenPo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelNomeTopoLayout = new javax.swing.GroupLayout(jPanelNomeTopo);
        jPanelNomeTopo.setLayout(jPanelNomeTopoLayout);
        jPanelNomeTopoLayout.setHorizontalGroup(
            jPanelNomeTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomeTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloJoKenPo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelNomeTopoLayout.setVerticalGroup(
            jPanelNomeTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNomeTopoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabelTituloJoKenPo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelEscolhaJoKenPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanelNomeTopo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelNomeTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBotao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelEscolhaJoKenPo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComecarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComecarActionPerformed

        String escolha01 = "", mensagem = "", computador = "";

        if (jRadioButtonPedra.isSelected()) {
            escolha01 = "Pedra";
        } else if (jRadioButtonPapel.isSelected()) {
            escolha01 = "Papel";
        } else if (jRadioButtonTesoura.isSelected()) {
            escolha01 = "Tesoura";
        }

        Random valorGerado = new Random();
        int randomico = valorGerado.nextInt(3);

        String escolha02 = "";

        if (randomico == 0) {
            escolha02 = "Pedra";
        } else if (randomico == 1) {
            escolha02 = "Papel";
        } else if (randomico == 2) {
            escolha02 = "Tesoura";
        }

        mensagem += "Você escolheu: " + escolha01 + "\n";
        mensagem += "Computador: " + escolha02 + "\n";

        if (escolha01.equals("")) {
            jTextAreaTela.setText("Escolha Pedra, Papel ou Tesoura.");
            JOptionPane.showMessageDialog(null, "Escolha Pedra, Papel ou Tesoura!", "Vazio", JOptionPane.ERROR_MESSAGE);
            return;
        }else if (escolha01.equals(escolha02)) {
            mensagem += "EMPATE!";

        } else if (escolha01.equals("Pedra") && escolha02.equals("Tesoura") || escolha01.equals("Papel") && escolha02.equals("Pedra") || escolha01.equals("Tesoura") && escolha02.equals("Papel")) {
            mensagem += "Você GANHOU!";
        } else {
            mensagem += "Você PERDEU!";
        }

        jTextAreaTela.setText(mensagem);

        buttonGroupJoKenPo.clearSelection();

    }//GEN-LAST:event_jButtonComecarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> new Jogo_JoKenPo().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupJoKenPo;
    private javax.swing.JButton jButtonComecar;
    private javax.swing.JLabel jLabelTituloJoKenPo;
    private javax.swing.JPanel jPanelBotao;
    private javax.swing.JPanel jPanelEscolhaJoKenPo;
    private javax.swing.JPanel jPanelNomeTopo;
    private javax.swing.JPanel jPanelTela;
    private javax.swing.JRadioButton jRadioButtonPapel;
    private javax.swing.JRadioButton jRadioButtonPedra;
    private javax.swing.JRadioButton jRadioButtonTesoura;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaTela;
    // End of variables declaration//GEN-END:variables

}
