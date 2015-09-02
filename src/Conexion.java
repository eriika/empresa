import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Erika Navarro Delgado
 */
public class Conexion {

    Connection connect = null;


    public Connection conexion() {
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                connect =  DriverManager.getConnection("jdbc:mysql://localhost/cnn", "root", "");
            } 
            
            catch (Exception e){
                JOptionPane.showMessageDialog(null,"Error" + e);
            }
        return connect;
    }
}

    