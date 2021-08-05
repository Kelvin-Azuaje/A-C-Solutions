/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author KELVIN
 */
public class Conex {
    private Connection conex;
    private Statement sentencia, sente;
    private ResultSet resul, result;
    private String query;
    
    public Conex(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex=DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            sentencia = conex.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public TraerUsuario getClaseTraerUsuario(){
        TraerUsuario equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerUsuario(resul.getString("N_USUARIO"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equi;
    }
    
    public TraerNumero getClaseTraerNumero(){
        TraerUsuario num = null;
        try {
            result = sente.executeQuery(query);
            if(result.next()){
                num = new TraerUsuario(result.getString("ID"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (null);
    }

    public ProductosFactura getClaseProductosFactura(){
        ProductosFactura equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new ProductosFactura(resul.getString("NOMB_PROD"),resul.getString("PRECIO"), resul.getString("IVA"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conex.class.getName()).log(Level.SEVERE, null, ex);
        }
        return equi;
    }
    
    public TraerDatosClientes getClaseTraerDatosClientes(){
        TraerDatosClientes equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerDatosClientes(resul.getString("COD_CLIENTE"),resul.getString("NOM_CLIENTE"),resul.getString("TEL_CLIENTE"),resul.getString("DIR_CLIENTE"));
            }
        } catch (SQLException e) {
        }
        return equi;
    }
    
    public TraerDatosEmpresa getClaseTraerDatosEmpresa(){
        TraerDatosEmpresa equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerDatosEmpresa(resul.getString("RIF_EMPRESA"), resul.getString("NOM_EMPRESA"), resul.getString("DIR_EMPRESA"), resul.getString("TEL_EMPRESA"));
            }
        } catch (Exception e) {
        }
        return equi;
    }
    
    public TraerTasa getClaseTasa(){
        TraerTasa equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerTasa(resul.getString("COD_MONEDA"), resul.getString("TASA_ACTUAL"));
            }
        } catch (Exception e) {
        }
        return equi;
    }  
    
    public TraerDepartamento getClaseTraerDepartamento(){
        TraerDepartamento equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerDepartamento(resul.getString("NOM_DEPARTAMENTO"));
            }
        } catch (Exception e) {
        }
        return equi;
    }
    
    public TraerGrupos getClaseTraerGrupo(){
        TraerGrupos equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerGrupos(resul.getString("NOM_GRUPO"));
            }
        } catch (Exception e) {
        }
        return equi;
    }
    
    public TraerSubGrupo getClaseTraerSubGrupo(){
        TraerSubGrupo equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerSubGrupo(resul.getString("NOM_SG"));
            }
        } catch (Exception e) {
        }
        return equi;
    }
    
    public TraerBancos getClaseTraerBancos(){
        TraerBancos equi = null;
        try {
            resul = sentencia.executeQuery(query);
            if(resul.next()){
                equi = new TraerBancos(resul.getString("DESCRIPCION"));
            }
        } catch (Exception e) {
        }
        return equi;
    }
    
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }
    
    
}