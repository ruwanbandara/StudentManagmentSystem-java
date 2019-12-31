
package UserInterface;

import DataBaseConnector.sqlConnector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ruwan Bandara
 */
public class Course {
    
    public void insertUpdateDeleteStudent(char operation, String CourseCode, String CourseName, String Lecture, String Hours ){
        
     
        sqlConnector sqlConnector1 = new sqlConnector ();
        Connection con = sqlConnector1.connection();
        PreparedStatement ps;
//        System.out.println("nkjn");
        
        if (operation == 'i') { // insert user 
            System.out.println("ggg");
            try {
                ps = con.prepareStatement("INSERT INTO course(CourseCode, CourseName, Lecture, Hours) VALUES (?,?,?,?)");
                ps.setString(1, CourseCode);
                ps.setString(2, CourseName);
                ps.setString(3, Lecture);
                ps.setString(4, Hours);
               
              
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New Course Add");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
        }
        
//        if (operation == 'u') {  // update user
//            //JOptionPane.showMessageDialog(null, "Can't Change Student Id");
//            
//            try {
//                ps = con.prepareStatement("UPDATE `students` SET `FirstName`= ?, `LastName`= ?, `Sex`= ?, `BirthDay`= ?, `PhoneNumber`= ?, `Address`= ?, `Email`= ?, `Password`= ? WHERE StudentId = ?");
//                
//               
//                ps.setString(1, FirstName);
//                ps.setString(2, LastName);
//                ps.setString(3, Sex);
//                ps.setString(4, BirthDay);
//                ps.setString(5, PhoneNumber);
//                ps.setString(6, Address);
//                ps.setString(7, Email);
//                ps.setString(8, Password);
//                ps.setString(9, StudentId);
//               // ps.setString(9, Password);
//                
//                if (ps.executeUpdate() > 0) {
//                    JOptionPane.showMessageDialog(null, "Update Recoard in Student");
//                    
//                }
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex);
//            }
//            
//        }
//        
//        if (operation == 'd') {  // Delete Student 
//            System.out.println("ggg");
//            try {
//                ps = con.prepareStatement("DELETE FROM `students` WHERE `StudentId` = ? ");
//                ps.setString(1, StudentId);
//               
//                
//                if (ps.executeUpdate() > 0) {
//                    JOptionPane.showMessageDialog(null, "Deleted Student");
//                    
//                }
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(null, ex);
//            }
//            
//        }
    }
        
    
}
