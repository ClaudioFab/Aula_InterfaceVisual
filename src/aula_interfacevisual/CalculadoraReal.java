
package aula_interfacevisual;

import javax.swing.JOptionPane;

public class CalculadoraReal extends javax.swing.JFrame {

    public CalculadoraReal() {
        initComponents();
    }
    
    double numX = 0, numY = 0;
    String operador = "";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBotoes = new javax.swing.JPanel();
        jButtonNum0 = new javax.swing.JButton();
        jButtonNum1 = new javax.swing.JButton();
        jButtonNum2 = new javax.swing.JButton();
        jButtonNum3 = new javax.swing.JButton();
        jButtonNum4 = new javax.swing.JButton();
        jButtonNum5 = new javax.swing.JButton();
        jButtonNum6 = new javax.swing.JButton();
        jButtonNum7 = new javax.swing.JButton();
        jButtonNum8 = new javax.swing.JButton();
        jButtonNum9 = new javax.swing.JButton();
        jButtonPonto = new javax.swing.JButton();
        jButtonIgual = new javax.swing.JButton();
        jButtonDividir = new javax.swing.JButton();
        jButtonMultiplicar = new javax.swing.JButton();
        jButtonSubtrair = new javax.swing.JButton();
        jButtonSomar = new javax.swing.JButton();
        jTextFieldVisorCalculadora = new javax.swing.JTextField();
        jLabelNomeTopo = new javax.swing.JLabel();
        jButtonReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelBotoes.setBackground(new java.awt.Color(102, 0, 0));

        jButtonNum0.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 0.png"))); // NOI18N
        jButtonNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum0ActionPerformed(evt);
            }
        });

        jButtonNum1.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 1.png"))); // NOI18N
        jButtonNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum1ActionPerformed(evt);
            }
        });

        jButtonNum2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 2.png"))); // NOI18N
        jButtonNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum2ActionPerformed(evt);
            }
        });

        jButtonNum3.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 3.png"))); // NOI18N
        jButtonNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum3ActionPerformed(evt);
            }
        });

        jButtonNum4.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 4.png"))); // NOI18N
        jButtonNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum4ActionPerformed(evt);
            }
        });

        jButtonNum5.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 5.png"))); // NOI18N
        jButtonNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum5ActionPerformed(evt);
            }
        });

        jButtonNum6.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 6.png"))); // NOI18N
        jButtonNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum6ActionPerformed(evt);
            }
        });

        jButtonNum7.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 7.png"))); // NOI18N
        jButtonNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum7ActionPerformed(evt);
            }
        });

        jButtonNum8.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 8.png"))); // NOI18N
        jButtonNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum8ActionPerformed(evt);
            }
        });

        jButtonNum9.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNum9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 9.png"))); // NOI18N
        jButtonNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNum9ActionPerformed(evt);
            }
        });

        jButtonPonto.setBackground(new java.awt.Color(255, 255, 255));
        jButtonPonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 ponto.png"))); // NOI18N
        jButtonPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPontoActionPerformed(evt);
            }
        });

        jButtonIgual.setBackground(new java.awt.Color(255, 255, 255));
        jButtonIgual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 igual.png"))); // NOI18N
        jButtonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualActionPerformed(evt);
            }
        });

        jButtonDividir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonDividir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 division.png"))); // NOI18N
        jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDividirActionPerformed(evt);
            }
        });

        jButtonMultiplicar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonMultiplicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 multiply.png"))); // NOI18N
        jButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultiplicarActionPerformed(evt);
            }
        });

        jButtonSubtrair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSubtrair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 minus.png"))); // NOI18N
        jButtonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubtrairActionPerformed(evt);
            }
        });

        jButtonSomar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSomar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons1 plus.png"))); // NOI18N
        jButtonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomarActionPerformed(evt);
            }
        });

        jTextFieldVisorCalculadora.setEditable(false);
        jTextFieldVisorCalculadora.setBackground(new java.awt.Color(0, 0, 0));
        jTextFieldVisorCalculadora.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jTextFieldVisorCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        jTextFieldVisorCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVisorCalculadoraActionPerformed(evt);
            }
        });

        jLabelNomeTopo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelNomeTopo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNomeTopo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomeTopo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-calculadora-de-maçã-50.png"))); // NOI18N
        jLabelNomeTopo.setText("Calculadora Digna");
        jLabelNomeTopo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonReset.setBackground(new java.awt.Color(255, 255, 255));
        jButtonReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-crânio-48.png"))); // NOI18N
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBotoesLayout = new javax.swing.GroupLayout(jPanelBotoes);
        jPanelBotoes.setLayout(jPanelBotoesLayout);
        jPanelBotoesLayout.setHorizontalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanelBotoesLayout.createSequentialGroup()
                            .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                    .addComponent(jButtonNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88))
                                .addGroup(jPanelBotoesLayout.createSequentialGroup()
                                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jButtonSubtrair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelBotoesLayout.createSequentialGroup()
                            .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                    .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                                    .addComponent(jButtonNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jTextFieldVisorCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomeTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelBotoesLayout.setVerticalGroup(
            jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelNomeTopo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldVisorCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jButtonNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jButtonNum1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBotoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    private void jButtonNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum1ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "1");
    }//GEN-LAST:event_jButtonNum1ActionPerformed

    private void jButtonNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum2ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "2");
    }//GEN-LAST:event_jButtonNum2ActionPerformed

    private void jButtonNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum3ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "3");
    }//GEN-LAST:event_jButtonNum3ActionPerformed

    private void jButtonNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum4ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "4");
    }//GEN-LAST:event_jButtonNum4ActionPerformed

    private void jButtonNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum5ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "5");
    }//GEN-LAST:event_jButtonNum5ActionPerformed

    private void jButtonNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum6ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "6");
    }//GEN-LAST:event_jButtonNum6ActionPerformed

    private void jButtonNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum7ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "7");
    }//GEN-LAST:event_jButtonNum7ActionPerformed

    private void jButtonNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum8ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "8");
    }//GEN-LAST:event_jButtonNum8ActionPerformed

    private void jButtonNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum9ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "9");
    }//GEN-LAST:event_jButtonNum9ActionPerformed

    private void jButtonNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNum0ActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + "0");
    }//GEN-LAST:event_jButtonNum0ActionPerformed

    private void jButtonPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPontoActionPerformed
        jTextFieldVisorCalculadora.setText(jTextFieldVisorCalculadora.getText() + ".");
    }//GEN-LAST:event_jButtonPontoActionPerformed

    private void jButtonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualActionPerformed
        numY = Double.parseDouble(jTextFieldVisorCalculadora.getText());
        jTextFieldVisorCalculadora.setText("");
        
        switch (operador) {
            case "+":
                jTextFieldVisorCalculadora.setText(String.valueOf(numX+numY));
                break;
            case "-":
                jTextFieldVisorCalculadora.setText(String.valueOf(numX-numY));
                break;
            case "*":
                jTextFieldVisorCalculadora.setText(String.valueOf(numX*numY));
                break;
            case "/":
                jTextFieldVisorCalculadora.setText(String.valueOf(numX/numY));
                break;
            default:
                JOptionPane.showMessageDialog(null,"Erro!","Erro",JOptionPane.ERROR_MESSAGE);
                throw new AssertionError();
        }
        
        
        
        
    }//GEN-LAST:event_jButtonIgualActionPerformed

    private void jButtonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomarActionPerformed
        numX = Double.parseDouble(jTextFieldVisorCalculadora.getText());
        jTextFieldVisorCalculadora.setText("+");
        operador = "+";  
    }//GEN-LAST:event_jButtonSomarActionPerformed

    private void jButtonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubtrairActionPerformed
        numX = Double.parseDouble(jTextFieldVisorCalculadora.getText());
        jTextFieldVisorCalculadora.setText("-");
        operador = "-";
    }//GEN-LAST:event_jButtonSubtrairActionPerformed

    private void jButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiplicarActionPerformed
        numX = Double.parseDouble(jTextFieldVisorCalculadora.getText());
        jTextFieldVisorCalculadora.setText("*");
        operador = "*";
    }//GEN-LAST:event_jButtonMultiplicarActionPerformed

    private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
        numX = Double.parseDouble(jTextFieldVisorCalculadora.getText());
        jTextFieldVisorCalculadora.setText("/");
        operador = "/";
    }//GEN-LAST:event_jButtonDividirActionPerformed

    private void jTextFieldVisorCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVisorCalculadoraActionPerformed
        //nada
    }//GEN-LAST:event_jTextFieldVisorCalculadoraActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        jTextFieldVisorCalculadora.setText("Resetar!");
        JOptionPane.showMessageDialog(null,"Resetar!");
        jTextFieldVisorCalculadora.setText("");
    }//GEN-LAST:event_jButtonResetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculadoraReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraReal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraReal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDividir;
    private javax.swing.JButton jButtonIgual;
    private javax.swing.JButton jButtonMultiplicar;
    private javax.swing.JButton jButtonNum0;
    private javax.swing.JButton jButtonNum1;
    private javax.swing.JButton jButtonNum2;
    private javax.swing.JButton jButtonNum3;
    private javax.swing.JButton jButtonNum4;
    private javax.swing.JButton jButtonNum5;
    private javax.swing.JButton jButtonNum6;
    private javax.swing.JButton jButtonNum7;
    private javax.swing.JButton jButtonNum8;
    private javax.swing.JButton jButtonNum9;
    private javax.swing.JButton jButtonPonto;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonSomar;
    private javax.swing.JButton jButtonSubtrair;
    private javax.swing.JLabel jLabelNomeTopo;
    private javax.swing.JPanel jPanelBotoes;
    private javax.swing.JTextField jTextFieldVisorCalculadora;
    // End of variables declaration//GEN-END:variables
}
