
package Administracion;

import java.util.Date;

/**
 * Proxy: Ofrece una interfaz equivalente al de la clase GestorDeContraseñas, y redirige
 * las llamadas de los métodos al servidor real.
 */
public class ProxyExtracciones implements GestorDeContraseñas {

    /**
     * Referencia al servido real.
     */
    private GestorDeContraseñas gestorDeContraseñas;
    /**
     * Constructor
     * @param gestorDeContraseña 
     */
    public ProxyExtracciones(GestorDeContraseñas gestorDeContraseña) {
        this.gestorDeContraseñas = gestorDeContraseña;
    }
    /**
     * Validar un usuario
     * 
     * @param contraseña
     * @return 
     */
    @Override
    public boolean validar(String contraseña) {
        return gestorDeContraseñas.validar(contraseña);
    }
    /**
     * Establece el gestor de contraseñas
     * @param gestorDeContraseñas 
     */
    public void setGestorDeContraseñas(GestorDeContraseñas gestorDeContraseñas) {
        this.gestorDeContraseñas = gestorDeContraseñas;
    }
    /**
     * Devuelve el gestor de contraseñas
     * @return GestorDeContraseñas
     */
    public GestorDeContraseñas getGestorDeContraseñas() {
        return gestorDeContraseñas;
    }
    /**
     * Crear una extraccion
     * @param date 
     */
    @Override
    public void crearExtraccion(Date date) {
        System.out.println("proxy crear extraccion");
        gestorDeContraseñas.crearExtraccion(date);
    }
    
   
    
}
