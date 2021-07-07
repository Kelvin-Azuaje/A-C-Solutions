
package Interfaces;

/**
 *
 * @author USUARIO
 */
public class TraerDatosClientes {
    private String codigo, nombre, telefono, direccion;
    
    public TraerDatosClientes(){
        
    }
    
    public TraerDatosClientes(String codigo, String nombre, String telefono, String direccion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public String getCodigo(){
        return codigo;
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
