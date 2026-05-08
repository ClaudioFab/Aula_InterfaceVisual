package aula_interfacevisual;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CalculaPeso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculaPeso.class.getName());

    public CalculaPeso() {
        initComponents();
    }
    
    public void respostaGravidade(double gravPlaneta){
        String planetaSelecionado = jCBPlanetas.getSelectedItem().toString();
        DecimalFormat df1 = new DecimalFormat("0.0");
        double pesoTerra;
        double pesoPlaneta;
        if(txfPesoTerra.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Entrada inválida!\nDigite apenas números!","Erro",JOptionPane.ERROR_MESSAGE);
           return;
        }
        try {
            pesoTerra = Double.parseDouble(txfPesoTerra.getText());            
            pesoPlaneta = (pesoTerra / 10) * gravPlaneta;
            if(planetaSelecionado.equals("Terra")){
                jLabelResposta.setText(String.valueOf("O seu peso na "+planetaSelecionado+" é: "+df1.format(pesoTerra)+" kg!"));
                JOptionPane.showMessageDialog(null,"O seu peso na "+planetaSelecionado+" é: "+df1.format(pesoTerra)+" kg!",planetaSelecionado,JOptionPane.INFORMATION_MESSAGE);
            }else if(planetaSelecionado.equals("Lua")){
                jLabelResposta.setText(String.valueOf("O seu peso na "+planetaSelecionado+" é: "+df1.format(pesoPlaneta)+" kg!"));
                JOptionPane.showMessageDialog(null,"O seu peso na "+planetaSelecionado+" é: "+df1.format(pesoPlaneta)+" kg!",planetaSelecionado,JOptionPane.INFORMATION_MESSAGE);
            }else{
                jLabelResposta.setText(String.valueOf("O seu peso em "+planetaSelecionado+" é: "+df1.format(pesoPlaneta)+" kg!"));
                JOptionPane.showMessageDialog(null,"O seu peso em "+planetaSelecionado+" é: "+df1.format(pesoPlaneta)+" kg!",planetaSelecionado,JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            txfPesoTerra.setText("");
            JOptionPane.showMessageDialog(null,"Entrada inválida!\nDigite apenas números!","Erro",JOptionPane.ERROR_MESSAGE);
            return; 
        }
        txfPesoTerra.setText("");
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCalculaGravit = new javax.swing.JLabel();
        jLabelNomePeso = new javax.swing.JLabel();
        txfPesoTerra = new javax.swing.JTextField();
        jCBPlanetas = new javax.swing.JComboBox<>();
        jButtonCalculaPeso = new javax.swing.JButton();
        jLabelResposta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora Gravitacional");

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabelCalculaGravit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelCalculaGravit.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCalculaGravit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCalculaGravit.setText("Calculadora Gravitacional");

        jLabelNomePeso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNomePeso.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomePeso.setText("Peso na terra (Kg):");

        txfPesoTerra.setBackground(new java.awt.Color(0, 0, 0));
        txfPesoTerra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txfPesoTerra.setForeground(new java.awt.Color(255, 255, 255));

        jCBPlanetas.setBackground(new java.awt.Color(0, 0, 0));
        jCBPlanetas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jCBPlanetas.setForeground(new java.awt.Color(255, 255, 255));
        jCBPlanetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Lua", "(Plutão)" }));

        jButtonCalculaPeso.setBackground(new java.awt.Color(54, 47, 47));
        jButtonCalculaPeso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCalculaPeso.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCalculaPeso.setText("Calcular Peso");
        jButtonCalculaPeso.addActionListener(this::jButtonCalculaPesoActionPerformed);

        jLabelResposta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelResposta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelResposta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelResposta.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelCalculaGravit, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNomePeso)
                            .addComponent(txfPesoTerra)
                            .addComponent(jCBPlanetas, 0, 265, Short.MAX_VALUE)
                            .addComponent(jButtonCalculaPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelResposta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelCalculaGravit, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabelNomePeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPesoTerra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jCBPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jButtonCalculaPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(jLabelResposta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void jButtonCalculaPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalculaPesoActionPerformed
        String planetaSelecionado = jCBPlanetas.getSelectedItem().toString();
        double gravPlaneta=0.0;
        switch(planetaSelecionado) {
            case "Mercúrio":
                gravPlaneta = 3.6;
                break;            
            case "Vênus":
                gravPlaneta = 8.7;                
                break;            
            case "Terra":
                gravPlaneta = 9.8;
                break;            
            case "Marte":
                gravPlaneta = 3.7;
                break;            
            case "Júpiter":
                gravPlaneta = 24.79;
                break;            
            case "Saturno":
                gravPlaneta = 10.44;
                break;            
            case "Urano":
                gravPlaneta = 8.69;
                break;            
            case "Netuno":
                gravPlaneta = 11.15;
                break;            
            case "Lua":
                gravPlaneta = 1.6;
                break;            
            case "(Plutão)":
                gravPlaneta = 0.62;
                break;            
            default:
                throw new AssertionError();
        }
        respostaGravidade(gravPlaneta);
    }//GEN-LAST:event_jButtonCalculaPesoActionPerformed

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new CalculaPeso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalculaPeso;
    private javax.swing.JComboBox<String> jCBPlanetas;
    private javax.swing.JLabel jLabelCalculaGravit;
    private javax.swing.JLabel jLabelNomePeso;
    private javax.swing.JLabel jLabelResposta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txfPesoTerra;
    // End of variables declaration//GEN-END:variables

}
