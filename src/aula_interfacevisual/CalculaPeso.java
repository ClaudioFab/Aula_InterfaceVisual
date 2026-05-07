package aula_interfacevisual;

public class CalculaPeso extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CalculaPeso.class.getName());

    public CalculaPeso() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelCalculaGravit = new javax.swing.JLabel();
        jLabelNomePeso = new javax.swing.JLabel();
        txfPesoTerra = new javax.swing.JTextField();
        jcbPlanetas = new javax.swing.JComboBox<>();

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

        jcbPlanetas.setBackground(new java.awt.Color(0, 0, 0));
        jcbPlanetas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbPlanetas.setForeground(new java.awt.Color(255, 255, 255));
        jcbPlanetas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno", "Lua", "(Plutão)" }));

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
                            .addComponent(jcbPlanetas, 0, 265, Short.MAX_VALUE))
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
                .addComponent(jcbPlanetas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
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

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new CalculaPeso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelCalculaGravit;
    private javax.swing.JLabel jLabelNomePeso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcbPlanetas;
    private javax.swing.JTextField txfPesoTerra;
    // End of variables declaration//GEN-END:variables

}
