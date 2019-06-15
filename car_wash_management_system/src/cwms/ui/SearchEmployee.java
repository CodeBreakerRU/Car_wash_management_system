/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwms.ui;

import cwms.DataLayer.Common.ConnectionType;
import cwms.DataLayer.Common.DataBase;
import cwms.DataLayer.DataAccess;
import cwms.model.Employee;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Asanka
 */
public class SearchEmployee extends javax.swing.JFrame {

    public String emp_name;
    String emconno = "";
    String employeename = "";
    String nic = "";
    String add = "";
    String gen = "";
    String empid = "";
    String emname = "";
    String semail = "";
    String empos = "";

    DataBase db = new DataBase(ConnectionType.MYSQL);
    Connection conn = db.getConnection();

    /**
     * Creates new form EmployeeProfile
     */
    public SearchEmployee() {
      
        initComponents();
        tableInit();
        posCmb.setVisible(false);
        empdetailsTbl.setVisible(false);

    }

    private void tableInit() {
        JTableHeader header = empdetailsTbl.getTableHeader();
        TableCellRenderer rendererFromHeader = empdetailsTbl.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    private void posCombFill() {
        try {
             
            ResultSet resultset = null;
            String sql = "SELECT DISTINCT emp_designation FROM employee ";
            PreparedStatement statement = conn.prepareStatement(sql);

            resultset = statement.executeQuery();
            posCmb.removeAllItems();
            while (resultset.next()) {
                String mod = (resultset.getString(1));
                posCmb.addItem(mod);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
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
        jLabel1 = new javax.swing.JLabel();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        empidTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        empnameTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pastempChk = new javax.swing.JCheckBox();
        searchBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        empdetailsTbl = new javax.swing.JTable();
        exitBtn = new javax.swing.JButton();
        filtposLbl = new javax.swing.JLabel();
        posCmb = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 77, 25));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Employee");

        homeBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Home_26px.png")); // NOI18N
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        backBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Include past employees in your search? ");

        pastempChk.setBackground(jPanel1.getBackground());
        pastempChk.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        pastempChk.setForeground(new java.awt.Color(255, 255, 255));
        pastempChk.setText("Yes");

        searchBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        resetBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 12)); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        empdetailsTbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        empdetailsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Employee NIC", "Employee Gender", "Telephone Number", "Employee Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        empdetailsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empdetailsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empdetailsTbl);

        exitBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        exitBtn.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Exit_26px.png")); // NOI18N
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        filtposLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        filtposLbl.setForeground(new java.awt.Color(255, 255, 255));
        filtposLbl.setText("Filter by position?");
        filtposLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtposLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                filtposLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filtposLblMouseExited(evt);
            }
        });

        posCmb.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)
                        .addGap(501, 501, 501)
                        .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(empidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(326, 326, 326)
                        .addComponent(jLabel4)
                        .addGap(66, 66, 66)
                        .addComponent(empnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(pastempChk)
                        .addGap(258, 258, 258)
                        .addComponent(filtposLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(posCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(exitBtn)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(empidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empnameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pastempChk)
                    .addComponent(posCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(filtposLbl))))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(exitBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Main m1 = new Main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        EmployeeMain m2 = new EmployeeMain();
        m2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        
        empdetailsTbl.setVisible(true);
        emname = empnameTxt.getText().trim();
        
         int emid=0;
        boolean cboxcondition = pastempChk.isSelected();
        if (posCmb.isVisible())
        {
            String employeeposition = posCmb.getSelectedItem().toString();
            
            if(!employeeposition.isEmpty())
            {
               if(!emname.isEmpty())
               {
                        System.out.println(employeeposition);
                        DataAccess da = new DataAccess();
                        ArrayList<Employee> res;
                        res = da.searchEmployeeByNameWithPosition(emname, cboxcondition,employeeposition);
                        if (!res.isEmpty())
                        {
                             DefaultTableModel model = new DefaultTableModel();
                             empdetailsTbl.setModel(model);
                             model.setColumnIdentifiers(new String[]{
                                "Employee ID", "Employee Name", "Employee NIC", "Employee Gender", "Employee Address", "Telephone Number"});
                            for (Employee emp : res)
                            {
                                emid = emp.getEmpid();

                                emp_name = emp.getEmpname();
                                emconno = emp.getContactno();
                                empid = Integer.toString(emid);

                                nic = emp.getNIC();
                                add = emp.getAddress();
                                gen = emp.getGender();
                                empos = emp.getPosition();

                                String empid = Integer.toString(emid);

                                model.addRow(new String[]{empid, emp_name, nic, gen, emconno, add});

                            }
                        }
                        else
                        {
                                JOptionPane.showMessageDialog(null, "No search results found");
                                resetAll();
                        }
               }
               else
               {
                    DataAccess da = new DataAccess();
                    ArrayList<Employee> res;
                    res = da.searchEmployeeByPosition(cboxcondition,employeeposition);
                    if (!res.isEmpty())
                    {
                        DefaultTableModel model = new DefaultTableModel();
                        tableInit();
                        empdetailsTbl.setModel(model);
                        model.setColumnIdentifiers(new String[]{
                         "Employee ID", "Employee Name", "Employee NIC", "Employee Gender", "Employee Address", "Telephone Number"});
                        for (Employee emp : res) {
                            emid=emp.getEmpid();
                            nic = emp.getNIC();
                            add = emp.getAddress();
                            gen = emp.getGender();
                            emconno = emp.getContactno();
                            emp_name = emp.getEmpname();
                            empos = emp.getPosition();

                            empid = Integer.toString(emid);

                            model.addRow(new String[]{empid, emp_name, nic, gen, add, emconno,});
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "No search results found");
                        resetAll();
                    }
               }

            
            }
        }
        else
        {

            int emplid = 0;

            if (emname.isEmpty())
            {

                emplid = Integer.parseInt(empidTxt.getText().trim());
                DataAccess da = new DataAccess();
                ArrayList<Employee> res;
                res = da.searchEmployeeByIDWithoutPosition(emplid, cboxcondition);
                if (!res.isEmpty())
                {
                    
                    DefaultTableModel model = new DefaultTableModel();
                    tableInit();
                    empdetailsTbl.setModel(model);
                    model.setColumnIdentifiers(new String[]{
                    "Employee ID", "Employee Name", "Employee NIC", "Employee Gender", "Employee Address", "Telephone Number"});
                    for (Employee emp : res)
                    {
                        String employeeid=Integer.toString(emp.getEmpid());
                        nic = emp.getNIC();
                        add = emp.getAddress();
                        gen = emp.getGender();
                        emconno = emp.getContactno();
                        emp_name = emp.getEmpname();
                        empos = emp.getPosition();
                        
                        model.addRow(new String[]{employeeid, emp_name, nic, gen, add, emconno,empos});
                    }
    
                }
            
                else
                {
                        JOptionPane.showMessageDialog(null, "No search results found");
                        resetAll();
                }

            }
            else
            {
                DataAccess da = new DataAccess();
                ArrayList<Employee> res;
                res = da.searchEmployeeByNameWithoutPosition(emname, cboxcondition);
                if (!res.isEmpty())
                {
                    DefaultTableModel model = new DefaultTableModel();
                    empdetailsTbl.setModel(model);
                    model.setColumnIdentifiers(new String[]{
                    "Employee ID", "Employee Name", "Employee NIC", "Employee Gender", "Employee Address", "Telephone Number"});
                    for (Employee emp : res)
                    {
                        emid = emp.getEmpid();
                        emp_name = emp.getEmpname();
                        emconno = emp.getContactno();
                        empid = Integer.toString(emid);
                        nic = emp.getNIC();
                        add = emp.getAddress();
                        gen = emp.getGender();
                        empos = emp.getPosition();
                        String empid = Integer.toString(emid);

                        model.addRow(new String[]{empid, emp_name, nic, gen, emconno, add});

                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No search results found");
                    resetAll();
                }
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    private void resetAll() {
        empidTxt.setText("");
        empnameTxt.setText("");
        posCmb.setVisible(false);
        pastempChk.setSelected(false);
        for (int i = 0; i < empdetailsTbl.getRowCount(); i++) {
            for (int j = 0; j < empdetailsTbl.getColumnCount(); j++) {
                empdetailsTbl.setValueAt("", i, j);
            }
        }
    }
    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        resetAll();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void empdetailsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empdetailsTblMouseClicked
        if(!pastempChk.isSelected()) 
        {
            int r = empdetailsTbl.getSelectedRow();

            String eid = empdetailsTbl.getValueAt(r, 0).toString();
            String ename = empdetailsTbl.getValueAt(r, 1).toString();
            String ephone = empdetailsTbl.getValueAt(r, 4).toString();
            String egen = empdetailsTbl.getValueAt(r, 2).toString();
            String emnic = empdetailsTbl.getValueAt(r, 3).toString();
            String ead = empdetailsTbl.getValueAt(r, 5).toString();

            this.dispose();
            new EmployeeProfile(eid, ename, egen, ead, ephone, emnic, empos).setVisible(true);
        }
        else
        {
            int r = empdetailsTbl.getSelectedRow();

            String eid = empdetailsTbl.getValueAt(r, 0).toString();
            String ename = empdetailsTbl.getValueAt(r, 1).toString();
            String ephone = empdetailsTbl.getValueAt(r, 4).toString();
            String egen = empdetailsTbl.getValueAt(r, 2).toString();
            String emnic = empdetailsTbl.getValueAt(r, 3).toString();
            String ead = empdetailsTbl.getValueAt(r, 5).toString();

            this.dispose();
            new EmployeeSummaryForm(eid, ename, egen, ead, ephone, emnic, empos,"No longer working here").setVisible(true);
        }

    }//GEN-LAST:event_empdetailsTblMouseClicked

    private void filtposLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtposLblMouseClicked
        posCmb.setVisible(true);

        posCombFill();
        posCmb.setSelectedItem(null);
    }//GEN-LAST:event_filtposLblMouseClicked

    private void filtposLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtposLblMouseEntered
        Font myFont = new Font("Microsoft JhengHei", Font.ITALIC, 14);
        filtposLbl.setFont(myFont);
        filtposLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_filtposLblMouseEntered

    private void filtposLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtposLblMouseExited
        Font myFont = new Font("Microsoft JhengHei", Font.PLAIN, 14);
        filtposLbl.setFont(myFont);
    }//GEN-LAST:event_filtposLblMouseExited

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        String cmessage = "Do you wish to exit?";   
        String conf = "Exit Message";
        int confirm = JOptionPane.showConfirmDialog(null, cmessage, conf,JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
                System.exit(0);
        }
        else{
                this.dispose();
        
                DSalesMain dsm=new DSalesMain();
                dsm.setVisible(true);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTable empdetailsTbl;
    private javax.swing.JTextField empidTxt;
    private javax.swing.JTextField empnameTxt;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel filtposLbl;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox pastempChk;
    private javax.swing.JComboBox posCmb;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    // End of variables declaration//GEN-END:variables
}