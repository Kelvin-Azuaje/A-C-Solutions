/*
*
*   Clase Fecha
*
*    Esta clase guarda el metodo en cual se le coloca la fecha del equipo al 
*    sistema, y de la cual se puede llamar desde cualquier interfaz del mismo
*    solo haciendo el uso correcto de la declaracion del metodo
*
*/
package Clases;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Fecha {
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-YYYY");
        return formatofecha.format(fecha);
    }
}
