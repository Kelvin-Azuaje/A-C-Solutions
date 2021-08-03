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

    
//**************************************Metodo para conectar con la Bd***************************************************
    public Conexion_LLenarCombo() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,login,pass);
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {
            Logger.getLogger(Conexion_LLenarCombo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//********************************************************************************************************************************
//********************************************************************************************************************************    
//*************************Metodo para realizar la consulta en base a un ResultSet***********************************
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
//********************************************************************************************************************************
//********************************************************************************************************************************    
//******************************Metodo para obtener los datos de cada caja*********************************************
    public DefaultComboBoxModel Obt_Datos_Caja(){
        DefaultComboBoxModel ListaCaja = new DefaultComboBoxModel();
        ListaCaja.addElement("Seleccionar");
        ResultSet res = this.consul("SELECT * FROM cr_caja ORDER BY ID_CAJA");
        
        try {
            while(res.next()){
                ListaCaja.addElement(res.getString("ID_CAJA"));
            } res.close();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } return ListaCaja;
    }
//********************************************************************************************************************************
//********************************************************************************************************************************    
//**************************Metodo para obtener los datos de los Departamentos**************************************
    public DefaultComboBoxModel Obt_Datos_Departamentos(){
        DefaultComboBoxModel ListaDep = new DefaultComboBoxModel();
        ListaDep.addElement("Seleccionar");
        ResultSet res = this.consul("SELECT * FROM departamento ORDER BY COD_DEPARTAMENTO");
        
        try {
            while(res.next()){
                ListaDep.addElement(res.getString("COD_DEPARTAMENTO"));
            } res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } return ListaDep;
    }
//**********************************************************************************************************************************
//**********************************************************************************************************************************    
//************************************Metodo para obtener datos de Grupos************************************************    
    public DefaultComboBoxModel Obt_Datos_Grupos(){
        DefaultComboBoxModel ListaGrup = new DefaultComboBoxModel();
        ResultSet res = this.consul("SELECT * FROM grupos ORDER BY COD_GRUPO");
        
        try {
            while(res.next()){
                ListaGrup.addElement(res.getString("COD_GRUPO"));
            } res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } return ListaGrup;
    }
//********************************************************************************************************************************* 
//**********************************************************************************************************************************    
//**********************************Metodo para obtener datos de  SubGrupos*********************************************    
    public DefaultComboBoxModel Obt_Datos_SubGrupos(){
        DefaultComboBoxModel ListaSubGrup = new DefaultComboBoxModel();
        ResultSet res = this.consul("SELECT * FROM subgrupos ORDER BY COD_SG");
        
        try {
            while(res.next()){
                ListaSubGrup.addElement(res.getString("COD_SG"));
            } res.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } return ListaSubGrup;
    }
//*********************************************************************************************************************************     
}
