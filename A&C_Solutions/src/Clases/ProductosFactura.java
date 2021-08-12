/*
 * @author SADVEN 2021
 *
 * Clase creada para especificar cuales datos se van a ingresar en la Factura
 * apartir de los datos obtenidos de la BD
 *
 */
package Clases;


public class ProductosFactura {
    private String Nombre, Precio, IVA;
    
    public ProductosFactura(){
        
    }
    
    public ProductosFactura(String Nombre, String Precio, String IVA){
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.IVA = IVA;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public String getPrecio() {
        return Precio;
    }
    
    public String getIva(){
        return IVA;
    }
}
