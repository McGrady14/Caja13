
package AccesoModelo;

/**
 * El que llama al método ejecutar del objeto Comando.
 *
 * 
 */

import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class Invocador {
    
    //Comando al que le pediremos que ejecute la petición.
    private Comando comando;

    public Invocador() {

    }
    
    /**
     * Establece el comando.
     * 
     * @param comando 
     */
    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
    /**
     * Ejecuta el comando.
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    public void ejecutaCrearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        comando.crearArticulo(etiqueta,  existencias, nombre, precio);
    }
    
    /**
     * Rehace el comando.
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    public void ejecutaModificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        comando.modificarArticulo( etiqueta, existencias,nombre, precio);
    }
    
    /**
     * Deshace el comando.
     * 
     * @param etiqueta
     * @param nombre 
     */
    public void ejecutaEliminarArticulo(String etiqueta, String nombre) {
        comando.eliminarArticulo(etiqueta, nombre);
    }
    
    /**
     * Ejecuta el comando.
     * 
     * @param date 
     */
    public void ejecutaCrearExtraccion(Date date) {
        comando.crearExtraccion(date);
    }
    
    /**
     * Ejecuta el comando.
     * 
     * @param etiqueta
     * @return 
     */
    public Bebida ejecutaRetornarBebida(String etiqueta) {
        return comando.retornarBebida(etiqueta);
    }
    
    
    
}
