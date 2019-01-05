
package AccesoModelo;

import java.math.BigDecimal;
import java.math.BigInteger;


public class Invocador {
    
    private Comando comando;

    public Invocador() {

    }

    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
    public void ejecutaCrearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        comando.crearArticulo(etiqueta,  existencias, nombre, precio);
    }
    public void ejecutaModificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        comando.modificarArticulo( etiqueta, existencias,nombre, precio);
    }
    public void ejecutaEliminarArticulo(String etiqueta, String nombre) {
        comando.eliminarArticulo(etiqueta, nombre);
    }
}
