/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;
import DataBaseConnector.sqlConnector;
import admin.admin;
import admin.StudentProfileClass;


/**
 *
 * @author Ruwan Bandara
 */
public class studentLogin extends javax.swing.JFrame {

    /**
     * Creates new form studentLogin
     */
    public studentLogin() {
        super("studentLogin");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLStudentId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ui_StudentId = new javax.swing.JTextField();
        ui_Password = new javax.swing.JPasswordField();
        ui_Login = new javax.swing.JButton();
        ui_Cancel = new javax.swing.JButton();
        ui_u = new javax.swing.JLabel();
        ui_p = new javax.swing.JLabel();
        jLStudentId1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField_StudentId2 = new javax.swing.JTextField();
        jPasswordFieldStudent1 = new javax.swing.JPasswordField();
        ui_Cancel1 = new javax.swing.JButton();
        jButtonStudentLogin = new javax.swing.JButton();
        ui_u1 = new javax.swing.JLabel();
        ui_p1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(117, 125, 232));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLStudentId.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLStudentId.setText("Admin Id   : ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Password  :");

        ui_StudentId.setBackground(new java.awt.Color(170, 182, 254));
        ui_StudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ui_StudentIdActionPerformed(evt);
            }
        });

        ui_Password.setBackground(new java.awt.Color(170, 182, 254));

        ui_Login.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ui_Login.setText("Admin Login");
        ui_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ui_LoginActionPerformed(evt);
            }
        });

        ui_Cancel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ui_Cancel.setText("Cancel");
        ui_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ui_CancelActionPerformed(evt);
            }
        });

        ui_u.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ui_u.setForeground(new java.awt.Color(255, 0, 0));
        ui_u.setText("*");

        ui_p.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ui_p.setForeground(new java.awt.Color(255, 0, 0));
        ui_p.setText("*");

        jLStudentId1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLStudentId1.setText("Student  Id  : ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Password    :");

        jTextField_StudentId2.setBackground(new java.awt.Color(170, 182, 254));
        jTextField_StudentId2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_StudentId2ActionPerformed(evt);
            }
        });

        jPasswordFieldStudent1.setBackground(new java.awt.Color(170, 182, 254));

        ui_Cancel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ui_Cancel1.setText("Cancel");
        ui_Cancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ui_Cancel1ActionPerformed(evt);
            }
        });

        jButtonStudentLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jButtonStudentLogin.setText("Student Login");
        jButtonStudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStudentLoginActionPerformed(evt);
            }
        });

        ui_u1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ui_u1.setForeground(new java.awt.Color(255, 0, 0));
        ui_u1.setText("*");

        ui_p1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ui_p1.setForeground(new java.awt.Color(255, 0, 0));
        ui_p1.setText("*");

        jPanel1.setBackground(new java.awt.Color(63, 81, 181));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Login Form");

        jPanel3.setBackground(new java.awt.Color(0, 41, 132));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1291, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLStudentId)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ui_StudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                            .addComponent(ui_Password))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ui_u)
                                            .addComponent(ui_p)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(ui_Login)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLStudentId1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_StudentId2)
                                    .addComponent(jPasswordFieldStudent1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ui_u1)
                                    .addComponent(ui_p1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(231, 231, 231)
                                .addComponent(ui_Cancel)
                                .addGap(75, 75, 75)
                                .addComponent(jButtonStudentLogin))))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(ui_Cancel1)
                    .addContainerGap(1161, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLStudentId)
                            .addComponent(ui_StudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ui_u)
                            .addComponent(jLStudentId1)
                            .addComponent(jTextField_StudentId2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(ui_u1)))
                .addGap(82, 82, 82)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jPasswordFieldStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ui_p1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ui_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(ui_p)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ui_Login)
                    .addComponent(ui_Cancel)
                    .addComponent(jButtonStudentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(513, Short.MAX_VALUE)
                    .addComponent(ui_Cancel1)
                    .addGap(168, 168, 168)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1294, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1312, 765));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ui_StudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ui_StudentIdActionPerformed

    }//GEN-LAST:event_ui_StudentIdActionPerformed

    private void ui_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ui_LoginActionPerformed
       
        
        ui_u.setVisible(false);
        ui_p.setVisible(false);

        if(ui_StudentId.getText().equals(""))
        {
            ui_u.setVisible(true);
        }if(String.valueOf(ui_Password.getPassword()).equals(""))
        {
            ui_p.setVisible(true);
        }
        else{
//            Connection con = dbConnector.getConnection();
//            PreparedStatement ps;

//            try {
         
                
                String id = ui_StudentId.getText();
                String password = String.valueOf(ui_Password.getPassword());
                
                admin admin = new admin();
                boolean test= admin.adminLogin(id, password);
                
                if (test) {
                                        
                     setVisible(false);
                    int total = admin.countData();
                    System.out.println(total);
                    
                     home Home = new home();
                     Home.setVisible(true);
                     Home.pack();
                     Home.setLocationRelativeTo(null);
                     Home.setExtendedState(JFrame.MAXIMIZED_BOTH);
                     home.jLWelcome.setText("Welcome "+ui_StudentId.getText()+"");
                     
                     // This get Student count in table
                     home.jLStudentCount.setText("Student Count = "+Integer.toString(admin.countData()));
                    
                     //this get Coure count in tabele 
                     home.jLCourseCount.setText("Course Count = "+Integer.toString(admin.countCourse()));

                     
                     this.dispose();
                     
                    
                }else {
                    System.out.println("wrong");
                }
                
                
               
                

//                
//
//                if(rs.next()){
//                    

//                }else{
//                    System.out.println("NO");
//                }
//
//            } catch (SQLException ex) {
////                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//                    JOptionPane.showMessageDialog(null, ex);
//            }

        }

    }//GEN-LAST:event_ui_LoginActionPerformed

    private void ui_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ui_CancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ui_CancelActionPerformed

    private void ui_Cancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ui_Cancel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ui_Cancel1ActionPerformed

    private void jTextField_StudentId2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_StudentId2ActionPerformed
       
        
        
    }//GEN-LAST:event_jTextField_StudentId2ActionPerformed

    private void jButtonStudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStudentLoginActionPerformed
        ui_u1.setVisible(false);
        ui_p1.setVisible(false);
         System.out.println("jjjj");

        if(jTextField_StudentId2.getText().equals(""))
        {
            ui_u1.setVisible(true);
        }if(String.valueOf(jPasswordFieldStudent1.getPassword()).equals(""))
        {
            ui_p1.setVisible(true);
        }
        else{
                
             
//            Connection con = dbConnector.getConnection();
//            PreparedStatement ps;

//            try {
         
                
                String id = jTextField_StudentId2.getText();
                String password = String.valueOf(jPasswordFieldStudent1.getPassword());
                
                StudentProfileClass ob = new StudentProfileClass();
                boolean test = ob.StudentLogin(id, password);
                
                if (test) {
                                        
                    setVisible(false);
//                    int total = admin.countData();
//                    System.out.println(total);
                    
                     StudentProfile profile = new StudentProfile();
                     profile.setVisible(true);
                     profile.pack();
                     profile.setLocationRelativeTo(null);
                     profile.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    // profile.jLWelcome.setText("Welcome <"+ui_StudentId.getText()+">");
                     
//                     // This get Student count in table
//                     home.jLStudentCount.setText("Student Count = "+Integer.toString(admin.countData()));
//                    
//                     //this get Coure count in tabele 
//                     home.jLCourseCount.setText("Course Count = "+Integer.toString(admin.countCourse()));

                     
                     this.dispose();
                     
                    
                }else {
                    System.out.println("wrong");
                }
                
                
               
                

//                
//
//                if(rs.next()){
//                    

//                }else{
//                    System.out.println("NO");
//                }
//
//            } catch (SQLException ex) {
////                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//                    JOptionPane.showMessageDialog(null, ex);
//            }

        }

    }//GEN-LAST:event_jButtonStudentLoginActionPerformed

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
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonStudentLogin;
    private javax.swing.JLabel jLStudentId;
    private javax.swing.JLabel jLStudentId1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldStudent1;
    private javax.swing.JTextField jTextField_StudentId2;
    private javax.swing.JButton ui_Cancel;
    private javax.swing.JButton ui_Cancel1;
    private javax.swing.JButton ui_Login;
    private javax.swing.JPasswordField ui_Password;
    private javax.swing.JTextField ui_StudentId;
    private javax.swing.JLabel ui_p;
    private javax.swing.JLabel ui_p1;
    private javax.swing.JLabel ui_u;
    private javax.swing.JLabel ui_u1;
    // End of variables declaration//GEN-END:variables
}
