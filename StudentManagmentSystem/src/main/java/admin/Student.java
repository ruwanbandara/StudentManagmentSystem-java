

package admin;

//import com.sun.jndi.ldap.Connection;
import DataBaseConnector.sqlConnector;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import sun.security.util.Password;
/**
 *
 * @author Ruwan Bandara
 */
public class Student {
    public void insertUpdateDeleteStudent(char operation, String StudentId, String FirstName, String LastName, String Sex, String BirthDay, String PhoneNumber, String Address, String Email, String Password  ){
        
     
        sqlConnector sqlConnector1 = new sqlConnector ();
        Connection con = sqlConnector1.connection();
        PreparedStatement ps;
//        System.out.println("nkjn");
        
        if (operation == 'i') {
            System.out.println("ggg");
            try {
                ps = con.prepareStatement("INSERT INTO students(StudentId, FirstName, LastName, Sex, BirthDay, PhoneNumber, Address, Email, Password) VALUES (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, StudentId);
                ps.setString(2, FirstName);
                ps.setString(3, LastName);
                ps.setString(4, Sex);
                ps.setString(5, BirthDay);
                ps.setString(6, PhoneNumber);
                ps.setString(7, Address);
                ps.setString(8, Email);
                ps.setString(9, Password);
               // ps.setString(9, Password);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New StudentAdded");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
        }
        
        
        
        
        
    }
}
//    public class Student{
//    void insertUpdateDeleteStudent(char operation, Object object, String StdentId, String FirstName, String LastName, String Sex, String BirthDay, String PhoneNumber, String Address, String Email) {
//       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        
//        
//        sqlConnector sqlConnector1 = new sqlConnector ();
//        Connection con = sqlConnector1.connection();
//        PreparedStatement ps;
//        
//        if (operation == 'i') {
//            try {
//                ps = con.prepareStatement("INSERT INTO students(StudentId, FirstName, LastName, Sex, BirthDay, PhoneNumber, Address, Email) VALUES (?,?,?,?,?,?,?,?)");
//                ps.setString(1, StudentId);
//                ps.setString(2, FirstName);
//                ps.setString(3, LastName);
//                ps.setString(4, Sex);
//                ps.setString(5, BirthDay);
//                ps.setString(6, PhoneNumber);
//                ps.setString(7, Address);
//                ps.setString(8, Email);
//               // ps.setString(9, Password);
//                
//                if (ps.executeUpdate() > 0) {
//                    JOptionPane.showMessageDialog(null, "New StudentAdded");
//                    
//                }
//                
//            } catch (SQLException ex) {
//                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            
//        }
//    }
//    
//    
//}
