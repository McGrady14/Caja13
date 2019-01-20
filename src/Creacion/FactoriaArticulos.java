
package Creacion;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Factoría abstracta para crear distintos tipos de objetos.
 */
public interface FactoriaArticulos {
    
    /**
     * Crea un objeto de tipo bebida
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    
    /**
     * Crea un objeto de tipo Mojito
     * @param etiqueta
     * @param nombre
     * @param precio 
     */
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio);
    /**
     * Crea un objeto de tipo Montado
     * @param etiqueta
     * @param nombre
     * @param precio 
     */
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio);
    
    /**
     * Crea un objeto de tipo Bocata
     * @param etiqueta
     * @param nombre
     * @param precio 
     */
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio);
    
    /**
     * Crea un objeto de tipo Otro
     * @param etiqueta
     * @param nombre
     * @param precio 
     */
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio);
    
    /**
     * Crea un objeto de tipo Extraccion
     * @param etiqueta
     * @param nombre
     * @param precio 
     */
    public void crearExtraccion(Date date);
    
}
