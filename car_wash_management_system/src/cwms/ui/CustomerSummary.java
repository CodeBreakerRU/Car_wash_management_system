/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwms.ui;

/**
 *
 * @author DELL
 */
public class CustomerSummary extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSumary
     */
    public CustomerSummary() {
        initComponents();
    }
    
    public CustomerSummary(String cid,String name,String add,String mobile,String land,String email,String nic)
    {
        this();
        cIdLbl.setText(cid);
        cNameLbl.setText(name);
        cAddLbl.setText(add);
        cMobileLbl.setText(mobile);
        cLandLbl.setText(land);
        cEmailLbl.setText(email);
        cNicLbl.setText(nic);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cIdLbl = new javax.swing.JLabel();
        cNameLbl = new javax.swing.JLabel();
        cAddLbl = new javax.swing.JLabel();
        cMobileLbl = new javax.swing.JLabel();
        cLandLbl = new javax.swing.JLabel();
        cEmailLbl = new javax.swing.JLabel();
        cNicLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(25, 77, 25));

        jPanel1.setBackground(new java.awt.Color(25, 77, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name            :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 182, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address                :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 226, -1, -1));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mobile No.           :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 266, -1, -1));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 43, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Home_26px.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 43, 45, 42));

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 43, 45, 42));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Customer ID        :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 141, -1, -1));

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Land Phone No.  :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 304, 136, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Email   :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 342, -1, -1));

        jButton8.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Exit_26px.png")); // NOI18N
        jButton8.setText("Exit");
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer NIC :");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 380, -1, -1));

        cIdLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cIdLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cIdLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 80, 20));

        cNameLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cNameLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cNameLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 430, 20));

        cAddLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cAddLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cAddLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 430, 20));

        cMobileLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cMobileLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cMobileLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 420, 20));

        cLandLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cLandLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cLandLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 360, 20));

        cEmailLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cEmailLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cEmailLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 380, 20));

        cNicLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        cNicLbl.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cNicLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 320, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Main m1=new Main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        CusMain m1=new CusMain();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSummary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSummary().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cAddLbl;
    private javax.swing.JLabel cEmailLbl;
    private javax.swing.JLabel cIdLbl;
    private javax.swing.JLabel cLandLbl;
    private javax.swing.JLabel cMobileLbl;
    private javax.swing.JLabel cNameLbl;
    private javax.swing.JLabel cNicLbl;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
