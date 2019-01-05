
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
    public void ejecutaModificarArticulo() {
        comando.modificarArticulo();
    }
    public void ejecutaEliminarArticulo() {
        comando.eliminarArticulo();
    }
}
