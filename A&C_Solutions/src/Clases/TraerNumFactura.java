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
public class TraerNumFactura {
    private String cod_factura;
    
    public TraerNumFactura(){
        
    }
    
    public TraerNumFactura(String cod_factura){
        this.cod_factura = cod_factura;
    }
    
    public String getCod_Factura() {
        return cod_factura;
    }
}
