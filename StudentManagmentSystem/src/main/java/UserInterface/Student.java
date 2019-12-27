

package UserInterface;

//import com.sun.jndi.ldap.Connection;
import DataBaseConnector.sqlConnector;
import Function.MyFunction;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
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
        
        if (operation == 'i') { // insert user 
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
        
        if (operation == 'u') {  // update user
            System.out.println("ggg");
            try {
                ps = con.prepareStatement("UPDATE `students` SET `FirstName`= ?, `LastName`= ?, `Sex`= ?, `BirthDay`= ?, `PhoneNumber`= ?, `Address`= ?, `Email`= ?, `Password`= ? WHERE StudentId = ?");
                
               
                ps.setString(1, FirstName);
                ps.setString(2, LastName);
                ps.setString(3, Sex);
                ps.setString(4, BirthDay);
                ps.setString(5, PhoneNumber);
                ps.setString(6, Address);
                ps.setString(7, Email);
                ps.setString(8, Password);
                 ps.setString(9, StudentId);
               // ps.setString(9, Password);
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Update Recoard in Student");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
        }
        
        if (operation == 'd') {  // Delete Student 
            System.out.println("ggg");
            try {
                ps = con.prepareStatement("DELETE FROM `students` WHERE `StudentId` = ? ");
                ps.setString(1, StudentId);
               
                
                if (ps.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(null, "Deleted Student");
                    
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
            
        }
        
    }
        
        
     public void fillStudentJtable(JTable table, String valueToSearch)
        {
       sqlConnector sqlConnector1 = new sqlConnector ();
        Connection con = sqlConnector1.connection();
        PreparedStatement ps;
        try {
            ps = con.prepareStatement("SELECT * FROM `students` WHERE CONCAT (`StudentId`,`FirstName`, `LastName`,`Sex`, `BirthDay`, `PhoneNumber`, `Address`, `Email`)LIKE ?");
            ps.setString(1, "%"+valueToSearch+"%");
            
            ResultSet rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while (rs.next()) {
                row = new Object[8];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                
                
                model.addRow(row);
                
                
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
        
    
        
        
    
    
  

