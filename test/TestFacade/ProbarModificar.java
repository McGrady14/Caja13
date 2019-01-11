/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import Creacion.FactoriaArticulos;
import Creacion.FactoriaBebida;
import Creacion.FactoriaComida;
import java.math.BigDecimal;
import java.math.BigInteger;
import AccesoModelo.*;

/**
 *
 * @author lafuente
 */
public class ProbarModificar {
    public static void main(String[] args) {
        // TODO code application logic here
        FactoriaArticulos factB = new FactoriaBebida();
        FactoriaArticulos factC = new FactoriaComida();
        factB.crearBebida("Agua", new BigInteger("200"), "Agua", new BigDecimal("0.8"));
        Invocador inv = new Invocador();
        Comando bebida = new ComandoBebida();
        inv.setComando(bebida);
        inv.ejecutaModificarArticulo("Agua", new BigInteger("250"), "Agua", new BigDecimal("0.9"));
            
    }
}
