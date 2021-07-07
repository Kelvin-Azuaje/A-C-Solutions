
package Interfaces;

/*
    Esta es la clase Conexion la cual se encarga de conectarse
    con la base de datos SQL que se creo para el sistema
    y leer los datos almacenados en la misma
    se creo el metodo de manera tal que solo sea necesario hacer conexion con
    las demas interfaces y no copiar el metodo en cada una
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    Connection conectar=null;
    public Connection enlazar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;
    }
}
