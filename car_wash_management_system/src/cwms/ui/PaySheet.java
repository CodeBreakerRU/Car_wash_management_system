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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PaySheet extends javax.swing.JFrame {
String empname;
String empposition;
double lo;
double dm;
double advp;
    /**
     * Creates new form PaySheet
     */
    public PaySheet() {
        initComponents();
        
    }
    public PaySheet(String ename,String position,double loan,double dmg,double adp) {
        this();
        this.empname=ename;
        this.empposition=position;
        this.lo=loan;
        this.dm=dmg;
        this.advp=adp;
        detailLoad();
      
    }
    private void detailLoad()
    {
        DataAccess da=new DataAccess();
        ResultSet resultset=null;
        empNameLbl.setText(empname);
       String currentmonth = new java.util.Date().toString().substring(4,8)+new java.util.Date().toString().substring(24,28);
      
       
        monthLbl.setText(currentmonth);
        employerNameLbl.setText("Groomings Pvt. Ltd.");
        
       
        try
        {
            DataBase db=new DataBase(ConnectionType.MYSQL);
            Connection con=db.getConnection();
            PreparedStatement pstmt = con.prepareStatement("SELECT emp_id FROM employee WHERE  emp_name=?");
            pstmt.setString(1,empname);
            resultset=pstmt.executeQuery();
            
            while(resultset.next())
            {
                int eid=resultset.getInt(1);
                empidLbl.setText(Integer.toString(eid));
                refnoLbl.setText("EMP-"+resultset.getInt(1));
                int days=da.getNoOfDaysWorked(eid, currentmonth);      
                daysattLbl.setText(Integer.toString(days));
               
            }
            
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        catch(Exception e1) {
            System.out.println(e1);
        }
      
       DecimalFormat df=new DecimalFormat("#####.00");
       double bsalry=da.getBasicsalary();
       basSalaryLbl.setText(Double.toString(bsalry));
       
       //ot days
       int otdays=da.getOtdays();
       otdaysLbl.setText(Integer.toString(otdays));
       
       //ot bonus
       double otbonus=da.getOtbonus();
       df.format(otbonus);
       otBonusLbl.setText(Double.toString(otbonus));
       
       //epf
       double epf=da.getDeducted_epf();
       df.format(epf);
       epfLbl.setText(Double.toString(epf));

       //etf
       double etf=da.getDeducted_etf();
       df.format(etf);
       etfLbl.setText(Double.toString(etf));
       
       double allow=da.getAllowance();
       df.format(allow);
       allowanceLbl.setText(Double.toString(allow));
       
       double deductions=epf+lo+dm+advp;
       df.format(deductions);
       dedTxt.setText(Double.toString(deductions));
       
       double c_epf=da.getComp_epf();
       compEpfLbl.setText(Double.toString(c_epf));
       
       double gsal=bsalry+allow+otbonus;
       df.format(gsal);
       gsalTxt.setText(Double.toString(gsal));
       
       String dmg=Double.toString(dm);
       dmgLbl.setText(dmg);
       String loa=Double.toString(lo);
       loanLbl.setText(loa);
       
       String advapa=Double.toString(advp);
       advPayLbl.setText(advapa);
       
       double salary=da.calculateSalary(empposition,Integer.parseInt(empidLbl.getText().trim()), currentmonth,dm,lo,advp);
      
       //df.format(salary);
       Math.round(salary);
       nSalTxt.setText(Double.toString(salary-(lo+dm+advp)));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        basSalaryLbl = new javax.swing.JLabel();
        employerNameLbl = new javax.swing.JLabel();
        refnoLbl = new javax.swing.JLabel();
        monthLbl = new javax.swing.JLabel();
        empNameLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        empidLbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        daysattLbl = new javax.swing.JLabel();
        otdaysLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        otBonusLbl = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        etfLbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        epfLbl = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        allowanceLbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        nSalTxt = new javax.swing.JTextField();
        gsalTxt = new javax.swing.JTextField();
        dedTxt = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        compEpfLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        advPayLbl = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        loanLbl = new javax.swing.JLabel();
        dmgLbl = new javax.swing.JLabel();

        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(25, 77, 25));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee ID:");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee Name:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Reference No:");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Company Name:");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pay Month:");

        basSalaryLbl.setBackground(new java.awt.Color(255, 102, 102));
        basSalaryLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        basSalaryLbl.setForeground(new java.awt.Color(255, 255, 255));

        employerNameLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        employerNameLbl.setForeground(new java.awt.Color(255, 255, 255));

        refnoLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        refnoLbl.setForeground(new java.awt.Color(255, 255, 255));

        monthLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        monthLbl.setForeground(new java.awt.Color(255, 255, 255));

        empNameLbl.setBackground(new java.awt.Color(255, 102, 102));
        empNameLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        empNameLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Number of Days Attended:");

        empidLbl.setBackground(new java.awt.Color(255, 102, 102));
        empidLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        empidLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Basic Salary:");

        daysattLbl.setBackground(new java.awt.Color(255, 102, 102));
        daysattLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        daysattLbl.setForeground(new java.awt.Color(255, 255, 255));

        otdaysLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        otdaysLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Over Time Days:");

        otBonusLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        otBonusLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Over Time Bonus:");

        etfLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        etfLbl.setForeground(new java.awt.Color(255, 255, 255));
        etfLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("EPF:");

        jLabel13.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ETF:");

        epfLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        epfLbl.setForeground(new java.awt.Color(255, 255, 255));
        epfLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Allowance:");

        allowanceLbl.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        allowanceLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Deductions:");

        jLabel17.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Gross Salary:");

        jLabel18.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Net Salary:");

        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Home_26px.png")); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Back Arrow_26px.png")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\cwms_sherry\\project icons\\Exit_26px.png")); // NOI18N
        jButton9.setText("Exit");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Company EPF:");

        compEpfLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        compEpfLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Loan:");

        jLabel9.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Damages:");

        jLabel20.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Advance Payments:");

        advPayLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        advPayLbl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Microsoft JhengHei", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));

        loanLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        loanLbl.setForeground(new java.awt.Color(255, 255, 255));

        dmgLbl.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        dmgLbl.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton9)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel1)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel10))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(empNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(employerNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(refnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(monthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(empidLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addComponent(allowanceLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(otBonusLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(daysattLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(basSalaryLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(otdaysLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(72, 72, 72)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(60, 60, 60)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(etfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel14)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(compEpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(loanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel21)))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel9))
                                                            .addGap(48, 48, 48)
                                                            .addComponent(dmgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(147, 147, 147))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel19))
                                .addGap(72, 72, 72)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gsalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(advPayLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refnoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(employerNameLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(monthLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(empidLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(empNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(daysattLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11)
                            .addComponent(epfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(basSalaryLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etfLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(otdaysLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(otBonusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(allowanceLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel9)))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(advPayLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(gsalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(dedTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nSalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compEpfLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel21)
                            .addComponent(loanLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dmgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton9)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 876, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Main m1=new Main();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        EmployeeMain m1=new EmployeeMain();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        EmployeeMain m1=new EmployeeMain();
        m1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String cmessage = "Do you wish to exit?";
        String conf = "Exit Message";
        int confirm = JOptionPane.showConfirmDialog(null, cmessage, conf,JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else{
            this.dispose();

            EmployeeMain em=new EmployeeMain();
            em.setVisible(true);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advPayLbl;
    private javax.swing.JLabel allowanceLbl;
    private javax.swing.JLabel basSalaryLbl;
    private javax.swing.JLabel compEpfLbl;
    private javax.swing.JLabel daysattLbl;
    private javax.swing.JTextField dedTxt;
    private javax.swing.JLabel dmgLbl;
    private javax.swing.JLabel empNameLbl;
    private javax.swing.JLabel empidLbl;
    private javax.swing.JLabel employerNameLbl;
    private javax.swing.JLabel epfLbl;
    private javax.swing.JLabel etfLbl;
    private javax.swing.JTextField gsalTxt;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loanLbl;
    private javax.swing.JLabel monthLbl;
    private javax.swing.JTextField nSalTxt;
    private javax.swing.JLabel otBonusLbl;
    private javax.swing.JLabel otdaysLbl;
    private javax.swing.JLabel refnoLbl;
    // End of variables declaration//GEN-END:variables
}
