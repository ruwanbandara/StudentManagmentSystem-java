/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import DataBaseConnector.sqlConnector;
import java.sql.ResultSet;

/**
 *
 * @author Ruwan Bandara
 */
public class StudentProfile {
    
     public boolean StudentLogin(String StudentId, String Password){
            try {
                String sql = "SELECT * FROM students WHERE StudentId ='"+StudentId+"' AND Password = '"+Password+"'" ;
         
                sqlConnector sqlConnector1 = new sqlConnector();
                ResultSet rs = sqlConnector1.getSql(sql);
                
                return rs.next();
        } catch (Exception e) {
              return false;
        }
    }
    
}
