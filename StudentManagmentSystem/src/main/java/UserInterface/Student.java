

package UserInterface;

import com.sun.jndi.ldap.Connection;
import DataBaseConnector.sqlConnector;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Ruwan Bandara
 */
public class Student {
    public void insertUpdateDeleteStudent(char operation, String StudentId, String FirstName, String LastName, String Sex, String BirthDay, String PhoneNumber, String Address, String Email  ){
        
     
        sqlConnector sqlConnector1 = new sqlConnector ();
        java.sql.Connection con = sqlConnector1.connection();
        PreparedStatement ps;
        
        if (operation == 'i') {
            try {
                ps = con.prepareStatement("INSERT INTO students(StudentId, FirstName, LastName, Sex, BirthDay, PhoneNumber, Address, Email) VALUES (?,?,?,?,?,?,?,?)");
                ps.setString(1, StudentId);
                ps.setString(2, FirstName);
                ps.setString(3, LastName);
                ps.setString(4, Sex);
                ps.setString(5, BirthDay);
                ps.setString(6, PhoneNumber);
                ps.setString(7, Address);
                ps.setString(8, Email);
               // ps.setString(9, Password);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "New StudentAdded");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        
        
        
    }
    
    
}
