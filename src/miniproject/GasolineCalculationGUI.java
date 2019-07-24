package miniproject;

import javax.swing.JOptionPane;

public class GasolineCalculationGUI extends javax.swing.JFrame {

    public GasolineCalculationGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        RtxtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        RtxtGas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        RtxtOil = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        RtxtLitre = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdoPtt = new javax.swing.JRadioButton();
        rdoBcp = new javax.swing.JRadioButton();
        rdoShell = new javax.swing.JRadioButton();
        rdoEsso = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rdoGas95 = new javax.swing.JRadioButton();
        rdoGas91 = new javax.swing.JRadioButton();
        rdoBen91 = new javax.swing.JRadioButton();
        rdoDiesel = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnCompute = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        RtxtAmount = new javax.swing.JTextField();
        RtxtTax = new javax.swing.JTextField();
        RtxtTotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        RtxtGas1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        RtxtOil1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RtxtLitre1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        RtxtPrice1 = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gasoline Calculation");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Receipt :");

        RtxtPrice.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Gas Station :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Baht :");

        RtxtGas.setEditable(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Oil :");

        RtxtOil.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Litre :");

        RtxtLitre.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(RtxtGas, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(RtxtOil)
                            .addComponent(RtxtLitre)
                            .addComponent(RtxtPrice))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(RtxtGas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(RtxtOil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(RtxtLitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 153));
        jLabel3.setText("GASOLINE CALCULATION");

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        rdoPtt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoPtt.setText("PTT");
        rdoPtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoPttActionPerformed(evt);
            }
        });

        rdoBcp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoBcp.setText("BCP");
        rdoBcp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBcpActionPerformed(evt);
            }
        });

        rdoShell.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoShell.setText("Shell");
        rdoShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoShellActionPerformed(evt);
            }
        });

        rdoEsso.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoEsso.setText("Esso");
        rdoEsso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoEssoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("เลือกปั้มน้ำมัน :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("เลือกชนิดน้ำมันตามประเภทของรถ :");

        rdoGas95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoGas95.setText("Gasohol 95 ");
        rdoGas95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGas95ActionPerformed(evt);
            }
        });

        rdoGas91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoGas91.setText("Gasohol 91 ");
        rdoGas91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoGas91ActionPerformed(evt);
            }
        });

        rdoBen91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoBen91.setText("Benzin 91");
        rdoBen91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBen91ActionPerformed(evt);
            }
        });

        rdoDiesel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rdoDiesel.setText("Diesel");
        rdoDiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDieselActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ระบุจำนวนเงิน :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("ระบุประเภทของรถ :");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrice.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPriceCaretUpdate(evt);
            }
        });
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPriceKeyTyped(evt);
            }
        });

        btnCompute.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCompute.setText("Compute");
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("รถเก่ง (sedan) :");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("รถกะบะ (pickup) :");

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setText("ราคาน้ำมันในแต่ละปั้มดังตาราง :");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 51));
        jLabel22.setText("ปตท");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 51, 0));
        jLabel23.setText("เชลล์");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 51, 153));
        jLabel24.setText("เอสโซ่");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 51, 51));
        jLabel25.setText("บางจาก");

        jLabel26.setText("36.50");

        jLabel27.setText("33.24");

        jLabel28.setText("41.54");

        jLabel29.setText("29.34");

        jLabel30.setText("37.74");

        jLabel31.setText("35.24");

        jLabel32.setText("42.64");

        jLabel33.setText("28.99");

        jLabel34.setText("37.34");

        jLabel35.setText("35.04");

        jLabel36.setText("41.84");

        jLabel37.setText("28.20");

        jLabel38.setText("37.03");

        jLabel39.setText("35.34");

        jLabel40.setText("41.55");

        jLabel41.setText("29.10");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33))
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41))
                                .addGap(0, 14, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel21)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel25)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel27)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel28)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel32)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel37))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel39)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel41)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rdoBcp)
                        .addComponent(rdoPtt)
                        .addComponent(rdoEsso)
                        .addComponent(rdoShell)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel5)
                            .addComponent(jLabel20))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(rdoBen91)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(rdoGas91)
                                .addComponent(rdoGas95))
                            .addComponent(rdoDiesel))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(258, 258, 258)
                        .addComponent(btnCompute)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdoPtt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoBcp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoShell)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoEsso))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdoGas95)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoGas91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoBen91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(rdoDiesel)))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompute)
                    .addComponent(btnCancel)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Tax Invoice :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Amount :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("VAT 7% :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Total Amount :");

        RtxtAmount.setEditable(false);

        RtxtTax.setEditable(false);

        RtxtTotal.setEditable(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Gas Station :");

        RtxtGas1.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Oil :");

        RtxtOil1.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Litre :");

        RtxtLitre1.setEditable(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Baht :");

        RtxtPrice1.setEditable(false);

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel7))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(RtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(btnExit))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(RtxtLitre1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jLabel18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RtxtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel12))
                                    .addGap(18, 18, 18))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(RtxtGas1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(RtxtAmount)
                                .addComponent(RtxtTax))
                            .addGap(33, 33, 33)
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(RtxtOil1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(RtxtGas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(RtxtOil1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtLitre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel18)
                    .addComponent(RtxtPrice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtTax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(320, 320, 320))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoEssoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoEssoActionPerformed
        // TODO add your handling code here:
        if (rdoEsso.isSelected()) {
            rdoPtt.setSelected(false);
            rdoBcp.setSelected(false);
            rdoShell.setSelected(false);
        }
    }//GEN-LAST:event_rdoEssoActionPerformed

    private void rdoShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoShellActionPerformed
        // TODO add your handling code here:
        if (rdoShell.isSelected()) {
            rdoPtt.setSelected(false);
            rdoBcp.setSelected(false);
            rdoEsso.setSelected(false);
        }
    }//GEN-LAST:event_rdoShellActionPerformed

    private void rdoBcpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBcpActionPerformed
        // TODO add your handling code here:
        if (rdoBcp.isSelected()) {
            rdoPtt.setSelected(false);
            rdoShell.setSelected(false);
            rdoEsso.setSelected(false);
        }
    }//GEN-LAST:event_rdoBcpActionPerformed

    private void rdoPttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoPttActionPerformed
        // TODO add your handling code here:
        if (rdoPtt.isSelected()) {
            rdoBcp.setSelected(false);
            rdoShell.setSelected(false);
            rdoEsso.setSelected(false);
        }
    }//GEN-LAST:event_rdoPttActionPerformed

    private void rdoGas95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGas95ActionPerformed
        // TODO add your handling code here:
        if (rdoGas95.isSelected()) {
            rdoGas91.setSelected(false);
            rdoBen91.setSelected(false);
            rdoDiesel.setSelected(false);
        }
    }//GEN-LAST:event_rdoGas95ActionPerformed

    private void rdoGas91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoGas91ActionPerformed
        // TODO add your handling code here:
        if (rdoGas91.isSelected()) {
            rdoGas95.setSelected(false);
            rdoBen91.setSelected(false);
            rdoDiesel.setSelected(false);
        }
    }//GEN-LAST:event_rdoGas91ActionPerformed

    private void rdoBen91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBen91ActionPerformed
        // TODO add your handling code here:
        if (rdoBen91.isSelected()) {
            rdoGas95.setSelected(false);
            rdoGas91.setSelected(false);
            rdoDiesel.setSelected(false);
        }
    }//GEN-LAST:event_rdoBen91ActionPerformed

    private void rdoDieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDieselActionPerformed
        // TODO add your handling code here:
        if (rdoDiesel.isSelected()) {
            rdoGas95.setSelected(false);
            rdoGas91.setSelected(false);
            rdoBen91.setSelected(false);
        }
    }//GEN-LAST:event_rdoDieselActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        String message = "คุณต้องการออกจากโปรแกรมหรือไม่ ?";
        String title = "ยืนยันการออกจากโปรแกรม ?";
        int option = JOptionPane.showConfirmDialog(null, message, title,
                JOptionPane.YES_NO_CANCEL_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        
        txtPrice.setText("");
        RtxtGas.setText("");
        RtxtGas1.setText("");
        RtxtOil.setText("");
        RtxtOil1.setText("");
        RtxtLitre.setText("");
        RtxtLitre1.setText("");
        RtxtPrice.setText("");
        RtxtPrice1.setText("");
        RtxtAmount.setText("");
        RtxtTax.setText("");
        RtxtTotal.setText("");


    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed
        // TODO add your handling code here:
        int money1;
        double money = 0, Am = 0, Tx, To;
        String STG, OIL;

        Am = Double.parseDouble(txtPrice.getText());
        Am = (Am / 1.07);
        Tx = (Am * 07 / 100);
        To = (Am + Tx);

        RtxtAmount.setText(String.valueOf(Am));
        RtxtTax.setText(String.valueOf(Tx));
        RtxtTotal.setText(String.valueOf(To));

        //------------------เลือกปั้ม PTT----------------
        if (rdoPtt.isSelected()) {
            money = Double.parseDouble(txtPrice.getText());
            money1 = Integer.parseInt(txtPrice.getText());
            Am = Double.parseDouble(txtPrice.getText());
            Am = (float)(Am / 1.07);
            Tx = (float)(Am * 07 / 100);
            To = (float)(Am + Tx);
            String Am1 = String.format("%.2f",Am);
            String Tx1 = String.format("%.2f",Tx);
            String To1 = String.format("%.2f",To);
            RtxtAmount.setText(String.valueOf(Am1));
            RtxtTax.setText(String.valueOf(Tx1));
            RtxtTotal.setText(String.valueOf(To1));
            RtxtGas.setText(String.valueOf("PTT"));
            RtxtGas1.setText(String.valueOf("PTT"));
            RtxtPrice.setText(String.valueOf(money1));
            RtxtPrice1.setText(String.valueOf(money1));
            //------------------เลือกน้ำมัน----------------
            if (rdoGas95.isSelected()) {
                money = (float)(money / 36.50);
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol95"));
                RtxtOil1.setText(String.valueOf("Gasohol95"));
            }
            if (rdoGas91.isSelected()) {
                money = (float)money / 33.24;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol91"));
                RtxtOil1.setText(String.valueOf("Gasohol91"));
            }
            if (rdoBen91.isSelected()) {
                money = (float)money / 41.54;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Benzin91"));
                RtxtOil1.setText(String.valueOf("Benzin91"));
            }
            if (rdoDiesel.isSelected()) {
                money = (float)money / 29.34;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Diesel"));
                RtxtOil1.setText(String.valueOf("Diesel"));
            }
        }
        //------------------เลือกปั้ม BCP----------------
        if (rdoBcp.isSelected()) {
            money = Double.parseDouble(txtPrice.getText());
            money1 = Integer.parseInt(txtPrice.getText());
            Am = Double.parseDouble(txtPrice.getText());
            Am = (float)(Am / 1.07);
            Tx = (float)(Am * 07 / 100);
            To = (float)(Am + Tx);
            String Am1 = String.format("%.2f",Am);
            String Tx1 = String.format("%.2f",Tx);
            String To1 = String.format("%.2f",To);
            RtxtAmount.setText(String.valueOf(Am1));
            RtxtTax.setText(String.valueOf(Tx1));
            RtxtTotal.setText(String.valueOf(To1));
            RtxtGas.setText(String.valueOf("BCP"));
            RtxtGas1.setText(String.valueOf("BCP"));
            RtxtPrice.setText(String.valueOf(money1));
            RtxtPrice1.setText(String.valueOf(money1));
            //-------------เลือกน้ำมัน--------------------
            if (rdoGas95.isSelected()) {
                money = (float)money / 37.74;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol95"));
                RtxtOil1.setText(String.valueOf("Gasohol95"));
            }
            if (rdoGas91.isSelected()) {
                money = (float)money / 35.24;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol91"));
                RtxtOil1.setText(String.valueOf("Gasohol91"));
            }
            if (rdoBen91.isSelected()) {
                money = (float)money / 42.64;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Benzin91"));
                RtxtOil1.setText(String.valueOf("Benzin91"));
            }
            if (rdoDiesel.isSelected()) {
                money = (float)money / 28.99;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Diesel"));
                RtxtOil1.setText(String.valueOf("Diesel"));
            }
        }
        //------------------เลือกปั้ม SHELL----------------
        if (rdoShell.isSelected()) {
            money = Double.parseDouble(txtPrice.getText());
            money1 = Integer.parseInt(txtPrice.getText());
            Am = Double.parseDouble(txtPrice.getText());
            Am = (float)(Am / 1.07);
            Tx = (float)(Am * 07 / 100);
            To = (float)(Am + Tx);
            String Am1 = String.format("%.2f",Am);
            String Tx1 = String.format("%.2f",Tx);
            String To1 = String.format("%.2f",To);
            RtxtAmount.setText(String.valueOf(Am1));
            RtxtTax.setText(String.valueOf(Tx1));
            RtxtTotal.setText(String.valueOf(To1));
            RtxtGas.setText(String.valueOf("SHELL"));
            RtxtGas1.setText(String.valueOf("SHELL"));
            RtxtPrice.setText(String.valueOf(money1));
            RtxtPrice1.setText(String.valueOf(money1));

            //-------------เลือกน้ำมัน--------------------
            if (rdoGas95.isSelected()) {
                money = (float)money / 37.34;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol95"));
                RtxtOil1.setText(String.valueOf("Gasohol95"));
            }
            if (rdoGas91.isSelected()) {
                money = (float)money / 35.04;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol91"));
                RtxtOil1.setText(String.valueOf("Gasohol91"));
            }
            if (rdoBen91.isSelected()) {
                money = (float)money / 41.84;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Benzin91"));
                RtxtOil1.setText(String.valueOf("Benzin91"));
            }
            if (rdoDiesel.isSelected()) {
                money = (float)money / 28.20;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Diesel"));
                RtxtOil1.setText(String.valueOf("Diesel"));
            }
        }
        //------------------เลือกปั้ม ESSO----------------
        if (rdoEsso.isSelected()) {
            money = Double.parseDouble(txtPrice.getText());
            money1 = Integer.parseInt(txtPrice.getText());
            Am = Double.parseDouble(txtPrice.getText());
            Am = (float)(Am / 1.07);
            Tx = (float)(Am * 07 / 100);
            To = (float)(Am + Tx);
            String Am1 = String.format("%.2f",Am);
            String Tx1 = String.format("%.2f",Tx);
            String To1 = String.format("%.2f",To);
            RtxtAmount.setText(String.valueOf(Am1));
            RtxtTax.setText(String.valueOf(Tx1));
            RtxtTotal.setText(String.valueOf(To1));
            RtxtGas.setText(String.valueOf("ESSO"));
            RtxtGas1.setText(String.valueOf("ESSO"));
            RtxtPrice.setText(String.valueOf(money1));
            RtxtPrice1.setText(String.valueOf(money1));
            //-------------เลือกน้ำมัน--------------------
            if (rdoGas95.isSelected()) {
                money =(float)money / 37.03;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol95"));
                RtxtOil1.setText(String.valueOf("Gasohol95"));
            }
            if (rdoGas91.isSelected()) {
                money = (float)money / 35.34;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Gasohol91"));
                RtxtOil1.setText(String.valueOf("Gasohol91"));
            }
            if (rdoBen91.isSelected()) {
                money = (float)money / 41.55;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Benzin91"));
                RtxtOil1.setText(String.valueOf("Benzin91"));
            }
            if (rdoDiesel.isSelected()) {
                money = (float)money / 29.10;
                String money2 = String.format("%.2f",money);
                RtxtLitre.setText(String.valueOf(money2));
                RtxtLitre1.setText(String.valueOf(money2));
                RtxtOil.setText(String.valueOf("Diesel"));
                RtxtOil1.setText(String.valueOf("Diesel"));
            }
        }
    
      

    }//GEN-LAST:event_btnComputeActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
        int money = 0;
        RtxtPrice.setText(String.valueOf(money));
        RtxtPrice1.setText(String.valueOf(money));


    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtPriceCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPriceCaretUpdate
        // TODO add your handling code here:

        RtxtPrice.setText(String.valueOf(txtPrice));
        RtxtPrice1.setText(String.valueOf(txtPrice));
    }//GEN-LAST:event_txtPriceCaretUpdate

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
         char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

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
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        



} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GasolineCalculationGUI.class

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GasolineCalculationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RtxtAmount;
    private javax.swing.JTextField RtxtGas;
    private javax.swing.JTextField RtxtGas1;
    private javax.swing.JTextField RtxtLitre;
    private javax.swing.JTextField RtxtLitre1;
    private javax.swing.JTextField RtxtOil;
    private javax.swing.JTextField RtxtOil1;
    private javax.swing.JTextField RtxtPrice;
    private javax.swing.JTextField RtxtPrice1;
    private javax.swing.JTextField RtxtTax;
    private javax.swing.JTextField RtxtTotal;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCompute;
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JRadioButton rdoBcp;
    private javax.swing.JRadioButton rdoBen91;
    private javax.swing.JRadioButton rdoDiesel;
    private javax.swing.JRadioButton rdoEsso;
    private javax.swing.JRadioButton rdoGas91;
    private javax.swing.JRadioButton rdoGas95;
    private javax.swing.JRadioButton rdoPtt;
    private javax.swing.JRadioButton rdoShell;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
