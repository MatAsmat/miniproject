package miniproject;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class EnglishLengthRatioGUI extends javax.swing.JFrame {

    public EnglishLengthRatioGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        rdoInch = new javax.swing.JRadioButton();
        rdoFoot = new javax.swing.JRadioButton();
        rdoYard = new javax.swing.JRadioButton();
        rdoMile = new javax.swing.JRadioButton();
        txtInch = new javax.swing.JTextField();
        txtFoot = new javax.swing.JTextField();
        txtYard = new javax.swing.JTextField();
        txtMile = new javax.swing.JTextField();
        jLabelinch = new javax.swing.JLabel();
        jLabelfoot = new javax.swing.JLabel();
        jLabelkmile = new javax.swing.JLabel();
        jLabelyard = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtResultInch = new javax.swing.JTextField();
        txtResultFoot = new javax.swing.JTextField();
        txtResultYard = new javax.swing.JTextField();
        txtResultMile = new javax.swing.JTextField();
        jLabelmm1 = new javax.swing.JLabel();
        jLabelcm1 = new javax.swing.JLabel();
        jLabelm1 = new javax.swing.JLabel();
        jLabelkm1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrix Length Ratio");

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnConvert.setBackground(new java.awt.Color(0, 153, 0));
        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });

        rdoInch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoInch.setText("นิ้ว");
        rdoInch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoInchActionPerformed(evt);
            }
        });

        rdoFoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoFoot.setText("ฟุต");
        rdoFoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFootActionPerformed(evt);
            }
        });

        rdoYard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoYard.setText("หลา");
        rdoYard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoYardActionPerformed(evt);
            }
        });

        rdoMile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoMile.setText("ไมล์");
        rdoMile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMileActionPerformed(evt);
            }
        });

        txtInch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtInch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtInchCaretUpdate(evt);
            }
        });
        txtInch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtInchFocusLost(evt);
            }
        });
        txtInch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInchActionPerformed(evt);
            }
        });
        txtInch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInchKeyTyped(evt);
            }
        });

        txtFoot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFoot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFootFocusLost(evt);
            }
        });
        txtFoot.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFootKeyTyped(evt);
            }
        });

        txtYard.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtYard.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtYardFocusLost(evt);
            }
        });
        txtYard.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtYardKeyTyped(evt);
            }
        });

        txtMile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMile.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMileFocusLost(evt);
            }
        });
        txtMile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMileKeyTyped(evt);
            }
        });

        jLabelinch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelinch.setText("inch");

        jLabelfoot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelfoot.setText("foot");

        jLabelkmile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelkmile.setText("mile");

        jLabelyard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelyard.setText("yard");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("เลือกหน่วยที่ต้องการแปลง พร้อมระบุตัวเลข");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*** Number only");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClear)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoInch)
                                    .addComponent(rdoFoot)
                                    .addComponent(rdoMile)
                                    .addComponent(rdoYard))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtYard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFoot, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMile, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtInch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelkmile)
                                    .addComponent(jLabelinch)
                                    .addComponent(jLabelfoot)
                                    .addComponent(jLabelyard)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnConvert)
                                .addGap(1, 1, 1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoInch)
                            .addComponent(txtInch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoFoot)
                            .addComponent(txtFoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelfoot))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoYard)
                            .addComponent(txtYard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelyard))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoMile)
                            .addComponent(txtMile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelkmile)))
                    .addComponent(jLabelinch))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnConvert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        txtResultInch.setEditable(false);
        txtResultInch.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultFoot.setEditable(false);
        txtResultFoot.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultYard.setEditable(false);
        txtResultYard.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultMile.setEditable(false);
        txtResultMile.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabelmm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm1.setText("inch =");

        jLabelcm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcm1.setText("foot =");

        jLabelm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelm1.setText("yard =");

        jLabelkm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelkm1.setText("mile");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Result :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtResultInch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelmm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultFoot, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelcm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultYard, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultMile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelkm1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultInch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmm1)
                    .addComponent(txtResultYard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelm1)
                    .addComponent(txtResultMile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelkm1)
                    .addComponent(jLabelcm1)
                    .addComponent(txtResultFoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnExit.setBackground(new java.awt.Color(255, 204, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("หน่วยการวัดความยาวในระบบอังกฤษ");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertActionPerformed
        // TODO add your handling code here:
        float numinch, numfoot, numyard, nummile; //resultinch, resultfoot, resultyard, resultmile;

        if (rdoInch.isSelected()) {

            numinch = Float.parseFloat(txtInch.getText());
            numfoot = (float) (numinch / 10);
            numyard = (float) (numinch / 1000);
            nummile = (float) (numinch / 10000);
            txtResultInch.setText(String.valueOf(numinch));
            txtResultFoot.setText(String.valueOf(numfoot));
            txtResultYard.setText(String.valueOf(numyard));
            txtResultMile.setText(String.valueOf(nummile));
        } else if (rdoFoot.isSelected()) {

            numfoot = Float.parseFloat(txtFoot.getText());
            numinch = numfoot * 10;
            numyard = (float) (numfoot / 100);
            nummile = (float) (numfoot / 1000);
            txtResultInch.setText(String.valueOf(numinch));
            txtResultFoot.setText(String.valueOf(numfoot));
            txtResultYard.setText(String.valueOf(numyard));
            txtResultMile.setText(String.valueOf(nummile));
        } else if (rdoYard.isSelected()) {

            numyard = Float.parseFloat(txtYard.getText());
            numinch = numyard * 1000;
            numfoot = numyard * 100;
            nummile = (float) (numyard * 0.001);
            txtResultInch.setText(String.valueOf(numinch));
            txtResultFoot.setText(String.valueOf(numfoot));
            txtResultYard.setText(String.valueOf(numyard));
            txtResultMile.setText(String.valueOf(nummile));
        } else if (rdoMile.isSelected()) {

            nummile = Float.parseFloat(txtMile.getText());
            numinch = nummile * 1000000;
            numfoot = nummile * 100000;
            numyard = nummile * 1000;
            txtResultInch.setText(String.valueOf(numinch));
            txtResultFoot.setText(String.valueOf(numfoot));
            txtResultYard.setText(String.valueOf(numyard));
            txtResultMile.setText(String.valueOf(nummile));
        }


    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtInch.setText("");
        txtFoot.setText("");
        txtYard.setText("");
        txtMile.setText("");
        txtResultInch.setText("");
        txtResultFoot.setText("");
        txtResultYard.setText("");
        txtResultMile.setText("");

        rdoInch.setSelected(false);
        rdoFoot.setSelected(false);
        rdoYard.setSelected(false);
        rdoMile.setSelected(false);
        
       

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        String message = "คุณต้องการออกจากโปรแกรมหรือไม่?";
        String title = "ยืนยันการออกจากโปรแกรม";
        int option = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }

    }//GEN-LAST:event_btnExitActionPerformed

    private void txtInchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtInchFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtInch.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtInch.setText("");
        }
    }//GEN-LAST:event_txtInchFocusLost

    private void txtFootFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFootFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtFoot.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtFoot.setText("");
        }
    }//GEN-LAST:event_txtFootFocusLost

    private void txtYardFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtYardFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtYard.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtYard.setText("");
        }

    }//GEN-LAST:event_txtYardFocusLost

    private void txtMileFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMileFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtMile.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtMile.setText("");
        }

    }//GEN-LAST:event_txtMileFocusLost

    private void rdoInchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoInchActionPerformed
        // TODO add your handling code here:
        if (rdoInch.isSelected()) {
            txtInch.setEnabled(true);
            txtFoot.setEnabled(false);
            txtYard.setEnabled(false);
            txtMile.setEnabled(false);
        } else {
            txtFoot.setEnabled(true);
            txtYard.setEnabled(true);
            txtMile.setEnabled(true);

        }
    }//GEN-LAST:event_rdoInchActionPerformed

    private void rdoFootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFootActionPerformed
        // TODO add your handling code here:
        if (rdoFoot.isSelected()) {
            txtFoot.setEnabled(true);
            txtInch.setEnabled(false);
            txtYard.setEnabled(false);
            txtMile.setEnabled(false);
        } else {
            txtInch.setEnabled(false);
            txtYard.setEnabled(false);
            txtMile.setEnabled(false);

        }
    }//GEN-LAST:event_rdoFootActionPerformed

    private void rdoYardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoYardActionPerformed
        // TODO add your handling code here:
        if (rdoYard.isSelected()) {
            txtYard.setEnabled(true);
            txtInch.setEnabled(false);
            txtFoot.setEnabled(false);
            txtMile.setEnabled(false);
        } else {
            txtInch.setEnabled(false);
            txtFoot.setEnabled(false);
            txtMile.setEnabled(false);
        }
    }//GEN-LAST:event_rdoYardActionPerformed

    private void rdoMileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMileActionPerformed
        // TODO add your handling code here:
        if (rdoMile.isSelected()) {
            txtMile.setEnabled(true);
            txtInch.setEnabled(false);
            txtFoot.setEnabled(false);
            txtYard.setEnabled(false);
        } else {
            txtInch.setEnabled(false);
            txtFoot.setEnabled(false);
            txtYard.setEnabled(false);
        }
    }//GEN-LAST:event_rdoMileActionPerformed

    private void txtInchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInchActionPerformed
        // TODO add your handling code here:
//        txtMm.setEnabled(true);
//        txtCm.setEnabled(false);
//        txtM.setEnabled(false);
//        txtKm.setEnabled(false);


    }//GEN-LAST:event_txtInchActionPerformed

    private void txtInchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtInchCaretUpdate
        // TODO add your handling code here:


    }//GEN-LAST:event_txtInchCaretUpdate

    private void txtInchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInchKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInchKeyTyped

    private void txtFootKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFootKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtFootKeyTyped

    private void txtYardKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtYardKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtYardKeyTyped

    private void txtMileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMileKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMileKeyTyped

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
            java.util.logging.Logger.getLogger(EnglishLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglishLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglishLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglishLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnglishLengthRatioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelcm1;
    private javax.swing.JLabel jLabelfoot;
    private javax.swing.JLabel jLabelinch;
    private javax.swing.JLabel jLabelkm1;
    private javax.swing.JLabel jLabelkmile;
    private javax.swing.JLabel jLabelm1;
    private javax.swing.JLabel jLabelmm1;
    private javax.swing.JLabel jLabelyard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdoFoot;
    private javax.swing.JRadioButton rdoInch;
    private javax.swing.JRadioButton rdoMile;
    private javax.swing.JRadioButton rdoYard;
    private javax.swing.JTextField txtFoot;
    private javax.swing.JTextField txtInch;
    private javax.swing.JTextField txtMile;
    private javax.swing.JTextField txtResultFoot;
    private javax.swing.JTextField txtResultInch;
    private javax.swing.JTextField txtResultMile;
    private javax.swing.JTextField txtResultYard;
    private javax.swing.JTextField txtYard;
    // End of variables declaration//GEN-END:variables

}
