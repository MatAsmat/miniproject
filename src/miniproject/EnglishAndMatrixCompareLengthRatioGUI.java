package miniproject;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class EnglishAndMatrixCompareLengthRatioGUI extends javax.swing.JFrame {

    public EnglishAndMatrixCompareLengthRatioGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        rdoInch = new javax.swing.JRadioButton();
        rdoYard = new javax.swing.JRadioButton();
        rdoMile = new javax.swing.JRadioButton();
        txtInch = new javax.swing.JTextField();
        txtYard = new javax.swing.JTextField();
        txtMile = new javax.swing.JTextField();
        jLabelInCm = new javax.swing.JLabel();
        jLabelYaM = new javax.swing.JLabel();
        jLabelMiKm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelCm = new javax.swing.JLabel();
        jLabelM = new javax.swing.JLabel();
        jLabelKm = new javax.swing.JLabel();
        txtCm = new javax.swing.JTextField();
        txtM = new javax.swing.JTextField();
        txtKm = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtResultNum1 = new javax.swing.JTextField();
        txtResultType1 = new javax.swing.JTextField();
        txtResultNum2 = new javax.swing.JTextField();
        txtResultType2 = new javax.swing.JTextField();
        jLabelmm1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Matrix Length Ratio");

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        btnClear.setBackground(new java.awt.Color(255, 0, 0));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        rdoInch.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoInch.setText("นิ้ว");
        rdoInch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoInchMouseClicked(evt);
            }
        });
        rdoInch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoInchActionPerformed(evt);
            }
        });

        rdoYard.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoYard.setText("หลา");
        rdoYard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoYardMouseClicked(evt);
            }
        });
        rdoYard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoYardActionPerformed(evt);
            }
        });

        rdoMile.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        rdoMile.setText("ไมล์");
        rdoMile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoMileMouseClicked(evt);
            }
        });
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

        jLabelInCm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelInCm.setText("inch == เซนติเมตร");

        jLabelYaM.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelYaM.setText("yard == เมตร");

        jLabelMiKm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelMiKm.setText("mile == กิโลเมตร");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("เลือกหน่วยที่ต้องการแปลง พร้อมระบุตัวเลข");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*** Number only");

        jLabelCm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelCm.setText("cm");

        jLabelM.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelM.setText("m");

        jLabelKm.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelKm.setText("km");

        txtCm.setEditable(false);
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

        txtM.setEditable(false);
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

        txtKm.setEditable(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdoMile)
                            .addComponent(rdoInch)
                            .addComponent(rdoYard))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMile, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYard, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelYaM)
                            .addComponent(jLabelInCm)
                            .addComponent(jLabelMiKm)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelM)
                            .addComponent(jLabelCm)
                            .addComponent(jLabelKm))
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoInch)
                            .addComponent(txtInch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoYard)
                            .addComponent(txtYard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdoMile)
                            .addComponent(txtMile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabelMiKm))
                    .addComponent(jLabelInCm)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelYaM))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabelKm))
                    .addComponent(jLabelCm)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabelM)))
                .addGap(43, 43, 43)
                .addComponent(btnClear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("หน่วยการวัดความยาวในระบบอังกฤษเทียบกับระบบเมตริก");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExit.setBackground(new java.awt.Color(255, 204, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        txtResultNum1.setEditable(false);
        txtResultNum1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultType1.setEditable(false);
        txtResultType1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultNum2.setEditable(false);
        txtResultNum2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txtResultType2.setEditable(false);
        txtResultType2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        jLabelmm1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabelmm1.setText("==");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Result :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(txtResultNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultType1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelmm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultType2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelmm1)
                    .addComponent(txtResultType2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtInch.setText("");
        txtYard.setText("");
        txtMile.setText("");
        txtCm.setText("");
        txtM.setText("");
        txtKm.setText("");
        txtResultNum1.setText("");
        txtResultType1.setText("");
        txtResultNum2.setText("");
        txtResultType2.setText("");

        rdoInch.setSelected(false);
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
      
    }//GEN-LAST:event_rdoInchActionPerformed

    private void rdoYardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoYardActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rdoYardActionPerformed

    private void rdoMileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMileActionPerformed
        // TODO add your handling code here:
       
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

    private void txtCmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCmFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCmFocusLost

    private void txtCmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCmKeyTyped

    private void txtMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMFocusLost

    private void txtMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMKeyTyped

    private void txtKmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtKmFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmFocusLost

    private void txtKmKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKmKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKmKeyTyped

    private void rdoInchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoInchMouseClicked
        // TODO add your handling code here:
          if (rdoInch.isSelected()) {
            txtInch.setEnabled(true);
            txtCm.setEnabled(true);
            txtYard.setEnabled(false);
            txtMile.setEnabled(false);
            txtM.setEnabled(false);
            txtKm.setEnabled(false);
           
        } else {
            txtYard.setEnabled(true);
            txtMile.setEnabled(true);
            txtM.setEnabled(true);
            txtKm.setEnabled(true);
            
            float numInch,numCm;
            numInch = Float.parseFloat(txtInch.getText());
            numCm = (float) (numInch / 10);
            txtCm.setText(String.valueOf(numCm));
            txtResultNum1.setText(String.valueOf(numInch));
            txtResultNum2.setText(String.valueOf(numCm));
            txtResultType1.setText(String.valueOf("inch"));
            txtResultType2.setText(String.valueOf("cm"));
         
           

        }
    }//GEN-LAST:event_rdoInchMouseClicked

    private void rdoYardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoYardMouseClicked
        // TODO add your handling code here:
          if (rdoYard.isSelected()) {
            txtYard.setEnabled(true);
            txtM.setEnabled(true);
            txtInch.setEnabled(false);
            txtMile.setEnabled(false);
            txtCm.setEnabled(false);
            txtKm.setEnabled(false);
           
        } else {
            txtInch.setEnabled(true);
            txtMile.setEnabled(true);
            txtCm.setEnabled(true);
            txtKm.setEnabled(true);
            
             float numYard,numM;
            numYard = Float.parseFloat(txtInch.getText());
            numM = (float) (numYard / 10);
            txtCm.setText(String.valueOf(numM));
            txtResultNum1.setText(String.valueOf(numYard));
            txtResultNum2.setText(String.valueOf(numM));
            txtResultType1.setText(String.valueOf("yard"));
            txtResultType2.setText(String.valueOf("m"));
            

        }
    }//GEN-LAST:event_rdoYardMouseClicked

    private void rdoMileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoMileMouseClicked
        // TODO add your handling code here:
         if (rdoMile.isSelected()) {
            txtMile.setEnabled(true);
            txtKm.setEnabled(true);
            txtInch.setEnabled(false);
            txtYard.setEnabled(false);
            txtCm.setEnabled(false);
            txtM.setEnabled(false);
            
        } else {
            txtInch.setEnabled(true);
            txtYard.setEnabled(true);
            txtCm.setEnabled(true);
            txtM.setEnabled(true);
             float numMile,numKm;
            numMile = Float.parseFloat(txtInch.getText());
            numKm = (float) (numMile / 10);
            txtCm.setText(String.valueOf(numKm));
            txtResultNum1.setText(String.valueOf(numMile));
            txtResultNum2.setText(String.valueOf(numKm));
            txtResultType1.setText(String.valueOf("mile"));
            txtResultType2.setText(String.valueOf("Km"));
            
        }
    }//GEN-LAST:event_rdoMileMouseClicked

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
            java.util.logging.Logger.getLogger(EnglishAndMatrixCompareLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnglishAndMatrixCompareLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnglishAndMatrixCompareLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnglishAndMatrixCompareLengthRatioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EnglishAndMatrixCompareLengthRatioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCm;
    private javax.swing.JLabel jLabelInCm;
    private javax.swing.JLabel jLabelKm;
    private javax.swing.JLabel jLabelM;
    private javax.swing.JLabel jLabelMiKm;
    private javax.swing.JLabel jLabelYaM;
    private javax.swing.JLabel jLabelmm1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdoInch;
    private javax.swing.JRadioButton rdoMile;
    private javax.swing.JRadioButton rdoYard;
    private javax.swing.JTextField txtCm;
    private javax.swing.JTextField txtInch;
    private javax.swing.JTextField txtKm;
    private javax.swing.JTextField txtM;
    private javax.swing.JTextField txtMile;
    private javax.swing.JTextField txtResultNum1;
    private javax.swing.JTextField txtResultNum2;
    private javax.swing.JTextField txtResultType1;
    private javax.swing.JTextField txtResultType2;
    private javax.swing.JTextField txtYard;
    // End of variables declaration//GEN-END:variables

}
