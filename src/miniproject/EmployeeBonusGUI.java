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

public class EmployeeBonusGUI extends javax.swing.JFrame {

    int acc = 0;
    float count = 0;
    float count1 = 0;
    DefaultTableModel model;
    String type = "";

    public EmployeeBonusGUI() {
        initComponents();
        model = (DefaultTableModel) tblData.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        RtxtSummary = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        txtTotal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxposition = new javax.swing.JComboBox<>();
        txtSalary = new javax.swing.JTextField();
        txtBonus = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();

        jLabel5.setText("jLabel5");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.setForeground(new java.awt.Color(255, 0, 204));

        tblData.setBackground(new java.awt.Color(102, 0, 51));
        tblData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblData.setForeground(new java.awt.Color(204, 204, 204));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Surname", "Position", "Salary", "Bonus"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        RtxtSummary.setBackground(new java.awt.Color(0, 102, 102));
        RtxtSummary.setColumns(20);
        RtxtSummary.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        RtxtSummary.setForeground(new java.awt.Color(204, 204, 204));
        RtxtSummary.setRows(5);
        jScrollPane2.setViewportView(RtxtSummary);

        jLabel9.setBackground(new java.awt.Color(153, 0, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 51));
        jLabel9.setText("EMPLOYEE BONUS");

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));
        jPanel3.setForeground(new java.awt.Color(0, 51, 51));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        txtTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotal.setText("Total");
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(txtTotal)
                .addGap(18, 18, 18)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnExit)
                .addGap(55, 55, 55))
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(153, 102, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(153, 51, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 255));
        jLabel2.setText("ID :");

        txtId.setBackground(new java.awt.Color(51, 51, 51));
        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtId.setForeground(new java.awt.Color(255, 204, 255));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 204, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 255));
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 255));
        jLabel4.setText("Surname :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 255));
        jLabel6.setText("Position :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 255));
        jLabel7.setText("Salary :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 255));
        jLabel8.setText("Bonus :");

        cbxposition.setBackground(new java.awt.Color(51, 51, 51));
        cbxposition.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cbxposition.setForeground(new java.awt.Color(102, 0, 51));
        cbxposition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Assistant Manager", "General" }));
        cbxposition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpositionActionPerformed(evt);
            }
        });

        txtSalary.setBackground(new java.awt.Color(51, 51, 51));
        txtSalary.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSalary.setForeground(new java.awt.Color(255, 204, 255));
        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSalaryKeyTyped(evt);
            }
        });

        txtBonus.setEditable(false);
        txtBonus.setBackground(new java.awt.Color(51, 51, 51));
        txtBonus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBonus.setForeground(new java.awt.Color(255, 204, 255));
        txtBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBonusActionPerformed(evt);
            }
        });

        txtSurname.setBackground(new java.awt.Color(51, 51, 51));
        txtSurname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSurname.setForeground(new java.awt.Color(255, 204, 255));
        txtSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSurnameActionPerformed(evt);
            }
        });
        txtSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSurnameKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtName)
                        .addComponent(txtId)
                        .addComponent(txtBonus)
                        .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(331, 331, 331)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSurnameActionPerformed

    private void txtBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBonusActionPerformed

    private void txtSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSalaryKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
                || (c == java.awt.event.KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSalaryKeyTyped

    private void cbxpositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxpositionActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
            || (c == java.awt.event.KeyEvent.VK_BACK_SPACE)
            || (c == java.awt.event.KeyEvent.VK_DELETE))) {
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        if (tblData.getSelectedRow() >= 0) {
            model.removeRow(selectedRow);
            clearTextField();
        } else {
            JOptionPane.showMessageDialog(this, "Plese Enter data before Delete");

        }
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(this, "Ara You Sure Want To Close?");
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        //        float salarydelete = Float.parseFloat(txtSalary.getText());
        int selectedRow = tblData.getSelectedRow();
        if (tblData.getSelectedRow() >= 0) {
            model.removeRow(selectedRow);
            //               coun1=salarydelete-coun1;
            clearTextField();
        } else {
            JOptionPane.showMessageDialog(this, "Plese Mouse Click data before Delete");

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
        txtSalary.setText("");
        txtBonus.setText("");
        RtxtSummary.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:

        String Total = "Summary \nEmployee Count : " + acc + " \nSalary Total : " + count1 + " \nBonus Total : " + count;
        RtxtSummary.setText(String.valueOf(Total));
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String surname = txtSurname.getText();
        float salary = Float.parseFloat(txtSalary.getText());
        String money = txtSalary.getText();
        String position = (String) cbxposition.getSelectedItem();
        

        float sum = 0;
        if (position == "Manager") {
            if (salary < 10000) {
                sum = (float) (salary * 0.05);
                type = "Manager";
            }
            if (salary >= 10000) {
                sum = (float) (0.10 * salary);
                type = "Manager";
            }
        }
    
        if (position == "Assistant Manager") {
            if (salary < 10000) {
                sum = (float) (salary * 0.15);
                type = "Assistant Manager";
            }
            if (salary >= 10000) {
                sum = (float) (0.20 * salary);
                type = "Asssistant Manager";
            }
        }
        if (position == "General") {
            if (salary < 10000) {
                sum = (float) (salary * 0.25);
                type = "General";
            }
            if (salary >= 10000) {
                sum = (float) (0.30 * salary);
                type = "General";

            }
        }
        if (!id.equals("")) {
            acc++;
        }

        txtBonus.setText(String.valueOf(sum));
        String bonus = txtBonus.getText();
        count = count + sum;
        count1 = count1 + salary;
        if (!id.equals("") && !name.equals("") && !surname.equals("") && !type.equals("") && !money.equals("") && !bonus.equals("")) {
            String[] rowData = {id, name, surname, type, money, bonus};
            model.addRow(rowData);

        } else {
            JOptionPane.showMessageDialog(this, "Plese Enter before Add");
        }
        clearTextField();
    }//GEN-LAST:event_btnAddActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblData.getSelectedRow();
        if (selectedRow >= 0) {
            String id = (String) tblData.getValueAt(selectedRow, 0);
            String name = (String) tblData.getValueAt(selectedRow, 1);
            String surname = (String) tblData.getValueAt(selectedRow, 2);
            String position = (String) tblData.getValueAt(selectedRow, 3);
            String salary = (String) tblData.getValueAt(selectedRow, 4);
            txtId.setText(id);
            txtName.setText(name);
            txtSurname.setText(surname);
            txtSalary.setText(surname);

        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtSurnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSurnameKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSurnameKeyTyped

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
            java.util.logging.Logger.getLogger(EmployeeBonusGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonusGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonusGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeBonusGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new EmployeeBonusGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea RtxtSummary;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JComboBox<String> cbxposition;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtBonus;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSurname;
    private javax.swing.JButton txtTotal;
    // End of variables declaration//GEN-END:variables

    private void clearTextField() {
        txtId.setText("");
        txtName.setText("");
        txtSurname.setText("");
        type = "";
        txtSalary.setText("");
    }

}
