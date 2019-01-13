/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import AccesoModelo.Comando;
import AccesoModelo.ComandoBebida;
import AccesoModelo.Invocador;
import Administracion.Observador;
import Administracion.ObservadorExistencias;
import Administracion.Sujeto;
import Administracion.SujetoBebida;
import Creacion.FactoriaArticulos;
import Creacion.FactoriaBebida;
import Creacion.FactoriaComida;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author ernes
 */
public class ObservadorEnAccion {
        public static void main(String[] args) {
        // TODO code application logic here
        FactoriaArticulos factB = new FactoriaBebida();
        factB.crearBebida("Agua", new BigInteger("200"), "Agua", new BigDecimal("0.8"));
        Invocador inv = new Invocador();
        Comando bebida = new ComandoBebida();
        inv.setComando(bebida);       
        System.out.println("Establecido");
        Sujeto sujeto = new SujetoBebida();

        sujeto.setBebida(inv.ejecutaRetornarBebida("Agua"));
        
        Observador o1 = new ObservadorExistencias("Existencias Observer",10, sujeto);       
        sujeto.notificarObservadores(); 
        
        System.out.println("Modificamos las existencias del agua"); 
        inv.ejecutaModificarArticulo("Agua", new BigInteger("15"), "Agua", new BigDecimal("0.9"));
        sujeto.notificarObservadores();
        inv.ejecutaModificarArticulo("Agua", new BigInteger("9"), "Agua", new BigDecimal("0.9"));
        sujeto.notificarObservadores();
        
    }
}
