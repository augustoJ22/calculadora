package Principal;


import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Calculadora extends javax.swing.JFrame {

    String telaTxt = "";
    int tamanhoExp;
    String variavelConta;
    String ordemOps;
    ArrayList<Double> incognitas;
    double resultado;
    
    public Calculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        incognitas = new ArrayList();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        tela = new javax.swing.JTextField();
        botaoC = new javax.swing.JButton();
        botaoCE = new javax.swing.JButton();
        botaoIgual = new javax.swing.JButton();
        botaoMenos = new javax.swing.JButton();
        botao9 = new javax.swing.JButton();
        botao8 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botaoMult = new javax.swing.JButton();
        botao1 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botaoMais = new javax.swing.JButton();
        botaoDiv = new javax.swing.JButton();
        botaoVirgula = new javax.swing.JButton();
        botao0 = new javax.swing.JButton();
        botaoSemFuncao2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setBackground(java.awt.SystemColor.activeCaptionBorder);
        setResizable(false);

        background.setBackground(new java.awt.Color(153, 153, 255));
        background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tela.setEditable(false);
        tela.setBackground(new java.awt.Color(255, 255, 255));
        tela.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        tela.setForeground(new java.awt.Color(0, 0, 0));
        tela.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tela.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                telaFocusGained(evt);
            }
        });
        tela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telaActionPerformed(evt);
            }
        });
        tela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telaKeyPressed(evt);
            }
        });

        botaoC.setBackground(new java.awt.Color(204, 204, 255));
        botaoC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoC.setText("C");
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });

        botaoCE.setBackground(new java.awt.Color(204, 204, 255));
        botaoCE.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoCE.setText("CE");
        botaoCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCEActionPerformed(evt);
            }
        });

        botaoIgual.setBackground(new java.awt.Color(204, 204, 255));
        botaoIgual.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        botaoIgual.setText("=");
        botaoIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoIgualActionPerformed(evt);
            }
        });

        botaoMenos.setBackground(new java.awt.Color(204, 204, 255));
        botaoMenos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoMenos.setText("-");
        botaoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMenosActionPerformed(evt);
            }
        });

        botao9.setBackground(new java.awt.Color(204, 204, 255));
        botao9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao9.setText("9");
        botao9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao9ActionPerformed(evt);
            }
        });

        botao8.setBackground(new java.awt.Color(204, 204, 255));
        botao8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao8.setText("8");
        botao8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao8ActionPerformed(evt);
            }
        });

        botao7.setBackground(new java.awt.Color(204, 204, 255));
        botao7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao7.setText("7");
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        botao7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao7KeyPressed(evt);
            }
        });

        botao3.setBackground(new java.awt.Color(204, 204, 255));
        botao3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao3.setText("3");
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });

        botao2.setBackground(new java.awt.Color(204, 204, 255));
        botao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao2.setText("2");
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });

        botaoMult.setBackground(new java.awt.Color(204, 204, 255));
        botaoMult.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoMult.setText("x");
        botaoMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMultActionPerformed(evt);
            }
        });

        botao1.setBackground(new java.awt.Color(204, 204, 255));
        botao1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao1.setText("1");
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });

        botao4.setBackground(new java.awt.Color(204, 204, 255));
        botao4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao4.setText("4");
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });

        botao5.setBackground(new java.awt.Color(204, 204, 255));
        botao5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao5.setText("5");
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });

        botao6.setBackground(new java.awt.Color(204, 204, 255));
        botao6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao6.setText("6");
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });

        botaoMais.setBackground(new java.awt.Color(204, 204, 255));
        botaoMais.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoMais.setText("+");
        botaoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoMaisActionPerformed(evt);
            }
        });

        botaoDiv.setBackground(new java.awt.Color(204, 204, 255));
        botaoDiv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoDiv.setText("/");
        botaoDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDivActionPerformed(evt);
            }
        });

        botaoVirgula.setBackground(new java.awt.Color(204, 204, 255));
        botaoVirgula.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoVirgula.setText(",");
        botaoVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVirgulaActionPerformed(evt);
            }
        });

        botao0.setBackground(new java.awt.Color(204, 204, 255));
        botao0.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botao0.setText("0");
        botao0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao0ActionPerformed(evt);
            }
        });
        botao0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                botao0KeyPressed(evt);
            }
        });

        botaoSemFuncao2.setBackground(new java.awt.Color(204, 204, 255));
        botaoSemFuncao2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        botaoSemFuncao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSemFuncao2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botaoIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoSemFuncao2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botaoCE, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botaoC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botaoIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoMult, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoSemFuncao2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botaoIgual.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void telaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telaActionPerformed
        
    }//GEN-LAST:event_telaActionPerformed

    private void botaoCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCEActionPerformed
        telaTxt = "";
        tela.requestFocus(); 
    }//GEN-LAST:event_botaoCEActionPerformed

    private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
        telaTxt +="9";
        tela.requestFocus();
    }//GEN-LAST:event_botao9ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        telaTxt +="7";
        tela.requestFocus();
    }//GEN-LAST:event_botao7ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        telaTxt +="3";
        tela.requestFocus();
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        telaTxt +="1";
        tela.requestFocus();
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        telaTxt +="4";
        tela.requestFocus();
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        telaTxt +="6";
        tela.requestFocus();
    }//GEN-LAST:event_botao6ActionPerformed

    private void botaoVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVirgulaActionPerformed
        telaTxt +=",";
        tela.requestFocus();
    }//GEN-LAST:event_botaoVirgulaActionPerformed

    private void botaoSemFuncao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSemFuncao2ActionPerformed
        tela.requestFocus();
    }//GEN-LAST:event_botaoSemFuncao2ActionPerformed

    private void botaoMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultActionPerformed
        telaTxt +="*";
        tela.requestFocus();
    }//GEN-LAST:event_botaoMultActionPerformed

    private void botao7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao7KeyPressed
        tela.requestFocus();
    }//GEN-LAST:event_botao7KeyPressed

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        tamanhoExp = telaTxt.length();
        if(tamanhoExp>0){
        telaTxt = telaTxt.substring(0, tamanhoExp-1);
        }
        tela.requestFocus();
    }//GEN-LAST:event_botaoCActionPerformed

    private void botao0KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_botao0KeyPressed
        tela.requestFocus();
    }//GEN-LAST:event_botao0KeyPressed

    private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
        telaTxt +="0";
        tela.requestFocus();
    }//GEN-LAST:event_botao0ActionPerformed

    private void botaoIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoIgualActionPerformed
        tela.requestFocus();
    }//GEN-LAST:event_botaoIgualActionPerformed

    private void telaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telaKeyPressed
        telaTxt = tela.getText();
        //Números
        if(evt.getKeyCode() == evt.VK_NUMPAD0){
            telaTxt += "0";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD1){
            telaTxt += "1";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD2){
            telaTxt += "2";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD3){
            telaTxt += "3";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD4){
            telaTxt += "4";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD5){
            telaTxt += "5";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD6){
            telaTxt += "6";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD7){
            telaTxt += "7";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD8){
            telaTxt += "8";
        }else if(evt.getKeyCode() == evt.VK_NUMPAD9){
            telaTxt += "9";
        }
        //Operadores
        else if(evt.getKeyCode() == evt.VK_ADD){
            telaTxt += "+";
        }else if(evt.getKeyCode() == evt.VK_SUBTRACT){
            telaTxt += "-";
        }else if(evt.getKeyCode() == evt.VK_DIVIDE){
            telaTxt += "/";
        }else if(evt.getKeyCode() == evt.VK_MULTIPLY){
            telaTxt += "*";
        }
        //Decimal
        else if(evt.getKeyCode() == evt.VK_DECIMAL){
            telaTxt += ",";
        }
        //Comandos
        else if(evt.getKeyCode() == evt.VK_DELETE){
            telaTxt = "";
            incognitas.clear();
            ordemOps = "";
            
        }else if(evt.getKeyCode() == evt.VK_BACK_SPACE){
            tamanhoExp = telaTxt.length();
            if(tamanhoExp>0){
            telaTxt = telaTxt.substring(0, tamanhoExp-1);
            }
            incognitas.clear();
            ordemOps = "";
        }
        
        //igual
        else if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            Traducao();
            Expressao();
            Calculo();
            incognitas.clear();
            resultado = 0;
        }else if(evt.getKeyCode()== KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
        
        tela.setText(telaTxt);
    }//GEN-LAST:event_telaKeyPressed

    private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
        telaTxt +="8";
        tela.requestFocus();
    }//GEN-LAST:event_botao8ActionPerformed

    private void botaoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMenosActionPerformed
        telaTxt +="-";
        tela.requestFocus();
    }//GEN-LAST:event_botaoMenosActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        telaTxt +="5";
        tela.requestFocus();
    }//GEN-LAST:event_botao5ActionPerformed

    private void botaoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMaisActionPerformed
        telaTxt +="+";
        tela.requestFocus();
    }//GEN-LAST:event_botaoMaisActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        telaTxt +="2";
        tela.requestFocus();
    }//GEN-LAST:event_botao2ActionPerformed

    private void botaoDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDivActionPerformed
        telaTxt +="/";
        tela.requestFocus();
    }//GEN-LAST:event_botaoDivActionPerformed

    private void telaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telaFocusGained
        tela.setText(telaTxt);
    }//GEN-LAST:event_telaFocusGained
    private void Traducao(){
        variavelConta = telaTxt;
        ordemOps = telaTxt;
        
        ordemOps = ordemOps.replace("-", "+-");
        if (ordemOps.startsWith("+")) {
            ordemOps = ordemOps.substring(1, ordemOps.length());
        }ordemOps = ordemOps.replace("1", "");
        ordemOps = ordemOps.replace("2", "");
        ordemOps = ordemOps.replace("3", "");
        ordemOps = ordemOps.replace("4", "");
        ordemOps = ordemOps.replace("5", "");
        ordemOps = ordemOps.replace("6", "");
        ordemOps = ordemOps.replace("7", "");
        ordemOps = ordemOps.replace("8", "");
        ordemOps = ordemOps.replace("9", "");
        ordemOps = ordemOps.replace("-", "");
        ordemOps = ordemOps.replace(",", "");
        
        
        variavelConta = variavelConta.replace("-", "+-");
        if (variavelConta.startsWith("+")) {
            variavelConta = variavelConta.substring(1, variavelConta.length());
        }variavelConta = variavelConta.replace("+", "x");
        variavelConta = variavelConta.replace("/", "x");
        variavelConta = variavelConta.replace("*", "x");
        variavelConta = variavelConta.replace(",", ".");
        
    }
    private void Expressao(){
        
        if (variavelConta.contains("xx")||variavelConta.contains("-.")||variavelConta.contains(".-")||variavelConta.endsWith("x")
                ||variavelConta.endsWith(".")||variavelConta.startsWith(".")||variavelConta.startsWith("x")) {     
                //caso hajam 2 operadosre juntos apresenta uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Há algo de errado com a expressão...");
        }else if (!variavelConta.contains("x")) {
            resultado = Float.parseFloat(variavelConta);
        }else{                                  //caso contrario executa normalmente
            while (variavelConta.length()>0) {//inicio da repetição que adiciona as incognitas em uma lista
                if(variavelConta.contains("x")){//enquanto ouver um operador:
                    int qnt = variavelConta.length();//captura a quantidade de caracteres da operação...
                    int qntX = variavelConta.indexOf("x")+1;//...e a posição do primeiro operador
                    incognitas.add(Double.parseDouble(variavelConta.substring(0, variavelConta.indexOf("x"))));//...
                    //...salva na lista os números da posição inicial até o primeiro operador
                    variavelConta = variavelConta.substring(qntX, qnt);//retira-se a incognita...
                    //...salva na lista anteriormente da operação geral
                }else{//caso não haja mais operadores:
                    incognitas.add(Double.parseDouble(variavelConta));//salva o restante como uma última incógnita
                    variavelConta = "";//zera a variavel de operação para finalizar a repetição
                }
            }//fim da repetição
            
            
            
        }
        
    }
    private void Calculo(){
        //aqui é onde o filho chora... e a mãe chora junto
        while (ordemOps.contains("/")||ordemOps.contains("*")) {    //enquanto hoverem operadores com preferencia executa primeiro
            
            if (ordemOps.contains("/")&&((ordemOps.indexOf("/")<ordemOps.indexOf("*"))||(ordemOps.contains("/")&&!ordemOps.contains("*")))) {
                int x = ordemOps.indexOf("/");
                BigDecimal inc1 = BigDecimal.valueOf(incognitas.get(x));
                BigDecimal inc2 = BigDecimal.valueOf(incognitas.get(x+1));
                BigDecimal inc3 = inc1.divide(inc2);
                
                incognitas.set(x+1, Double.parseDouble(inc3.toString()));
                incognitas.set(x, 0.0);
                ordemOps = ordemOps.replaceFirst("/", "");
                
            }else if (ordemOps.contains("*")&&((ordemOps.indexOf("*")<ordemOps.indexOf("/"))||(ordemOps.contains("*")&&!ordemOps.contains("/")))){
                int x = ordemOps.indexOf("/");
                BigDecimal inc01 = BigDecimal.valueOf(incognitas.get(x));
                BigDecimal inc02 = BigDecimal.valueOf(incognitas.get(x+1));
                BigDecimal inc03 = inc01.multiply(inc02);
                
                incognitas.set(x+1, Double.parseDouble(inc03.toString()));
                
                incognitas.set(x, 0.0);
                ordemOps = ordemOps.replaceFirst("\\*", "");
            }
        }
        for (int i = 0; i < incognitas.size(); i++) {
            resultado = resultado + incognitas.get(i);
        }
        telaTxt = String.valueOf(resultado);
    }
    
    
    
    
    @SuppressWarnings("Convert2Lambda")
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton botao0;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JButton botao8;
    private javax.swing.JButton botao9;
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCE;
    private javax.swing.JButton botaoDiv;
    private javax.swing.JButton botaoIgual;
    private javax.swing.JButton botaoMais;
    private javax.swing.JButton botaoMenos;
    private javax.swing.JButton botaoMult;
    private javax.swing.JButton botaoSemFuncao2;
    private javax.swing.JButton botaoVirgula;
    private javax.swing.JTextField tela;
    // End of variables declaration//GEN-END:variables
}
