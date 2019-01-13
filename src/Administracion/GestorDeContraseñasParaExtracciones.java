/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import AccesoModelo.Comando;
import AccesoModelo.ComandoExtraccion;
import AccesoModelo.Invocador;
import java.util.Date;

/**
 *
 * @author ernes
 */
public class GestorDeContraseñasParaExtracciones implements GestorDeContraseñas {

    private String nombre;
    private boolean permiso; 

        
    
    
        public GestorDeContraseñasParaExtracciones() {
        this.nombre = "GestorDeContraseñasParaExtracciones";
        this.permiso = false;
        
        
    }
    
    
    @Override
    public boolean validar(String contraseña) {
        System.out.println("validad en gestor de contraseñas para extracciones");
        permiso = true;
        return true;
    }

    @Override
    public void crearExtraccion(Date date) {
        System.out.println("Crear exgtraccion en gestor de contraseñas para extracciones");
        if(permiso == true){
            System.out.println("True");
            Invocador inv = new Invocador();
            Comando extraccion = new ComandoExtraccion();
            inv.setComando(extraccion);
            inv.ejecutaCrearExtraccion(date);
        }
        
    }
    
    
    
}
