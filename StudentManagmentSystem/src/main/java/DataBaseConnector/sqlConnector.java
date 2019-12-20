/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBaseConnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan Bandara
 */
public class sqlConnector implements Connector {
    
    public sqlConnector(){
        connect();
    }
    
    private Connection con;
    private PreparedStatement ps;
    
    
       @Override
    public void connect() {
            
        
          final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
           final String DB_URL = "jdbc:mysql://localhost:3306/studentmanagmentsystemuniversity?serverTimezone=" + TimeZone.getDefault().getID();
   
             final String USER = "root";
            final String PASS ="";
            
             try {
                     Class.forName(JDBC_DRIVER);
                   con = DriverManager.getConnection(DB_URL,USER,PASS);
                   

         
                   
          } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);  
           
        }
        
    }
    


    @Override
    public ResultSet getSql(String sql) {
         try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            return rs;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
          
    }
    
    @Override
    public Connection connection() {
           final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
           final String DB_URL = "jdbc:mysql://localhost:3306/studentmanagmentsystemuniversity?serverTimezone=" + TimeZone.getDefault().getID();
   
             final String USER = "root";
            final String PASS ="";
            
             try {
                     Class.forName(JDBC_DRIVER);
                   con = DriverManager.getConnection(DB_URL,USER,PASS);
                   return con;
                   

         
                   
          } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null, e);  
             return null;
           
        }
    }

 
    
}
