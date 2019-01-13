/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import AccesoModelo.Comando;
import AccesoModelo.ComandoBebida;
import AccesoModelo.ComandoExtraccion;
import AccesoModelo.Invocador;
import Administracion.GestorDeContraseñas;
import Administracion.GestorDeContraseñasParaExtracciones;
import Administracion.ProxyExtracciones;
import java.util.Calendar;

/**
 *
 * @author ernes
 */
public class RealizarExtraccion {
    public static void main(String[] args) {
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
