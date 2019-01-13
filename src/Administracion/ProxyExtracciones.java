/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import java.util.Date;

/**
 *
 * @author ernes
 */
public class ProxyExtracciones implements GestorDeContraseñas {

    
    private GestorDeContraseñas gestorDeContraseñas;
    
        public ProxyExtracciones(GestorDeContraseñas gestorDeContraseña) {
        this.gestorDeContraseñas = gestorDeContraseña;
        
    }
    
    
    @Override
    public boolean validar(String contraseña) {
        return gestorDeContraseñas.validar(contraseña);
    }
    
    public void setGestorDeContraseñas(GestorDeContraseñas gestorDeContraseñas) {
        this.gestorDeContraseñas = gestorDeContraseñas;
    }
    
    public GestorDeContraseñas getGestorDeContraseñas() {
        return gestorDeContraseñas;
    }

    @Override
    public void crearExtraccion(Date date) {
        System.out.println("proxy crear extraccion");
        gestorDeContraseñas.crearExtraccion(date);
    }
    
   
    
}
