/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwms.ui;

import cwms.controller.GRNHandler;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Asanka
 */
public class GRNProfile extends javax.swing.JFrame {
PreparedStatement prepst = null;
ResultSet res = null;
Connection dbcon = null;

    /**
     * Creates new form EmployeeProfile
     */
    public GRNProfile() {
        initComponents();
        comboFill();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        grnDate = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        grnID = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sID = new javax.swing.JLabel();
        supplierName = new javax.swing.JComboBox<String>();
        newTotal = new javax.swing.JTextField();
        grnDateNew = new com.toedter.calendar.JDateChooser();
        retriveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 77, 25));

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GRN ID               :");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Purchased Date :");

        grnDate.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        grnDate.setForeground(new java.awt.Color(255, 255, 255));

        total.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        total.setForeground(new java.awt.Color(255, 255, 255));
        total.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Total Price          :");

        updateBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        updateBtn.setText("Update Profile");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        deleteBtn.setText("Delete Profile");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GRN Profile");

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Home_26px.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Exit_26px.png")); // NOI18N
        jButton8.setText("Exit");

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Supplier Name  :");

        grnID.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Supplier ID         :");

        sID.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        sID.setForeground(new java.awt.Color(255, 255, 255));

        supplierName.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        supplierName.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                supplierNamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        newTotal.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N

        grnDateNew.setDateFormatString("dd-MMM-yyyy");
        grnDateNew.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        grnDateNew.setMaxSelectableDate(new java.util.Date(4102428682000L));
        grnDateNew.setMinSelectableDate(new java.util.Date(946666882000L));

        retriveBtn.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        retriveBtn.setText("Retrive Profile");
        retriveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retriveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addGap(459, 459, 459)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(18, 18, 18)
                                            .addComponent(grnID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel11)
                                                .addComponent(jLabel10))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(18, 18, 18)
                                            .addComponent(grnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(134, 134, 134)
                                            .addComponent(retriveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(23, 23, 23)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(grnDateNew, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(newTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(supplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(grnID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(newTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(grnDateNew, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(retriveBtn))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comboFill() 
    {
        try 
        {
            dbcon = DriverManager.getConnection("jdbc:mysql://localhost/groomings_db", "root", "");
            String data = "SELECT * FROM supplier";
            prepst = dbcon.prepareStatement(data);   
            res = prepst.executeQuery();
            supplierName.removeAllItems();

            
            while(res.next())
            {
               
                String sup_name = res.getString("sup_name");
                supplierName.addItem(sup_name);
                supplierName.setSelectedItem(null);

            }
                
            
        } 
        
        catch (Exception e) 
        {
            e.printStackTrace();
        } 
    }
    
    public void getSid()
    {
        String tmp = (String)supplierName.getSelectedItem();
        String sql = "SELECT * FROM supplier WHERE sup_name=?";
        try {
         prepst = dbcon.prepareStatement(sql);
         prepst.setString(1, tmp);
         res=prepst.executeQuery();
         
         if(res.next()){
         String sid = res.getString("sup_id");
         sID.setText(sid);
         }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void getValues()
    {
        String temp = grnID.getText().trim();
        String gidcheck = "SELECT grn_id FROM grn WHERE grn_id=?";
        
        try {
            
            prepst = dbcon.prepareStatement(gidcheck);
            prepst.setString(1, temp);
            ResultSet rest=prepst.executeQuery();
            
        if (supplierName.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please select the Supplier Name");
   
        }
            
        else if(grnID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the GRN ID");

        }
        
        else if(!rest.next()){
            grnDate.setText("");
            total.setText("");
            JOptionPane.showMessageDialog(null, "Non existing GRN ID");

            } 
        
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        String tmp = grnID.getText().trim();
        String sql = "SELECT * FROM grn WHERE grn_id=?";
        try {
         prepst = dbcon.prepareStatement(sql);
         prepst.setString(1, tmp);
         res=prepst.executeQuery();
         
         if(res.next()){
         String pdate = res.getString("pur_date");
         String price = res.getString("total");
         grnDate.setText(pdate);
         total.setText(price);
         }
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateValues()
    {
        String temp = grnID.getText().trim();
        String gidcheck = "SELECT grn_id FROM grn WHERE grn_id=?";
        
        try {
            
            prepst = dbcon.prepareStatement(gidcheck);
            prepst.setString(1, temp);
            ResultSet rest=prepst.executeQuery();
            
            
            
         if (supplierName.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please select the Supplier Name");
            return;
         }
            
        else if(grnID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the GRN ID");
            return;
        }
        
        else if(!rest.next()){
            grnDate.setText("");
            total.setText("");
            JOptionPane.showMessageDialog(null, "Non existing GRN ID");
            return;
        }
        
        else if (grnDate==null && total==null || grnDate.getText().trim().equals("") && total.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please press the Retrive Profile button");
            return;
        }
        else if(grnDateNew.getDate()==null && newTotal.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Please enter the updated Purchase Date or the updated Total Price");
            return;
        }
        }
        catch (Exception e) {
            e.printStackTrace();
            
        } 
          
        try {   
            
            String grnid = grnID.getText().trim();
            String grndatedef = grnDate.getText().trim();
            String totdef = total.getText().trim();
            
            if(grnDateNew.getDate()!=null){
                
                java.util.Date grndate = grnDateNew.getDate();
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
               grndatedef = df.format(grndate);
                
         
            }
           
             
            if(!newTotal.getText().trim().equals("")){
                
               totdef = newTotal.getText().trim();
                
               
            }
            
              GRNHandler gh=new GRNHandler();
              gh.updateGRN(grnid,grndatedef,totdef);
                
            
            postUpdate();    
                
        } 
        
        catch (Exception e) {
            e.printStackTrace();
            
        }
    
    
    }
    
    private void postUpdate()
    {   
        supplierName.setSelectedItem(null);
        sID.setText(null);
        grnID.setText(null);
        grnDate.setText(null);
        grnDateNew.setCalendar(null);
        total.setText(null);
        newTotal.setText(null);
            
            
        JOptionPane.showMessageDialog(null, "GRN successfully updated.");
        
    }
    
    private void removeGRN()
    {
        String temp = grnID.getText().trim();
        String gidcheck = "SELECT grn_id FROM grn WHERE grn_id=?";
        
        try {
            
            prepst = dbcon.prepareStatement(gidcheck);
            prepst.setString(1, temp);
            ResultSet rest=prepst.executeQuery();
            
        if (supplierName.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Please select the Supplier Name");
            return;
        }
            
        else if(grnID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please enter the GRN ID");
            return;
        }
        
        else if(!rest.next()){
            grnDate.setText("");
            total.setText("");
            JOptionPane.showMessageDialog(null, "Non existing GRN ID");
            return;
        } 
                
        else if (grnDate==null && total==null || grnDate.getText().trim().equals("") && total.getText().trim().equals("")){
            JOptionPane.showMessageDialog(null, "Please press the Retrive Profile button");
            return;
        }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    
        
        try {
         
            String cmessage = "Do you wish to delete the GRN from the Database?";   
            String conf = "Exit";
            int confirm = JOptionPane.showConfirmDialog(null, cmessage, conf, JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_NO_OPTION){
               GRNHandler grnh=new GRNHandler();
               grnh.deleteGRN(grnID.getText());
             
            
               
            supplierName.setSelectedItem(null);
            sID.setText(null);
            grnID.setText(null);
            grnDate.setText(null);
            grnDateNew.setCalendar(null);
            total.setText(null);
            newTotal.setText(null);   
               
            JOptionPane.showMessageDialog(null, "GRN successfully deleted");   
        }
        else
        {
           JOptionPane.getRootFrame().dispose();
        }
        } catch (Exception e) {
        }
        
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      Main m1=new Main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       GRNMain m1=new GRNMain();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        updateValues();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void supplierNamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_supplierNamePopupMenuWillBecomeInvisible
        getSid();
    }//GEN-LAST:event_supplierNamePopupMenuWillBecomeInvisible

    private void retriveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retriveBtnActionPerformed
       getValues();
    }//GEN-LAST:event_retriveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        removeGRN();
    }//GEN-LAST:event_deleteBtnActionPerformed

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
            java.util.logging.Logger.getLogger(GRNProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRNProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRNProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRNProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GRNProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel grnDate;
    private com.toedter.calendar.JDateChooser grnDateNew;
    private javax.swing.JTextField grnID;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newTotal;
    private javax.swing.JButton retriveBtn;
    private javax.swing.JLabel sID;
    private javax.swing.JComboBox<String> supplierName;
    private javax.swing.JLabel total;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
