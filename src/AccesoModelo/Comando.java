
package AccesoModelo;

import Modelo.Articulo;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public interface Comando {
    
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    public void eliminarArticulo(String etiqueta, String nombre);
    
    
    public void crearExtraccion(Date date);
    
    
    public Bebida retornarBebida(String etiqueta);
}
