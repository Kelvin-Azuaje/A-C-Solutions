/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author USUARIO
 */
public class Conexion_LLenarCombo {
    public String bd = "test";
    public String login = "root";
    public String pass = "";
    public String url = "jdbc:mysql://localhost/"+ bd;
    Connection con = null;

    public Conexion_LLenarCombo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,login,pass);
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_LLenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet consul(String sql){
        ResultSet res = null;
        try {
            PreparedStatement pst =  (PreparedStatement) con.prepareStatement(sql);
            res = pst.executeQuery();
        } catch (SQLException e) {
            System.err.println("Error en consulta: " + e.getMessage());
        }
        return res;
    }
    
    //Metodo para obtener los datos 
    public DefaultComboBoxModel Obt_Datos(){
        DefaultComboBoxModel ListaPrueba = new DefaultComboBoxModel();
        ListaPrueba.addElement("Seleccionar");
        ResultSet res = this.consul("SELECT * FROM cr_caja ORDER BY ID_CAJA");
        
        try {
            while(res.next()){
                ListaPrueba.addElement(res.getString("ID_CAJA"));
            } res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
        return ListaPrueba;
    }
}
