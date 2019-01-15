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

/**
 *
 * @author lafuente
 */
public class Facadeyabstract {
    /**
     * @param args the command line arguments
     */
    public void crearArticulos(){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Instanciar Factorias");
        FactoriaArticulos factB = new FactoriaBebida();
        FactoriaArticulos factC = new FactoriaComida();
        
        System.out.println("Registrar Bebidas");
        factB.crearBebida("CocaCola", new BigInteger("25"), "CocaCola", new BigDecimal("2.5"));
        factB.crearMojito("Medio litro", "Mojito medio Litro", new BigDecimal("4.5"));
        factB.crearBebida("Agua", new BigInteger("200"), "Agua", new BigDecimal("0.8"));
        
        System.out.println("Registrar Comidas");
        factC.crearBocata("Tortilla", "Bocata Tortilla", new BigDecimal("2.25"));
        factC.crearMontado("Tortilla", "Montado Tortilla", new BigDecimal("1.5"));
        factC.crearOtro("Pincho Moruno", "Pincho Moruno", new BigDecimal("3.5"));
        
        
        
    }
}
