
package AccesoModelo;

/**
 * Interfaz comando. Modela el comportamiento genérico de los comandos.
 *
 * 
 */
import Modelo.Articulo;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public interface Comando {
    
    /**
     * Establece la creacion de articulos
     * 
     * @param etiqueta 
     * @param existencias
     * @param nombre
     * @param precio 
     */
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    
    /**
     * Establece la modificacion de articulos
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    
    /**
     * Establece la eliminacion de articulos
     * 
     * @param etiqueta
     * @param nombre 
     */
    public void eliminarArticulo(String etiqueta, String nombre);
    
    /**
     * Establece la creacion de extracciones 
     * 
     * @param date 
     */
    public void crearExtraccion(Date date);
    
    /**
     * Devuelve una bebida
     * 
     * @param etiqueta
     * @return 
     */
    public Bebida retornarBebida(String etiqueta);
}
