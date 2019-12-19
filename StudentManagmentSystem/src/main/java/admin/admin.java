/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import DataBaseConnector.sqlConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Ruwan Bandara
 */
public class admin {
    
    public boolean adminLogin(String id, String password){
            try {
                String sql = "SELECT * FROM students WHERE studentId ='"+id+"' AND password = '"+password+"'" ;
         
                sqlConnector sqlConnector1 = new sqlConnector();
                ResultSet rs = sqlConnector1.getSql(sql);
                
                return rs.next();
        } catch (Exception e) {
              return false;
        }
    }
    
    
     public int countData(){
    
        int total = 0;
        String sql = "SELECT COUNT(*) AS 'total' FROM `students`";
         try {
             sqlConnector sqlConnector1 = new sqlConnector();
             ResultSet rs = sqlConnector1.getSql(sql);
         if (rs.next()) {
             total = rs.getInt("total");
//             System.out.println(total);
return total;
         }
        return total;
         } catch (Exception e) {
             return 0;
         }
    }
     
     public int countCourse(){
         int count = 0;
         String sql = "SELECT COUNT(*) AS 'count' FROM `course`"; 
         
         try {
             sqlConnector sqlConnector1 = new sqlConnector();
             ResultSet rs = sqlConnector1.getSql(sql);
             if(rs.next()){
                 count = rs.getInt("count");
                 return count;
             }
             return count;
         } catch (Exception e) {
             return 0;
         }
     }
     public studentRegister(){
         
         
        
         
     };
     
}


