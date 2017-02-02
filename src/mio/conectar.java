
package mio;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conectar {
    Connection conect = null;
    public Connection conexion()
    {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            conect = DriverManager.getConnection("jdbc:ucanaccess://C:/base/prueba1.accdb", "root","");
            JOptionPane.showMessageDialog(null,"Conectado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"Error base:"+ex);
            
        }
        
        return conect;
        
    }
}
