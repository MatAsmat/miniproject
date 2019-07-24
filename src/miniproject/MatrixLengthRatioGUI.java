package miniproject;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class MatrixLengthRatioGUI extends javax.swing.JFrame {

    public MatrixLengthRatioGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        rdoMm = new javax.swing.JRadioButton();
        rdoCm = new javax.swing.JRadioButton();
        rdoM = new javax.swing.JRadioButton();
        rdoKm = new javax.swing.JRadioButton();
        txtMm = new javax.swing.JTextField();
        txtCm = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jLabelmm = new javax.swing.JLabel();
        jLabelcm = new javax.swing.JLabel();
        jLabelkm = new javax.swing.JLabel();
        jLabelm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtResultMm = new javax.swing.JTextField();
        txtResultCm = new javax.swing.JTextField();
        txtResultM = new javax.swing.JTextField();
        txtResultKm = new javax.swing.JTextField();
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

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

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

        rdoMm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoMm.setText("มิลลิเมตร");
        rdoMm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMmActionPerformed(evt);
            }
        });

        rdoCm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoCm.setText("เซนติเมตร");
        rdoCm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCmActionPerformed(evt);
            }
        });

        rdoM.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoM.setText("เมตร");
        rdoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMActionPerformed(evt);
            }
        });

        rdoKm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoKm.setText("กิโลเมตร");
        rdoKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoKmActionPerformed(evt);
            }
        });

        txtMm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtMm.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMmCaretUpdate(evt);
            }
        });
        txtMm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMmActionPerformed(evt);
            }
        });
        txtMm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMmFocusLost(evt);
            }
        });
        txtMm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMmKeyTyped(evt);
            }
        });

        txtCm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtCm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCmFocusLost(evt);
            }
        });
        txtCm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCmKeyTyped(evt);
            }
        });

        txtM.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMFocusLost(evt);
            }
        });
        txtM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMKeyTyped(evt);
            }
        });

        txtKm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtKm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtKmFocusLost(evt);
            }
        });
        txtKm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKmKeyTyped(evt);
            }
        });

        jLabelmm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm.setText("mm");

        jLabelcm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcm.setText("cm");

        jLabelkm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelkm.setText("km");

        jLabelm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelm.setText("m");

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
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnClear)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdoMm)
                                    .addComponent(rdoCm)
                                    .addComponent(rdoKm)
                                    .addComponent(rdoM))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelkm)
                            .addComponent(jLabelmm)
                            .addComponent(jLabelcm)
                            .addComponent(jLabelm)
                            .addComponent(btnConvert))))
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
                            .addComponent(rdoMm)
                            .addComponent(txtMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoCm)
                            .addComponent(txtCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelcm))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoM)
                            .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelm))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoKm)
                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelkm)))
                    .addComponent(jLabelmm))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnConvert))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 153, 255));

        txtResultMm.setEditable(false);
        txtResultMm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultCm.setEditable(false);
        txtResultCm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultM.setEditable(false);
        txtResultM.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultKm.setEditable(false);
        txtResultKm.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabelmm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm1.setText("mm =");

        jLabelcm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelcm1.setText("cm =");

        jLabelm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelm1.setText("m =");

        jLabelkm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelkm1.setText("km");

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
                        .addComponent(txtResultMm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelmm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultCm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelcm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultKm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelkm1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultMm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmm1)
                    .addComponent(txtResultM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelm1)
                    .addComponent(txtResultKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelkm1)
                    .addComponent(jLabelcm1)
                    .addComponent(txtResultCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel1.setText("หน่วยการวัดความยาวในระบบเมตริก");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(270, 270, 270)
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
        float numMm, numCm, numM, numKm, resultMm, resultCm, resultM, resultKm;

        if (rdoMm.isSelected()) {

            numMm = Float.parseFloat(txtMm.getText());
            numCm = (float) (numMm / 10);
            numM = (float) (numMm / 1000);
            numKm = (float) (numMm / 10000);
            txtResultMm.setText(String.valueOf(numMm));
            txtResultCm.setText(String.valueOf(numCm));
            txtResultM.setText(String.valueOf(numM));
            txtResultKm.setText(String.valueOf(numKm));
        } else if (rdoCm.isSelected()) {

            numCm = Float.parseFloat(txtCm.getText());
            numMm = numCm * 10;
            numM = (float) (numCm / 100);
            numKm = (float) (numCm / 1000);
            txtResultMm.setText(String.valueOf(numMm));
            txtResultCm.setText(String.valueOf(numCm));
            txtResultM.setText(String.valueOf(numM));
            txtResultKm.setText(String.valueOf(numKm));
        } else if (rdoM.isSelected()) {

            numM = Float.parseFloat(txtM.getText());
            numMm = numM * 1000;
            numCm = numM * 100;
            numKm = (float) (numM * 0.001);
            txtResultMm.setText(String.valueOf(numMm));
            txtResultCm.setText(String.valueOf(numCm));
            txtResultM.setText(String.valueOf(numM));
            txtResultKm.setText(String.valueOf(numKm));
        } else if (rdoKm.isSelected()) {

            numKm = Float.parseFloat(txtKm.getText());
            numMm = numKm * 1000000;
            numCm = numKm * 100000;
            numM = numKm * 1000;
            txtResultMm.setText(String.valueOf(numMm));
            txtResultCm.setText(String.valueOf(numCm));
            txtResultM.setText(String.valueOf(numM));
            txtResultKm.setText(String.valueOf(numKm));
        }


    }//GEN-LAST:event_btnConvertActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtMm.setText("");
        txtCm.setText("");
        txtM.setText("");
        txtKm.setText("");
        txtResultMm.setText("");
        txtResultCm.setText("");
        txtResultM.setText("");
        txtResultKm.setText("");

        rdoMm.setSelected(false);
        rdoCm.setSelected(false);
        rdoM.setSelected(false);
        rdoKm.setSelected(false);
        
       

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

    private void txtMmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMmFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtMm.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtMm.setText("");
        }
    }//GEN-LAST:event_txtMmFocusLost

    private void txtCmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCmFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtCm.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtCm.setText("");
        }
    }//GEN-LAST:event_txtCmFocusLost

    private void txtMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtM.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtM.setText("");
        }

    }//GEN-LAST:event_txtMFocusLost

    private void txtKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKmFocusLost
        // TODO add your handling code here:
        try {
            Double.parseDouble(txtKm.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Invalid input.");
            txtKm.setText("");
        }

    }//GEN-LAST:event_txtKmFocusLost

    private void rdoMmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMmActionPerformed
        // TODO add your handling code here:
        if (rdoMm.isSelected()) {
            txtMm.setEnabled(true);
            txtCm.setEnabled(false);
            txtM.setEnabled(false);
            txtKm.setEnabled(false);
        } else {
            txtCm.setEnabled(true);
            txtM.setEnabled(true);
            txtKm.setEnabled(true);

        }
    }//GEN-LAST:event_rdoMmActionPerformed

    private void rdoCmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCmActionPerformed
        // TODO add your handling code here:
        if (rdoCm.isSelected()) {
            txtCm.setEnabled(true);
            txtMm.setEnabled(false);
            txtM.setEnabled(false);
            txtKm.setEnabled(false);
        } else {
            txtMm.setEnabled(false);
            txtM.setEnabled(false);
            txtKm.setEnabled(false);

        }
    }//GEN-LAST:event_rdoCmActionPerformed

    private void rdoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMActionPerformed
        // TODO add your handling code here:
        if (rdoM.isSelected()) {
            txtM.setEnabled(true);
            txtMm.setEnabled(false);
            txtCm.setEnabled(false);
            txtKm.setEnabled(false);
        } else {
            txtMm.setEnabled(false);
            txtCm.setEnabled(false);
            txtKm.setEnabled(false);
        }
    }//GEN-LAST:event_rdoMActionPerformed

    private void rdoKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoKmActionPerformed
        // TODO add your handling code here:
        if (rdoKm.isSelected()) {
            txtKm.setEnabled(true);
            txtMm.setEnabled(false);
            txtCm.setEnabled(false);
            txtM.setEnabled(false);
        } else {
            txtMm.setEnabled(false);
            txtCm.setEnabled(false);
            txtM.setEnabled(false);
        }
    }//GEN-LAST:event_rdoKmActionPerformed

    private void txtMmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMmActionPerformed
        // TODO add your handling code here:
//        txtMm.setEnabled(true);
//        txtCm.setEnabled(false);
//        txtM.setEnabled(false);
//        txtKm.setEnabled(false);


    }//GEN-LAST:event_txtMmActionPerformed

    private void txtMmCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMmCaretUpdate
        // TODO add your handling code here:


    }//GEN-LAST:event_txtMmCaretUpdate

    private void txtMmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMmKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMmKeyTyped

    private void txtCmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCmKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCmKeyTyped

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtMKeyTyped

    private void txtKmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtKmKeyTyped

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
            java.util.logging.Logger.getLogger(MatrixLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatrixLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatrixLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatrixLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatrixLengthRatioGUI().setVisible(true);
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
    private javax.swing.JLabel jLabelcm;
    private javax.swing.JLabel jLabelcm1;
    private javax.swing.JLabel jLabelkm;
    private javax.swing.JLabel jLabelkm1;
    private javax.swing.JLabel jLabelm;
    private javax.swing.JLabel jLabelm1;
    private javax.swing.JLabel jLabelmm;
    private javax.swing.JLabel jLabelmm1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdoCm;
    private javax.swing.JRadioButton rdoKm;
    private javax.swing.JRadioButton rdoM;
    private javax.swing.JRadioButton rdoMm;
    private javax.swing.JTextField txtCm;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtMm;
    private javax.swing.JTextField txtResultCm;
    private javax.swing.JTextField txtResultKm;
    private javax.swing.JTextField txtResultM;
    private javax.swing.JTextField txtResultMm;
    // End of variables declaration//GEN-END:variables

}
