
package Clases;

/**
 *
 * @author Azuaje
 */
public class TraerDatosEmpresa {
    private String rif, nombre, telefono, direccion;
    
    public TraerDatosEmpresa(){
        
    }
    
    public TraerDatosEmpresa(String Rif, String Nombre, String Telefono, String Direccion){
        this.rif = Rif;
        this.nombre = Nombre;
        this.direccion = Direccion;
        this.telefono = Telefono;
    }
    
    public String getRif(){
        return rif;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
}
