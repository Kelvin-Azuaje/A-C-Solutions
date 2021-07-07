/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author USUARIO
 */
public class TraerUsuario {
    private String usuario;
    
    public TraerUsuario(){
        
    }
    
    public TraerUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario() {
        return usuario;
    }
}
