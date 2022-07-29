package Principal;
import Vistas.*;
import Modelo.*;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {
        //1. Creamos la instancia de la vista login
        Login login = new Login();
        //El método setVisible hace visible la ventana
        login.setVisible(true);
        Conexion conexion = new Conexion();
        conexion.getConnection();
        
    }
    
}
