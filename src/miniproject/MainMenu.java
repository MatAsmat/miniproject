package miniproject;

import javax.swing.JFrame;
import miniproject.FrmAddEmployee;
import miniproject.FrmAddUser;
import miniproject.FrmReport;

public class MainMenu extends javax.swing.JFrame {

    FrmAddUser frmUser;
    FrmAddEmployee frmEmp;
    FrmReport frmReport;
    
    public MainMenu(){
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /*public MainMenu(String InpUserType) {
        super();
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        
        userType = inpuserType;
        System.out.println("Main Fram userType = "+userType);
        if(Integer.parseInt(userType)==1){
            this.menuEmployee.setVisible(true);
            this.menuReport.setVisible(true);
            this.menuUser.setVisible(true);
        }else{
            this.menuEmployee.setVisible(false);
            this.menuReport.setVisible(false);
            this.menuUser.setVisible(false);
            
        }*/
    

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        dpShow = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEmployee = new javax.swing.JMenu();
        menuReport = new javax.swing.JMenu();
        menuProgram = new javax.swing.JMenu();
        menuEra = new javax.swing.JMenu();
        menuCircle = new javax.swing.JMenu();
        menuCount = new javax.swing.JMenu();
        menuTemp = new javax.swing.JMenu();
        menuEnglish = new javax.swing.JMenu();
        menuMatrix = new javax.swing.JMenu();
        menuComparison = new javax.swing.JMenu();
        menuSale = new javax.swing.JMenu();
        menuGrade = new javax.swing.JMenu();
        menuElectriciti = new javax.swing.JMenu();
        menuGas = new javax.swing.JMenu();
        menuPhotograph = new javax.swing.JMenu();
        menuLetter = new javax.swing.JMenu();
        menuBonus = new javax.swing.JMenu();
        menuWater = new javax.swing.JMenu();
        menuInternet = new javax.swing.JMenu();
        manuLatex = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Created by Asmat Saleah");
        setBackground(new java.awt.Color(255, 204, 255));

        dpShow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout dpShowLayout = new javax.swing.GroupLayout(dpShow);
        dpShow.setLayout(dpShowLayout);
        dpShowLayout.setHorizontalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 661, Short.MAX_VALUE)
        );
        dpShowLayout.setVerticalGroup(
            dpShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 51, 255));
        jMenuBar1.setForeground(new java.awt.Color(51, 0, 255));

        menuUser.setBackground(new java.awt.Color(0, 102, 102));
        menuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/user.png"))); // NOI18N
        menuUser.setText("Add User");
        menuUser.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuUserMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuUser);

        menuEmployee.setBackground(new java.awt.Color(102, 0, 102));
        menuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/employee.png"))); // NOI18N
        menuEmployee.setText("Add Employee");
        menuEmployee.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuEmployee.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmployeeMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuEmployee);

        menuReport.setBackground(new java.awt.Color(51, 102, 0));
        menuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/report.png"))); // NOI18N
        menuReport.setText("Report");
        menuReport.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuReportMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuReport);

        menuProgram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/program.png"))); // NOI18N
        menuProgram.setText("Program");
        menuProgram.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        menuProgram.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menuProgram.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menuProgram.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProgramMouseClicked(evt);
            }
        });

        menuEra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/year.png"))); // NOI18N
        menuEra.setText("Convert Christian Era <--> Buddhist Era ");
        menuEra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEraMouseClicked(evt);
            }
        });
        menuProgram.add(menuEra);

        menuCircle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/circle.png"))); // NOI18N
        menuCircle.setText("Circle Calculation");
        menuCircle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCircleMouseClicked(evt);
            }
        });
        menuProgram.add(menuCircle);

        menuCount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/Count.png"))); // NOI18N
        menuCount.setText("Count Alphabet From Sentence ");
        menuCount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCountMouseClicked(evt);
            }
        });
        menuProgram.add(menuCount);

        menuTemp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/Temperature.png"))); // NOI18N
        menuTemp.setText("Convert Degree Celsius <--> Degree Fahrenheit");
        menuTemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTempMouseClicked(evt);
            }
        });
        menuProgram.add(menuTemp);

        menuEnglish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/English.png"))); // NOI18N
        menuEnglish.setText("English Length Ratio");
        menuEnglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEnglishMouseClicked(evt);
            }
        });
        menuProgram.add(menuEnglish);

        menuMatrix.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/matrix.png"))); // NOI18N
        menuMatrix.setText("Matrix Length Ratio");
        menuMatrix.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuMatrixMouseClicked(evt);
            }
        });
        menuProgram.add(menuMatrix);

        menuComparison.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/Compare.png"))); // NOI18N
        menuComparison.setText("Comparison Of Matrix And English Length Ratio");
        menuComparison.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuComparisonMouseClicked(evt);
            }
        });
        menuProgram.add(menuComparison);

        menuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/Sale.png"))); // NOI18N
        menuSale.setText("Sale Information");
        menuSale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSaleMouseClicked(evt);
            }
        });
        menuProgram.add(menuSale);

        menuGrade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/grade.png"))); // NOI18N
        menuGrade.setText("Grade Calculation");
        menuGrade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGradeMouseClicked(evt);
            }
        });
        menuProgram.add(menuGrade);

        menuElectriciti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/elctricity.png"))); // NOI18N
        menuElectriciti.setText("Electriciti Calculation");
        menuElectriciti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuElectricitiMouseClicked(evt);
            }
        });
        menuProgram.add(menuElectriciti);

        menuGas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/Gas.png"))); // NOI18N
        menuGas.setText("Gasoline Calculation ");
        menuGas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuGasMouseClicked(evt);
            }
        });
        menuProgram.add(menuGas);

        menuPhotograph.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/photo.png"))); // NOI18N
        menuPhotograph.setText("Photograph Shop");
        menuPhotograph.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPhotographMouseClicked(evt);
            }
        });
        menuProgram.add(menuPhotograph);

        menuLetter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/letter.png"))); // NOI18N
        menuLetter.setText("Letter Post Shop");
        menuLetter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLetterMouseClicked(evt);
            }
        });
        menuProgram.add(menuLetter);

        menuBonus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/bonus.png"))); // NOI18N
        menuBonus.setText("Employee Bonus");
        menuBonus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBonusMouseClicked(evt);
            }
        });
        menuProgram.add(menuBonus);

        menuWater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/water.png"))); // NOI18N
        menuWater.setText("Water Calculation");
        menuWater.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuWaterMouseClicked(evt);
            }
        });
        menuProgram.add(menuWater);

        menuInternet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/internet.png"))); // NOI18N
        menuInternet.setText("Hi Speed Internet");
        menuInternet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuInternetMouseClicked(evt);
            }
        });
        menuProgram.add(menuInternet);

        manuLatex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/icon/gallon.png"))); // NOI18N
        manuLatex.setText("Latex Calculation");
        manuLatex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuLatexMouseClicked(evt);
            }
        });
        menuProgram.add(manuLatex);

        jMenuBar1.add(menuProgram);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dpShow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuUserMouseClicked
        // TODO add your handling code here:
        frmUser = new FrmAddUser();
        this.dpShow.add(frmUser);
        frmUser.setVisible(true);
        frmUser.setSize(this.getSize());

    }//GEN-LAST:event_menuUserMouseClicked

    private void menuEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmployeeMouseClicked
        // TODO add your handling code here:
        frmEmp = new FrmAddEmployee();
        this.dpShow.add(frmEmp);
        frmEmp.setVisible(true);
        frmEmp.setSize(this.getSize());
    }//GEN-LAST:event_menuEmployeeMouseClicked

    private void menuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuReportMouseClicked
        // TODO add your handling code here:
        frmReport = new FrmReport();
        this.dpShow.add(frmReport);
        frmReport.setVisible(true);
        frmReport.setSize(this.getSize());
    }//GEN-LAST:event_menuReportMouseClicked

    private void menuProgramMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProgramMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_menuProgramMouseClicked

    private void menuInternetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuInternetMouseClicked
        // TODO add your handling code here:
        HiSpeedInternetGUI Internet = new HiSpeedInternetGUI();
        Internet.setVisible(true);
        Internet.setSize(this.getSize());
    }//GEN-LAST:event_menuInternetMouseClicked

    private void menuWaterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuWaterMouseClicked
        // TODO add your handling code here:
        WaterCalculationGUI Water = new WaterCalculationGUI();
        Water.setVisible(true);
        Water.setSize(this.getSize());
    }//GEN-LAST:event_menuWaterMouseClicked

    private void menuBonusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBonusMouseClicked
        // TODO add your handling code here:
        EmployeeBonusGUI Bonus = new EmployeeBonusGUI();
        Bonus.setVisible(true);
        Bonus.setSize(this.getSize());
    }//GEN-LAST:event_menuBonusMouseClicked

    private void menuLetterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLetterMouseClicked
        // TODO add your handling code here:
        LetterPostShopGUI Letter = new LetterPostShopGUI();
        Letter.setVisible(true);
        Letter.setSize(this.getSize());
    }//GEN-LAST:event_menuLetterMouseClicked

    private void menuPhotographMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPhotographMouseClicked
        // TODO add your handling code here:
        PhotographShopGUI Photograph = new PhotographShopGUI();
        Photograph.setVisible(true);
        Photograph.setSize(this.getSize());
    }//GEN-LAST:event_menuPhotographMouseClicked

    private void menuGasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGasMouseClicked
        // TODO add your handling code here:
        GasolineCalculationGUI Gas = new GasolineCalculationGUI();
        Gas.setVisible(true);
        Gas.setSize(this.getSize());
    }//GEN-LAST:event_menuGasMouseClicked

    private void menuElectricitiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuElectricitiMouseClicked
        // TODO add your handling code here:
        ElectricityCalculationGUI Electric = new ElectricityCalculationGUI();
        Electric.setVisible(true);
        Electric.setSize(this.getSize());
    }//GEN-LAST:event_menuElectricitiMouseClicked

    private void menuGradeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuGradeMouseClicked
        // TODO add your handling code here:
        GradeCalculationGUI Grade = new GradeCalculationGUI();
        Grade.setVisible(true);
        Grade.setSize(this.getSize());
    }//GEN-LAST:event_menuGradeMouseClicked

    private void menuSaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSaleMouseClicked
        // TODO add your handling code here:
        SaleCommissionGUI Sale = new SaleCommissionGUI();
        Sale.setVisible(true);
        Sale.setSize(this.getSize());
    }//GEN-LAST:event_menuSaleMouseClicked

    private void menuComparisonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuComparisonMouseClicked
        // TODO add your handling code here:
        EnglishAndMatrixCompareLengthRatioGUI Compare = new EnglishAndMatrixCompareLengthRatioGUI();
        Compare.setVisible(true);
        Compare.setSize(this.getSize());
    }//GEN-LAST:event_menuComparisonMouseClicked

    private void menuMatrixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuMatrixMouseClicked
        // TODO add your handling code here:
        MatrixLengthRatioGUI Matrix = new MatrixLengthRatioGUI();
        Matrix.setVisible(true);
        Matrix.setSize(this.getSize());
    }//GEN-LAST:event_menuMatrixMouseClicked

    private void menuEnglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEnglishMouseClicked
        // TODO add your handling code here:
        EnglishLengthRatioGUI English = new EnglishLengthRatioGUI();
        English.setVisible(true);
        English.setSize(this.getSize());
    }//GEN-LAST:event_menuEnglishMouseClicked

    private void menuTempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTempMouseClicked
        // TODO add your handling code here:
        ConvertTempperatureGUI Temp = new ConvertTempperatureGUI();
        Temp.setVisible(true);
        Temp.setSize(this.getSize());
    }//GEN-LAST:event_menuTempMouseClicked

    private void menuCountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCountMouseClicked
        // TODO add your handling code here:
        CountAlphabetFromSentenceGUI Count = new CountAlphabetFromSentenceGUI();
        Count.setVisible(true);
        Count.setSize(this.getSize());
    }//GEN-LAST:event_menuCountMouseClicked

    private void menuCircleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCircleMouseClicked
        // TODO add your handling code here:
        CircleGUI Circle = new CircleGUI();
        Circle.setVisible(true);
        Circle.setSize(this.getSize());
    }//GEN-LAST:event_menuCircleMouseClicked

    private void menuEraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEraMouseClicked
        // TODO add your handling code here:
        ConvertChristianEraBuddhistEraGUI Era = new ConvertChristianEraBuddhistEraGUI();
        Era.setVisible(true);
        Era.setSize(this.getSize());
    }//GEN-LAST:event_menuEraMouseClicked

    private void manuLatexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuLatexMouseClicked
        // TODO add your handling code here:
        LatexCalculationGUI Latex = new LatexCalculationGUI();
        Latex.setVisible(true);
        Latex.setSize(this.getSize());
    }//GEN-LAST:event_manuLatexMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpShow;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu manuLatex;
    private javax.swing.JMenu menuBonus;
    private javax.swing.JMenu menuCircle;
    private javax.swing.JMenu menuComparison;
    private javax.swing.JMenu menuCount;
    private javax.swing.JMenu menuElectriciti;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuEnglish;
    private javax.swing.JMenu menuEra;
    private javax.swing.JMenu menuGas;
    private javax.swing.JMenu menuGrade;
    private javax.swing.JMenu menuInternet;
    private javax.swing.JMenu menuLetter;
    private javax.swing.JMenu menuMatrix;
    private javax.swing.JMenu menuPhotograph;
    private javax.swing.JMenu menuProgram;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSale;
    private javax.swing.JMenu menuTemp;
    private javax.swing.JMenu menuUser;
    private javax.swing.JMenu menuWater;
    // End of variables declaration//GEN-END:variables
}
