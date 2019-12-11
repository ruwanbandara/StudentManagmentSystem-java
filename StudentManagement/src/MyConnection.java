
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Ruwan Bandara
 */
public class MyConnection {
    
    public static Connection getConnection()
    {
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        return con;
    }
    
}
