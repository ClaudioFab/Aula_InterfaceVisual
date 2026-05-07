package aula_interfacevisual;

import javax.swing.JOptionPane;

public class ComboBox extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ComboBox.class.getName());

    public ComboBox() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBaseComboBox = new javax.swing.JPanel();
        jcbProdutos = new javax.swing.JComboBox<>();
        jLabelNomeComboBox = new javax.swing.JLabel();
        txfProdutoSelecionado = new javax.swing.JTextField();
        jLabelProdutoSeleciona = new javax.swing.JLabel();
        jLabelProdutoSeleciona1 = new javax.swing.JLabel();
        txfNovoProduto = new javax.swing.JTextField();
        jbuttonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Combo Box");

        jPanelBaseComboBox.setBackground(new java.awt.Color(102, 0, 0));
        jPanelBaseComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelBaseComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jPanelBaseComboBox.setFocusable(false);

        jcbProdutos.setBackground(new java.awt.Color(0, 0, 0));
        jcbProdutos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcbProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jcbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pizza de Calabreza 8/8", "Pizza de Frango com Bacon 8/8", "Pizza de Frango e Milho 12/12", "Pizza Portuguesa 12/12", "Pizza Doce Muse Maracujá 6/6" }));
        jcbProdutos.addActionListener(this::jcbProdutosActionPerformed);

        jLabelNomeComboBox.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNomeComboBox.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeComboBox.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeComboBox.setText("Trabalhando com Combo Box");

        txfProdutoSelecionado.setEditable(false);
        txfProdutoSelecionado.setBackground(new java.awt.Color(0, 0, 0));
        txfProdutoSelecionado.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txfProdutoSelecionado.setForeground(new java.awt.Color(255, 255, 255));
        txfProdutoSelecionado.addActionListener(this::txfProdutoSelecionadoActionPerformed);

        jLabelProdutoSeleciona.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProdutoSeleciona.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutoSeleciona.setText("Novo Produto:");

        jLabelProdutoSeleciona1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelProdutoSeleciona1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProdutoSeleciona1.setText("Produto Selecionado:");

        txfNovoProduto.setBackground(new java.awt.Color(0, 0, 0));
        txfNovoProduto.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        txfNovoProduto.setForeground(new java.awt.Color(255, 255, 255));

        jbuttonSalvar.setBackground(new java.awt.Color(54, 47, 47));
        jbuttonSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbuttonSalvar.setForeground(new java.awt.Color(255, 255, 255));
        jbuttonSalvar.setText("Salvar");
        jbuttonSalvar.addActionListener(this::jbuttonSalvarActionPerformed);

        jButtonExcluir.setBackground(new java.awt.Color(54, 47, 47));
        jButtonExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonExcluir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(this::jButtonExcluirActionPerformed);

        javax.swing.GroupLayout jPanelBaseComboBoxLayout = new javax.swing.GroupLayout(jPanelBaseComboBox);
        jPanelBaseComboBox.setLayout(jPanelBaseComboBoxLayout);
        jPanelBaseComboBoxLayout.setHorizontalGroup(
            jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseComboBoxLayout.createSequentialGroup()
                .addGroup(jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBaseComboBoxLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelBaseComboBoxLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelProdutoSeleciona1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelBaseComboBoxLayout.createSequentialGroup()
                                    .addComponent(jbuttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jcbProdutos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfProdutoSelecionado)
                                .addComponent(txfNovoProduto)
                                .addComponent(jLabelProdutoSeleciona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelBaseComboBoxLayout.setVerticalGroup(
            jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseComboBoxLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelNomeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelProdutoSeleciona, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jcbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabelProdutoSeleciona1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfProdutoSelecionado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanelBaseComboBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbuttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBaseComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txfProdutoSelecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfProdutoSelecionadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfProdutoSelecionadoActionPerformed

    private void jcbProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdutosActionPerformed
        String produtoSelecionado = jcbProdutos.getSelectedItem().toString();
        txfProdutoSelecionado.setText(produtoSelecionado);
        
    }//GEN-LAST:event_jcbProdutosActionPerformed

    private void jbuttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuttonSalvarActionPerformed
        try {
            jcbProdutos.addItem(txfNovoProduto.getText());
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro durante o Cadastro!","Erro",JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbuttonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        try {
            String produtoSelecionado = jcbProdutos.getSelectedItem().toString();
            jcbProdutos.removeItem(produtoSelecionado);
            JOptionPane.showMessageDialog(null,"Produto Excluido com sucesso!","Aviso!",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro durante a remoção!","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public static void main(String args[]) {


        java.awt.EventQueue.invokeLater(() -> new ComboBox().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabelNomeComboBox;
    private javax.swing.JLabel jLabelProdutoSeleciona;
    private javax.swing.JLabel jLabelProdutoSeleciona1;
    private javax.swing.JPanel jPanelBaseComboBox;
    private javax.swing.JButton jbuttonSalvar;
    private javax.swing.JComboBox<String> jcbProdutos;
    private javax.swing.JTextField txfNovoProduto;
    private javax.swing.JTextField txfProdutoSelecionado;
    // End of variables declaration//GEN-END:variables

}
