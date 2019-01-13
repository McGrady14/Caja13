/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import java.util.Date;

/**
 *
 * Esto es un servidor
 */


public interface GestorDeContraseñas {
    public boolean validar(String contraseña);
    
    public void crearExtraccion(Date date);
    
}
