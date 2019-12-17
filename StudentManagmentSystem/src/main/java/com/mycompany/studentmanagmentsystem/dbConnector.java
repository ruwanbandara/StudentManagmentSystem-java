/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentmanagmentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan Bandara
 */
public class dbConnector {
        final static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost:3306/studentmanagmentsystemuniversity?serverTimezone=" + TimeZone.getDefault().getID();
   
    final static String USER = "root";
    final static String PASS ="";
   
    public static Connection connection() {
        try {
            Class.forName(JDBC_DRIVER);
                    Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
                    return conn;
        } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);  
             return null;
        }
       
    }
    
}
