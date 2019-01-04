/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Creacion.*;
import java.math.BigInteger;

/**
 *
 * @author lafuente
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FactoriaArticulos factB = new FactoriaBebida();
        FactoriaArticulos factC = new FactoriaComida();
        factB.crearBebida("CocaCola", new BigInteger("25"), "CocaCola", new BigInteger("2"));
        factB.crearMojito("Medio litro", "Mojito medio Litro", new BigInteger("4"));
        factC.crearBocata("Tortilla", "Bocata Tortilla", new BigInteger("2"));
        factC.crearMontado("Tortilla", "Montado Tortilla", new BigInteger("1"));
        factC.crearOtro("Pincho Moruno", "Pincho Moruno", new BigInteger("3"));
        
        
        
    }
    
}
