
package Interfaces;

/**
 *
 * @author Azuaje
 */
public class TraerBancos {
    private String descripcion;
    
    public TraerBancos(){
        
    }
    
    public TraerBancos(String Descripcion){
        this.descripcion = Descripcion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
   
}
