package miniproject;



import javax.swing.JOptionPane;

public class CountAlphabetFromSentenceGUI extends javax.swing.JFrame {

    public static String str;

    /**
     * Creates new form Sentence
     */
    public CountAlphabetFromSentenceGUI() {
        initComponents();
    }

    public void ClearText() {
        jTextArea.setText("");
        txtResult.setText("");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jCount = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnCount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Count Alphabet From Sentence");

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Please Enter Sentence :");

        jTextArea.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ป้อนค่า input ใน jTextArea");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );

        jCount.setBackground(new java.awt.Color(0, 51, 51));
        jCount.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Count  Options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(204, 255, 204))); // NOI18N
        jCount.setForeground(new java.awt.Color(0, 51, 51));
        jCount.setToolTipText("");
        jCount.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(204, 255, 204));
        jCheckBox1.setText("Vowel (สระ)");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(204, 255, 204));
        jCheckBox2.setText("Vowel & Not Vowel & Count each Vowel");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jCheckBox3.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(204, 255, 204));
        jCheckBox3.setText("Not Vowel(ไม่ใช่สระ)");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jCountLayout = new javax.swing.GroupLayout(jCount);
        jCount.setLayout(jCountLayout);
        jCountLayout.setHorizontalGroup(
            jCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCountLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCountLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jCountLayout.createSequentialGroup()
                        .addGroup(jCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3))
                        .addGap(0, 208, Short.MAX_VALUE))))
        );
        jCountLayout.setVerticalGroup(
            jCountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 102));
        jLabel2.setText("ReSult :");

        txtResult.setEditable(false);
        txtResult.setBackground(new java.awt.Color(204, 255, 204));
        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtResult.setForeground(new java.awt.Color(0, 51, 51));
        txtResult.setRows(5);
        jScrollPane1.setViewportView(txtResult);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCount.setText("Count");
        btnCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        String message = "คุณต้องการออกจากโปรแกรมหรือไม่?";
        String title = "ยืนยันการออกจากโปรแกรม";
        int option = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        ClearText();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountActionPerformed
        // TODO add your handling code here:
        String str1, result;
        String str2, Sen1;
        String str3, Sen2;
        str1 = String.valueOf(jTextArea.getText());
        str2 = String.valueOf(jTextArea.getText());
        str3 = String.valueOf(jTextArea.getText());
        result = str1;
        Sen1 = str2;
        Sen2 = str3;
        
        
        
        txtResult.setText(String.valueOf(result));
        int count = 0, aa = 0, ee = 0, ii = 0, oo = 0, uu = 0;
        int count1 = 0, a1 = 0, e1 = 0, i1 = 0, o1 = 0, u1 = 0;
        int count2 = 0;
        
        if (jCheckBox1.isSelected()) {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == 'A'
                        || str1.charAt(i) == 'E'
                        || str1.charAt(i) == 'I'
                        || str1.charAt(i) == 'O'
                        || str1.charAt(i) == 'U'
                        || str1.charAt(i) == 'a'
                        || str1.charAt(i) == 'e'
                        || str1.charAt(i) == 'i'
                        || str1.charAt(i) == 'o'
                        || str1.charAt(i) == 'u') {
                    {
                        if (str1.charAt(i) == 'A' || str1.charAt(i) == 'a') {
                            aa++;
                        }
                        {
                            if (str1.charAt(i) == 'E' || str1.charAt(i) == 'e') {
                                ee++;
                            }
                            {
                                if (str1.charAt(i) == 'I' || str1.charAt(i) == 'i') {
                                    ii++;
                                }
                                {
                                    if (str1.charAt(i) == 'O' || str1.charAt(i) == 'o') {
                                        oo++;
                                    }
                                    {
                                        if (str1.charAt(i) == 'U' || str1.charAt(i) == 'u') {
                                            uu++;
                                        }

                                    }
                                    count++; // ทำการนับเมื่อเป็น A E I O U 
                                }
                            }
                        }
                    }
                }

                txtResult.setText(String.valueOf("Input : " + str1 + " \n\tcontains " +  count  + " Vowels \n "
                        + "\t\t-->A = " + aa + " , E = " + ee + " , I = " + ii + " , O = " + oo + " , U = " + uu + "\n "));

            }
        }else if (jCheckBox3.isSelected()) {
            str2 = "";
            for (int i = 0; i < str3.length(); i++) {
                if (str3.charAt(i) == 'A'
                        || str3.charAt(i) == 'E'
                        || str3.charAt(i) == 'I'
                        || str3.charAt(i) == 'O'
                        || str3.charAt(i) == 'U'
                        || str3.charAt(i) == 'a'
                        || str3.charAt(i) == 'e'
                        || str3.charAt(i) == 'i'
                        || str3.charAt(i) == 'o'
                        || str3.charAt(i) == 'u') {
                    {
                        if (str3.charAt(i) == 'A' || str3.charAt(i) == 'a') {
                            a1++;
                        }
                        {
                            if (str3.charAt(i) == 'E' || str3.charAt(i) == 'e') {
                                e1++;
                            }
                            {
                                if (str3.charAt(i) == 'I' || str3.charAt(i) == 'i') {
                                    i1++;
                                }
                                {
                                    if (str3.charAt(i) == 'O' || str3.charAt(i) == 'o') {
                                        o1++;
                                    }
                                    {
                                        if (str3.charAt(i) == 'U' || str3.charAt(i) == 'u') {
                                            u1++;
                                        }

                                    }
                                    //count++; // ทำการนับเมื่อเป็น A E I O U 
                                }
                            }
                        }

                    }
                }if(!(str3.charAt(i) == 'A'
                        || str3.charAt(i) == 'E'
                        || str3.charAt(i) == 'I'
                        || str3.charAt(i) == 'O'
                        || str3.charAt(i) == 'U'
                        || str3.charAt(i) == 'a'
                        || str3.charAt(i) == 'e'
                        || str3.charAt(i) == 'i'
                        || str3.charAt(i) == 'o'
                        || str3.charAt(i) == 'u')){
                    str2 = str2 + str3.charAt(i);
                    count2++;
                }

                txtResult.setText(String.valueOf("Input : " +  str1  + " \n\tstrcontains " +  count2  + " Alphabets (Not vowel) \n "
                        + "\t\t-->Not Vowel are : " +  str2));

            }
        }
              else if (jCheckBox2.isSelected()) {
                  Sen1 = "";
                    for (int j = 0; j < str2.length(); j++) {
                        if (str2.charAt(j) == 'A'
                            || str2.charAt(j) == 'E'
                            || str2.charAt(j) == 'I'
                            || str2.charAt(j) == 'O'
                            || str2.charAt(j) == 'U'
                            || str2.charAt(j) == 'a'
                            || str2.charAt(j) == 'e'
                            || str2.charAt(j) == 'i'
                            || str2.charAt(j) == 'o'
                            || str2.charAt(j) == 'u') {
                        {
                            if (str2.charAt(j) == 'A' || str2.charAt(j) == 'a') {
                                aa++;
                                count++;
                            }
                            {
                                if (str2.charAt(j) == 'E' || str2.charAt(j) == 'e') {
                                    ee++;
                                    count++;
                                }
                                {
                                    if (str2.charAt(j) == 'I' || str2.charAt(j) == 'i') {
                                        ii++;
                                        count++;
                                    }
                                    {
                                        if (str2.charAt(j) == 'O' || str2.charAt(j) == 'o') {
                                            oo++;
                                            count++;
                                        }
                                        {
                                            if (str2.charAt(j) == 'U' || str2.charAt(j) == 'u') {
                                                uu++;
                                                count++;
                                            }

                                        }
                                        //count++; // ทำการนับเมื่อเป็น A E I O U 
                                    }
                                }
                            }
                        }

                    }
                    if(!(str3.charAt(j) == 'A'
                        || str3.charAt(j) == 'E'
                        || str3.charAt(j) == 'I'
                        || str3.charAt(j) == 'O'
                        || str3.charAt(j) == 'U'
                        || str3.charAt(j) == 'a'
                        || str3.charAt(j) == 'e'
                        || str3.charAt(j) == 'i'
                        || str3.charAt(j) == 'o'
                        || str3.charAt(j) == 'u')){
                        Sen1 = Sen1 + str3.charAt(j);
                        count2++;
                    }
                    txtResult.setText(String.valueOf("Input : " +  str2  + " \n\tcontains " +  (count)  + " Vowels \n "
                            + "\t\t-->A = " +  aa  + " , E = " +  ee  + " , I = " +  ii  + " , O = " +  oo  + " , U = " +  uu  + "\n "
                            + "\nInput : " +  str1  + " \n\tncontains " +  count2  + " Alphabets (Not vowel) \n "
                            + "\t\t-->Not Vowel are : " +  Sen1));

                }
              }
            
        
        
    

    }//GEN-LAST:event_btnCountActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(true);
            jCheckBox3.setSelected(true);

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()) {
            jCheckBox1.setSelected(true);
            jCheckBox2.setSelected(true);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(true);
            jCheckBox3.setSelected(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(CountAlphabetFromSentenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CountAlphabetFromSentenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CountAlphabetFromSentenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CountAlphabetFromSentenceGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CountAlphabetFromSentenceGUI().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCount;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JPanel jCount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables

}
