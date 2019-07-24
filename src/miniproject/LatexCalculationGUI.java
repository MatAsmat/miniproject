package miniproject;

/*import java.awt.Dimension;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;*/
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LatexCalculationGUI extends javax.swing.JFrame {
    int Order = 0;
    float Net = 0;
    float Dry = 0;
    float Total = 0;
    DefaultTableModel model;

    public LatexCalculationGUI() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtPersent = new javax.swing.JTextField();
        txtGallon = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        RtxtTotal = new javax.swing.JTextField();
        RtxtPersent = new javax.swing.JTextField();
        RtxtWeight = new javax.swing.JTextField();
        RtxtGallon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        RtxtNet = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        RtxtDry = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RtxtPrice = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        RtxtName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRSummary = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Business");

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Table", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(255, 153, 153))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 0, 102));

        tblData.setBackground(new java.awt.Color(0, 51, 51));
        tblData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tblData.setForeground(new java.awt.Color(255, 255, 204));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Name", "Weight", "Gallon", "Net", "Persent", "Dry Tires", "Price", "Total"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 24), new java.awt.Color(255, 204, 0))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 255));
        jLabel1.setText("Order :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 255));
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 255));
        jLabel3.setText("Weight :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 255));
        jLabel4.setText("Gallon :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 255));
        jLabel6.setText("Persent :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 102, 255));
        jLabel8.setText("Price :");

        txtOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtWeight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });
        txtWeight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtWeightKeyTyped(evt);
            }
        });

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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

        txtPersent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPersent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPersentActionPerformed(evt);
            }
        });
        txtPersent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPersentKeyTyped(evt);
            }
        });

        txtGallon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGallon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGallonActionPerformed(evt);
            }
        });
        txtGallon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGallonKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGallon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPersent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGallon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Output Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 24), new java.awt.Color(153, 255, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 153, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 102));
        jLabel5.setText("Ne ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 102));
        jLabel7.setText("Ps ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 204, 255));
        jLabel9.setText("Total:");

        RtxtTotal.setEditable(false);
        RtxtTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RtxtTotal.setForeground(new java.awt.Color(0, 102, 153));
        RtxtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtTotalActionPerformed(evt);
            }
        });

        RtxtPersent.setEditable(false);
        RtxtPersent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RtxtPersent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtPersentActionPerformed(evt);
            }
        });

        RtxtWeight.setEditable(false);
        RtxtWeight.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RtxtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtWeightActionPerformed(evt);
            }
        });

        RtxtGallon.setEditable(false);
        RtxtGallon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RtxtGallon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtGallonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 102));
        jLabel10.setText("W ");

        RtxtNet.setEditable(false);
        RtxtNet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RtxtNet.setForeground(new java.awt.Color(0, 102, 153));
        RtxtNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtNetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 102));
        jLabel11.setText("G ");

        RtxtDry.setEditable(false);
        RtxtDry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RtxtDry.setForeground(new java.awt.Color(0, 102, 153));
        RtxtDry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtDryActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 102));
        jLabel12.setText("D ");

        RtxtPrice.setEditable(false);
        RtxtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RtxtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtPriceActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 102));
        jLabel13.setText("Pr ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 102, 0));
        jLabel14.setText("-");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText("X");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 102, 0));
        jLabel16.setText("X");

        RtxtName.setEditable(false);
        RtxtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        RtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RtxtNameActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 255));
        jLabel17.setText("Name :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(RtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RtxtNet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(RtxtDry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RtxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(4, 4, 4)))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RtxtPersent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RtxtGallon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RtxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RtxtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RtxtNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RtxtDry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(RtxtGallon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RtxtPersent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(RtxtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RtxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(51, 0, 51));

        btnAdd.setBackground(new java.awt.Color(0, 153, 0));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 102, 0));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 0, 51));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(153, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnTotal.setBackground(new java.awt.Color(204, 102, 0));
        btnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTotal.setForeground(new java.awt.Color(255, 255, 255));
        btnTotal.setText("Total");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(219, 219, 219))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnExit)
                    .addComponent(btnTotal))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Summary", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 2, 24), new java.awt.Color(255, 153, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(255, 153, 0));

        txtRSummary.setEditable(false);
        txtRSummary.setBackground(new java.awt.Color(51, 204, 0));
        txtRSummary.setColumns(20);
        txtRSummary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtRSummary.setForeground(new java.awt.Color(102, 0, 102));
        txtRSummary.setRows(5);
        jScrollPane2.setViewportView(txtRSummary);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void RtxtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtTotalActionPerformed

    private void RtxtPersentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtPersentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtPersentActionPerformed

    private void RtxtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtWeightActionPerformed

    private void txtPersentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPersentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPersentActionPerformed

    private void txtGallonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGallonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGallonActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Ara You Sure Want To Close?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        txtOrder.setText("");
        txtName.setText("");
        txtWeight.setText("");
        txtGallon.setText("");
        txtPersent.setText("");
        txtPrice.setText("");
        RtxtPersent.setText("");
        RtxtWeight.setText("");
        RtxtNet.setText("");
        RtxtDry.setText("");
        RtxtTotal.setText("");
        RtxtName.setText("");
        RtxtGallon.setText("");
        RtxtPrice.setText("");
        
        

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        if (tblData.getSelectedRow() >= 0) {
            model.removeRow(selectedRow);
            clearTextField();

        } else {
            JOptionPane.showInternalMessageDialog(this, "Plese Enter data before Delete");//การแจ้งเตือน
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String O, N;
        float net = 0, dry = 0, total = 0;
        O = txtOrder.getText();
        N = txtName.getText();
        float weight = Float.parseFloat(txtWeight.getText());
        String W = txtWeight.getText();
        float gallon = Float.parseFloat(txtGallon.getText());
        String G = txtGallon.getText();
        net = (float)weight - gallon;
        RtxtWeight.setText(String.valueOf(net));
        float persent = Float.parseFloat(txtPersent.getText());
        String Ps = txtPersent.getText();
        dry = (float)net * persent / 100;
        RtxtPersent.setText(String.valueOf(dry));
        float price = Float.parseFloat(txtPrice.getText());
        String Pr = txtPrice.getText();
        total = (float)dry * price;
        RtxtTotal.setText(String.valueOf(total));
        //----------------------------------------------------//
        RtxtName.setText(String.valueOf(N));
        RtxtWeight.setText(String.valueOf(W));
        RtxtGallon.setText(String.valueOf(G));
        RtxtPersent.setText(String.valueOf(Ps));
        RtxtPrice.setText(String.valueOf(Pr));
        RtxtNet.setText(String.valueOf(net));
        RtxtDry.setText(String.valueOf(dry));
        //---------------------------------------------------//
        net = Float.parseFloat(RtxtNet.getText());
        String Ne = RtxtNet.getText();
        dry = Float.parseFloat(RtxtDry.getText());
        String D = RtxtDry.getText();
        total = Float.parseFloat(RtxtTotal.getText());
        String T = RtxtTotal.getText();
        if (!O.equals("")) {
            Order++;
        Net = Net + net;
        Dry = Dry + dry;
        Total = Total + total;
        if (!O.equals("") && !N.equals("")&& !W.equals("")&& !G.equals("")&& !Ne.equals("")
                && !Ps.equals("")&& !D.equals("")&& !Pr.equals("")&& !T.equals("")){
            String[] rowData = {O, N, W, G, Ne, Ps, D, Pr, T};
            model.addRow(rowData);
            
        } else {
            JOptionPane.showMessageDialog(this, "Plese Enter data before Add");
            clearTextField();
        }   
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        /*int selectedRow = tblData.getSelectedRow();
        if (selectedRow >= 0) {
            String O = (String) tblData.getValueAt(selectedRow, 0);
            String N = (String) tblData.getValueAt(selectedRow, 1);
            String W = (String) tblData.getValueAt(selectedRow, 2);
            String G = (String) tblData.getValueAt(selectedRow, 3);
            String Ne = (String) tblData.getValueAt(selectedRow, 4);
            String Ps = (String) tblData.getValueAt(selectedRow, 5);
            String D = (String) tblData.getValueAt(selectedRow, 6);
            String Pr = (String) tblData.getValueAt(selectedRow, 7);
            String T = (String) tblData.getValueAt(selectedRow, 8);
            txtOrder.setText(O);
            txtName.setText(N);
            txtWeight.setText(W);
            txtGallon.setText(G);
            RtxtNet.setText(Ne);
            txtPersent.setText(Ps);
            RtxtDry.setText(D);
            txtPrice.setText(Pr);
            RtxtTotal.setText(T);

        }*/
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtWeightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWeightKeyTyped
        // TODO add your handling code here:
       /* char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
            || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
            || (c == java.awt.event.KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }*/
    }//GEN-LAST:event_txtWeightKeyTyped

    private void txtGallonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGallonKeyTyped
        // TODO add your handling code here:
        /*char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }*/
    }//GEN-LAST:event_txtGallonKeyTyped

    private void txtPersentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPersentKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPersentKeyTyped

    private void txtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyTyped
        // TODO add your handling code here:
        char inp = evt.getKeyChar();
        if (!(Character.isDigit(inp))) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPriceKeyTyped

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        String Summary = "Number of people : "+Order+"\nNet Total : "+ Net + " \nDry Tires Total : " + Dry + " \nSum Total : " + Total;
        txtRSummary.setText(String.valueOf(Summary));
    }//GEN-LAST:event_btnTotalActionPerformed

    private void RtxtGallonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtGallonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtGallonActionPerformed

    private void RtxtNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtNetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtNetActionPerformed

    private void RtxtDryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtDryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtDryActionPerformed

    private void RtxtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtPriceActionPerformed

    private void RtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RtxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RtxtNameActionPerformed

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
            java.util.logging.Logger.getLogger(LatexCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LatexCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LatexCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LatexCalculationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LatexCalculationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField RtxtDry;
    private javax.swing.JTextField RtxtGallon;
    private javax.swing.JTextField RtxtName;
    private javax.swing.JTextField RtxtNet;
    private javax.swing.JTextField RtxtPersent;
    private javax.swing.JTextField RtxtPrice;
    private javax.swing.JTextField RtxtTotal;
    private javax.swing.JTextField RtxtWeight;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtGallon;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOrder;
    private javax.swing.JTextField txtPersent;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextArea txtRSummary;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void clearTextField() {
        txtOrder.setText("");
        txtName.setText("");
        txtWeight.setText("");
        txtGallon.setText("");
        txtPersent.setText("");
        txtPrice.setText("");
       
    }
}
