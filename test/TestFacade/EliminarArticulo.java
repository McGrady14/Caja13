
package TestFacade;

import AccesoModelo.Comando;
import AccesoModelo.ComandoBebida;
import AccesoModelo.Invocador;
import Creacion.FactoriaArticulos;
import Creacion.FactoriaBebida;
import Creacion.FactoriaComida;
import java.math.BigDecimal;
import java.math.BigInteger;


public class EliminarArticulo {
    public static void main(String[] args) {
        // TODO code application logic here
        Invocador inv = new Invocador();
        Comando bebida = new ComandoBebida();
        inv.setComando(bebida);
        inv.ejecutaEliminarArticulo("Agua", "Agua");
        
        
        
    }
}
