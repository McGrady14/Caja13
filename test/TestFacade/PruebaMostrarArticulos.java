/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import AccesoModelo.Comando;
import AccesoModelo.ComandoBebida;
import AccesoModelo.Invocador;
import Creacion.FactoriaArticulos;
import Creacion.FactoriaBebida;
import Creacion.FactoriaComida;
import Creacion.Singleton;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ernes
 */
public class PruebaMostrarArticulos {
 public static void main(String[] args) {
    
    
        System.out.println("Instanciar Factorias");
        FactoriaArticulos factB = new FactoriaBebida();
        FactoriaArticulos factC = new FactoriaComida();
        
        System.out.println("Registrar Bebidas");
        factB.crearBebida("Refresco", new BigInteger("25"), "Refresco", new BigDecimal("2.5"));
        factB.crearBebida("Agua2", new BigInteger("200"), "Agua2", new BigDecimal("0.8"));
        
        factB.crearBebida("Agua3", new BigInteger("200"), "Agua3", new BigDecimal("0.8"));
        factB.crearBebida("Agua4", new BigInteger("200"), "Agua4", new BigDecimal("0.8"));
        factB.crearBebida("Agua5", new BigInteger("200"), "Agua5", new BigDecimal("0.8"));
        factB.crearBebida("Agua6", new BigInteger("200"), "Agua6", new BigDecimal("0.8"));
factB.crearBebida("Agua7", new BigInteger("200"), "Agua7", new BigDecimal("0.8"));
        factB.crearBebida("Agua8", new BigInteger("200"), "Agua8", new BigDecimal("0.8"));
        factB.crearBebida("Agua8", new BigInteger("200"), "Agua8", new BigDecimal("0.8"));
        factB.crearBebida("Agua8", new BigInteger("200"), "Agua8", new BigDecimal("0.8"));
        factB.crearBebida("Agua9", new BigInteger("200"), "Agua9", new BigDecimal("0.8"));
        factB.crearBebida("Agua10", new BigInteger("200"), "Agua10", new BigDecimal("0.8"));
        factB.crearBebida("Agua11", new BigInteger("200"), "Agua11", new BigDecimal("0.8"));
        factB.crearBebida("Agua13", new BigInteger("200"), "Agua12", new BigDecimal("0.8"));
        
        
        
        factB.crearMojito("Medio litro", "Mojito medio Litro", new BigDecimal("4.5"));
        
        
        System.out.println("Registrar Comidas");
        factC.crearBocata("Tortilla", "Bocata Tortilla", new BigDecimal("2.25"));
        factC.crearMontado("Tortilla", "Montado Tortilla", new BigDecimal("1.5"));
        factC.crearOtro("Pincho Moruno", "Pincho Moruno", new BigDecimal("3.5"));
        

        
    Singleton singleton = Singleton.getInstancia();
        
        
     List<Bebida> List = singleton.getBebidas();

     for (Bebida B : List) {
         B.toString();
         System.out.println(B.getEtiqueta());   
         System.out.println(List.indexOf(B));
         
     }
        
        
    
 }
}
