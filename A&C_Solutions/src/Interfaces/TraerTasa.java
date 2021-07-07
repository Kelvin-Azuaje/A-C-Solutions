/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Azuaje
 */
public class TraerTasa {
    private String id, tasaAnter;
    
    public TraerTasa(){
        
    }
    
    public TraerTasa(String ID, String TasaAnter){
        this.id = ID;
        this.tasaAnter = TasaAnter;
    }
    
    public String getID(){
        return id;
    }
    public String getTasaAnter(){
        return tasaAnter;
    }
}
