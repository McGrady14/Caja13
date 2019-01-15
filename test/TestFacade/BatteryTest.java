/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import AccesoModelo.Comando;
import AccesoModelo.ComandoBebida;
import AccesoModelo.Invocador;
import Administracion.GestorDeContraseñas;
import Administracion.GestorDeContraseñasParaExtracciones;
import Administracion.Observador;
import Administracion.ObservadorExistencias;
import Administracion.ProxyExtracciones;
import Administracion.Sujeto;
import Administracion.SujetoBebida;
import Creacion.FactoriaArticulos;
import Creacion.FactoriaBebida;
import Creacion.FactoriaComida;
import Creacion.Singleton;
import Creacion.TicketFactory;
import Modelo.Articulo;
import Modelo.Lineaticket;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author ernes
 */
public class BatteryTest {
    
    static Singleton instancia = Singleton.getInstancia();
    
    public static void main(String[] args) {
        
       /*System.out.println("Instanciar Factorias");
        FactoriaArticulos factB = new FactoriaBebida();
        FactoriaArticulos factC = new FactoriaComida();
        
        System.out.println("Registrar Bebidas");
        factB.crearBebida("CocaCola", new BigInteger("25"), "CocaCola", new BigDecimal("2.5"));
        factB.crearMojito("Medio litro", "Mojito medio Litro", new BigDecimal("4.5"));
        factB.crearBebida("Agua", new BigInteger("200"), "Agua", new BigDecimal("0.8"));
        
        System.out.println("Registrar Comidas");
        factC.crearBocata("Tortilla", "Bocata Tortilla", new BigDecimal("2.25"));
        factC.crearMontado("Tortilla", "Montado Tortilla", new BigDecimal("1.5"));
        factC.crearOtro("Pincho Moruno", "Pincho Moruno", new BigDecimal("3.5"));*/

        
        
        System.out.println("Instancias invocador y comand para bebidas");
        Invocador invBebida = new Invocador();
        Comando bebida = new ComandoBebida();
        
        System.out.println("Asociar invocador de bebida con comand bebida y probar una modificacion");
        invBebida.setComando(bebida);
        invBebida.ejecutaModificarArticulo("Agua", new BigInteger("250"), "Agua", new BigDecimal("0.9"));
        
        System.out.println("Eliminar cocacola");     
        invBebida.ejecutaEliminarArticulo("CocaCola", "CocaCola");
        
        
        System.out.println("Instanciar sujeto y asociar agua a ese sujeto");       
        Sujeto sujeto = new SujetoBebida();
        sujeto.setBebida(invBebida.ejecutaRetornarBebida("Agua"));
        
        System.out.println("Crear observador para el agua y notificarle");   
        Observador oExistenciasAgua = new ObservadorExistencias("Existencias Agua",10, sujeto);  
        sujeto.notificarObservadores();
        
        System.out.println("Alterar las existencias y notificar al observador");
        invBebida.ejecutaModificarArticulo("Agua", new BigInteger("9"), "Agua", new BigDecimal("0.9"));
        sujeto.notificarObservadores();
        
        System.out.println("Instaciar factori de tickets y linea de tickets para cerar tickets");
        
        
        TicketFactory facT = new TicketFactory();
        Lineaticket linea1 = new Lineaticket();
        ArrayList<Articulo> articulos = new ArrayList();
        Articulo articulo1;
        articulo1 = instancia.retornarArticulo("Agua");
        articulos.add(articulo1);
        facT.factoryTicket(1, articulos);
        
        
        
        System.out.println("Crear una fecha");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 1990);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.MONTH, 4); // Assuming you wanted May 1st
        java.sql.Date date = new java.sql.Date(calendar.getTime().getTime());
        
      
        System.out.println("Crear Proxy");
        GestorDeContraseñas proxy = new ProxyExtracciones(new GestorDeContraseñasParaExtracciones());
        System.out.println("Establecer clave");
        
        proxy.validar("sdgsg");
        System.out.println("crear extraccion");
        proxy.crearExtraccion(date);
        
        
    
    }
}
