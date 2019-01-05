
package AccesoModelo;

import java.math.BigDecimal;
import java.math.BigInteger;


public interface Comando {
    
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    public void modificarArticulo();
    public void eliminarArticulo();
    
}
