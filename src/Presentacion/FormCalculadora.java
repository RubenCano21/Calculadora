/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import negocio.Calculadora;
import negocio.PilaLista;
import negocio.Postfijo;

/**
 *
 * @author Cano
 */
public class FormCalculadora extends javax.swing.JFrame {

    String expresion = "";
    Calculadora A;
    PilaLista aux = new PilaLista();
    /**
     * Creates new form FormCalculadora
     */
    public FormCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        A = new Calculadora(expresion);
        jComboBox1.setVisible(false);
        //cbxExpresionPostFija.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMostrar = new javax.swing.JPanel();
        txtMostrar = new javax.swing.JTextField();
        lbResultado = new javax.swing.JLabel();
        btnHistorial = new javax.swing.JButton();
        btnNum_7 = new javax.swing.JButton();
        btnNum_4 = new javax.swing.JButton();
        btnNum_1 = new javax.swing.JButton();
        btnNum_2 = new javax.swing.JButton();
        btnNum_5 = new javax.swing.JButton();
        btnNum_8 = new javax.swing.JButton();
        bntParentesisApertura = new javax.swing.JButton();
        btnNum_3 = new javax.swing.JButton();
        btnNum_6 = new javax.swing.JButton();
        btnNum_9 = new javax.swing.JButton();
        btnParentesisCierre = new javax.swing.JButton();
        btnNum_0 = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnSumar = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnParentesisCierre1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        pnlMostrar.setBorder(new javax.swing.border.MatteBorder(null));
        pnlMostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMostrar.setBackground(new java.awt.Color(255, 255, 255));
        txtMostrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtMostrar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlMostrar.add(txtMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 50));

        lbResultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(0, 0, 0));
        lbResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbResultado.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnlMostrar.add(lbResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 370, 40));

        btnHistorial.setBackground(new java.awt.Color(0, 204, 51));
        btnHistorial.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnHistorial.setText("H");
        btnHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialActionPerformed(evt);
            }
        });

        btnNum_7.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_7.setText("7");
        btnNum_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_7ActionPerformed(evt);
            }
        });

        btnNum_4.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_4.setText("4");
        btnNum_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_4ActionPerformed(evt);
            }
        });

        btnNum_1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_1.setText("1");
        btnNum_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_1ActionPerformed(evt);
            }
        });

        btnNum_2.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_2.setText("2");
        btnNum_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_2ActionPerformed(evt);
            }
        });

        btnNum_5.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_5.setText("5");
        btnNum_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_5ActionPerformed(evt);
            }
        });

        btnNum_8.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_8.setText("8");
        btnNum_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_8ActionPerformed(evt);
            }
        });

        bntParentesisApertura.setBackground(new java.awt.Color(0, 153, 255));
        bntParentesisApertura.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        bntParentesisApertura.setText("(");
        bntParentesisApertura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntParentesisAperturaActionPerformed(evt);
            }
        });

        btnNum_3.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_3.setText("3");
        btnNum_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_3ActionPerformed(evt);
            }
        });

        btnNum_6.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_6.setText("6");
        btnNum_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_6ActionPerformed(evt);
            }
        });

        btnNum_9.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_9.setText("9");
        btnNum_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_9ActionPerformed(evt);
            }
        });

        btnParentesisCierre.setBackground(new java.awt.Color(0, 153, 255));
        btnParentesisCierre.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnParentesisCierre.setText(")");
        btnParentesisCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesisCierreActionPerformed(evt);
            }
        });

        btnNum_0.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnNum_0.setText("0");
        btnNum_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum_0ActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnLimpiar.setText("AC");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnPunto.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 153, 204));
        btnIgual.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btnDivision.setBackground(new java.awt.Color(0, 153, 255));
        btnDivision.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });

        btnMultiplicar.setBackground(new java.awt.Color(0, 153, 255));
        btnMultiplicar.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicarActionPerformed(evt);
            }
        });

        btnRestar.setBackground(new java.awt.Color(0, 153, 255));
        btnRestar.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnRestar.setText("-");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnSumar.setBackground(new java.awt.Color(0, 153, 255));
        btnSumar.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnSumar.setText("+");
        btnSumar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnExp.setBackground(new java.awt.Color(0, 153, 255));
        btnExp.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnExp.setText("^");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 0));
        btnBorrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBorrar.setText("DEL");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnParentesisCierre1.setBackground(new java.awt.Color(0, 153, 255));
        btnParentesisCierre1.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        btnParentesisCierre1.setText("%");
        btnParentesisCierre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParentesisCierre1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntParentesisApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnParentesisCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnParentesisCierre1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnNum_0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnNum_5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum_1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNum_2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnNum_8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum_3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum_6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum_9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(btnNum_4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum_7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(pnlMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntParentesisApertura, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParentesisCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParentesisCierre1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum_7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum_8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNum_9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum_4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum_5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum_6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNum_1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum_2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNum_3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNum_0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNum_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_0ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "0");
        aux.push("0");
    }//GEN-LAST:event_btnNum_0ActionPerformed

    private void btnNum_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_1ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "1");
        aux.push(btnNum_1.getText());
    }//GEN-LAST:event_btnNum_1ActionPerformed

    private void btnNum_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_2ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "2");
        aux.push("2");
    }//GEN-LAST:event_btnNum_2ActionPerformed

    private void btnNum_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_3ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "3");
        aux.push("3");
    }//GEN-LAST:event_btnNum_3ActionPerformed

    private void btnNum_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_4ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "4");
        aux.push("4");
    }//GEN-LAST:event_btnNum_4ActionPerformed

    private void btnNum_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_5ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "5");
        aux.push("5");
    }//GEN-LAST:event_btnNum_5ActionPerformed

    private void btnNum_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_6ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "6");
        aux.push("6");
    }//GEN-LAST:event_btnNum_6ActionPerformed

    private void btnNum_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_7ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "7");
        aux.push("7");
    }//GEN-LAST:event_btnNum_7ActionPerformed

    private void btnNum_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_8ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "8");
        aux.push("8");
    }//GEN-LAST:event_btnNum_8ActionPerformed

    private void btnNum_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum_9ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "9");
        aux.push("9");
    }//GEN-LAST:event_btnNum_9ActionPerformed

    private void bntParentesisAperturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntParentesisAperturaActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "(");
        aux.push("(");
    }//GEN-LAST:event_bntParentesisAperturaActionPerformed

    private void btnParentesisCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesisCierreActionPerformed
        txtMostrar.setText(txtMostrar.getText() + ")");
        aux.push(")");
    }//GEN-LAST:event_btnParentesisCierreActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "/");
        aux.push("/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicarActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "*");
        aux.push("*");
    }//GEN-LAST:event_btnMultiplicarActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "^");
        aux.push("^");
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "-");
        aux.push("-");
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "+");
        aux.push("+");
    }//GEN-LAST:event_btnSumarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtMostrar.setText(txtMostrar.getText().substring(0, 
                txtMostrar.getText().length()-1));
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        expresion = "";
        txtMostrar.setText(expresion);
        lbResultado.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
            Postfijo op=new Postfijo();
            op.InfijaPostija(txtMostrar.getText());
            lbResultado.setText(op.getResultado());
            jComboBox1.addItem(txtMostrar.getText());
           // cbxExpresionPostFija.addItem(op.getResultado());
           
    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        txtMostrar.setText(txtMostrar.getText() + ".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialActionPerformed
        jComboBox1.setVisible(true);
    }//GEN-LAST:event_btnHistorialActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        txtMostrar.setText(jComboBox1.getSelectedItem().toString());
        lbResultado.setText("");
        Postfijo op=new Postfijo();
        op.InfijaPostija(txtMostrar.getText());
        lbResultado.setText(op.getResultado());
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnParentesisCierre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParentesisCierre1ActionPerformed
        txtMostrar.setText(txtMostrar.getText() + "%");
    }//GEN-LAST:event_btnParentesisCierre1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntParentesisApertura;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNum_0;
    private javax.swing.JButton btnNum_1;
    private javax.swing.JButton btnNum_2;
    private javax.swing.JButton btnNum_3;
    private javax.swing.JButton btnNum_4;
    private javax.swing.JButton btnNum_5;
    private javax.swing.JButton btnNum_6;
    private javax.swing.JButton btnNum_7;
    private javax.swing.JButton btnNum_8;
    private javax.swing.JButton btnNum_9;
    private javax.swing.JButton btnParentesisCierre;
    private javax.swing.JButton btnParentesisCierre1;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JPanel pnlMostrar;
    private javax.swing.JTextField txtMostrar;
    // End of variables declaration//GEN-END:variables
}
