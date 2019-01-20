
package Administracion;

import java.util.Date;

/**
 * Servidor: Define la interfaz común para el Proxy y el Servidor real de forma que
 * se pueda usar un Proxy donde se espere un Servidor real.
 */


public interface GestorDeContraseñas {
    
    /**
     * Metodo para validar a un usuario 
     *
     * @param contraseña
     * @return 
     */
    public boolean validar(String contraseña);
    
    /**
     * Metodo para crear extracciones
     * 
     * @param date 
     */
    public void crearExtraccion(Date date);
    
}
