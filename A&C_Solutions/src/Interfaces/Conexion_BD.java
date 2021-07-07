
package Interfaces;

/*
    Esta es la clase Conexion_BD la cual se encarga de conectarse
    con la base de datos SQL que se creo para el sistema
    por medio de esta y las funciones creadas esta clase es la encargada de GUARDAR informacion
    se creo el metodo de manera tal que solo sea necesario hacer conexion con
    las demas interfaces y no copiar el metodo en cada una
*/

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion_BD {
    static Connection conexion;
    static Statement estatuto;
    static ResultSet resultado;
    
    String nombreBD, usuarioBD, contraseñaBD;
    
    public Conexion_BD(){
        nombreBD = "test";
        usuarioBD = "root";
        contraseñaBD = "";
    }
    
    //Metodo constructor para realizar la conexion con la base de datos
    public void conectar(){
        try {
            //1. Cargar los Controladores
            Class.forName("com.mysql.jdbc.Driver");
            //2. Establecer la Conexion
            conexion = DriverManager.getConnection
                    ("jdbc:mysql://localhost/"+nombreBD,""+usuarioBD ,""+contraseñaBD);
        } catch (ClassNotFoundException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "CONTROLADORES NO CARGADOS",
                    "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            System.err.println(ex);
            JOptionPane.showMessageDialog(null, "ERROR DEL SERVIDOR\n"+ex,
                    "MENSAJE DE ERROR", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Conexion_BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    * funcion para guardar los datos en la base de datos
    *
    */
    public void guardar(String nombreTabla, String valores){
        try{
            estatuto = conexion.createStatement();
            String sql = "INSERT INTO "+nombreTabla+" VALUES("+valores+")";
            System.out.println(sql);
            estatuto.executeUpdate(sql);
            JOptionPane.showMessageDialog(null , "Datos Guardados con exito..!");
            
            estatuto.close();
        }catch(SQLException e){
            System.err.println(e);
        }catch(HeadlessException e){
            JOptionPane.showMessageDialog(null, "Los datos no se puede guardar, existe un dato ya guardado");
        }
    }
    
}    
