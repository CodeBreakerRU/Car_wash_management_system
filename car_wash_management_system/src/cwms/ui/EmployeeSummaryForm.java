/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwms.ui;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class EmployeeSummaryForm extends javax.swing.JFrame {
String emid;
String emname;
String emadd;
String emgen;
String emnic;
String empos;
String emcon;
    /**
     * Creates new form EmployeeSummaryForm
     */
    public EmployeeSummaryForm() {
        initComponents();
    }
    public EmployeeSummaryForm(String eid, String ename, String eadd, String egen, String enic, String epos, String econ) {
      this();
      emidLbl.setText(eid);
      this.emid=eid;
      emnameLbl.setText(ename);
      this.emname=ename;
      emadLbl.setText(eadd);
      this.emadd=eadd;
      emgenLbl.setText(egen);
      this.emgen=egen;
      emnicLbl.setText(enic);
      this.emnic=enic;
      emposLbl.setText(epos);
      this.empos=epos;
      emconLbl.setText(econ);
      this.emcon=econ;
      statusnmLbl.setVisible(false);
      statusLbl.setVisible(false);
    }
    public EmployeeSummaryForm(String eid, String ename,String enic,String eadd,  String econ,String egen, String epos,String emstatus) {
      this();
      emidLbl.setText(eid);
      this.emid=eid;
      emnameLbl.setText(ename);
      this.emname=ename;
      emadLbl.setText(eadd);
      this.emadd=eadd;
      emgenLbl.setText(egen);
      this.emgen=egen;
      emnicLbl.setText(enic);
      this.emnic=enic;
      emposLbl.setText(epos);
      this.empos=epos;
      emconLbl.setText(econ);
      this.emcon=econ;
      statusLbl.setText(emstatus);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        emidLbl = new javax.swing.JLabel();
        emnameLbl = new javax.swing.JLabel();
        emgenLbl = new javax.swing.JLabel();
        emadLbl = new javax.swing.JLabel();
        emnicLbl = new javax.swing.JLabel();
        emconLbl = new javax.swing.JLabel();
        emposLbl = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        beforeBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        statusnmLbl = new javax.swing.JLabel();
        statusLbl = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Position:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 77, 25));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Information");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID :");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee Name :");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender :");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address :");

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Contact Number:");

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("NIC :");

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Position :");

        emidLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emidLbl.setForeground(new java.awt.Color(255, 255, 255));

        emnameLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emnameLbl.setForeground(new java.awt.Color(255, 255, 255));

        emgenLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emgenLbl.setForeground(new java.awt.Color(255, 255, 255));

        emadLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emadLbl.setForeground(new java.awt.Color(255, 255, 255));

        emnicLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emnicLbl.setForeground(new java.awt.Color(255, 255, 255));

        emconLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emconLbl.setForeground(new java.awt.Color(255, 255, 255));

        emposLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        emposLbl.setForeground(new java.awt.Color(255, 255, 255));

        okBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        okBtn.setText("OK");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        homeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Home_26px.png")); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        beforeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        beforeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beforeBtnActionPerformed(evt);
            }
        });

        exitBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Exit_26px.png")); // NOI18N
        exitBtn.setText("Exit");

        statusnmLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        statusnmLbl.setForeground(new java.awt.Color(255, 255, 255));
        statusnmLbl.setText("Current Status :");

        statusLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        statusLbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(301, 301, 301)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(beforeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(67, 67, 67)
                        .addComponent(emidLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41)
                        .addComponent(emnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4)
                        .addGap(102, 102, 102)
                        .addComponent(emgenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addGap(97, 97, 97)
                        .addComponent(emadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel8)
                        .addGap(44, 44, 44)
                        .addComponent(emconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel14)
                        .addGap(128, 128, 128)
                        .addComponent(emnicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(614, 614, 614)
                        .addComponent(exitBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(statusnmLbl))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emposLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beforeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(emidLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(emnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(emgenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(emadLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(emconLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(emnicLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(emposLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(statusnmLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(statusLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addComponent(exitBtn)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Main m1=new Main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void beforeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beforeBtnActionPerformed
        EmployeeMain m2=new  EmployeeMain();
        m2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_beforeBtnActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        EmployeeMain m2=new  EmployeeMain();
        m2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_okBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String stat=statusLbl.getText().trim();
        if(stat.isEmpty())
        {
            EmployeeProfile ef=new EmployeeProfile(emid, emname, emnic, emadd, emcon, emgen, empos);
            ef.setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cannot edit past employee details");
            this.dispose();
            EmployeeMain m=new EmployeeMain();
            m.setVisible(true);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton beforeBtn;
    private javax.swing.JLabel emadLbl;
    private javax.swing.JLabel emconLbl;
    private javax.swing.JLabel emgenLbl;
    private javax.swing.JLabel emidLbl;
    private javax.swing.JLabel emnameLbl;
    private javax.swing.JLabel emnicLbl;
    private javax.swing.JLabel emposLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel statusLbl;
    private javax.swing.JLabel statusnmLbl;
    // End of variables declaration//GEN-END:variables
}
