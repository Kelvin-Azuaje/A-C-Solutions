/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author USUARIO
 */
public class TraerDepartamento {
    public String descripcion;
    
    public TraerDepartamento(){
        
    }
    
    public TraerDepartamento(String Descripcion){
        this.descripcion = Descripcion;
    }
    
    public String getDesripcion(){
        return descripcion;
    }

}
