
package Administracion;

import AccesoModelo.Comando;
import AccesoModelo.ComandoExtraccion;
import AccesoModelo.Invocador;
import java.util.Date;

/**
 * Servidor real: Es la clase que implementa los servicios reales ofrecidos, puede
 * ser una instancia local o remota.
 */
public class GestorDeContraseñasParaExtracciones implements GestorDeContraseñas {

    private String nombre;
    private boolean permiso; 

        
    
    /**
     * Constructor
     * 
     */
    public GestorDeContraseñasParaExtracciones() {
        this.nombre = "GestorDeContraseñasParaExtracciones";
        this.permiso = false;
        
        
    }
    
    /**
     * Metodo real para validar el usuario
     * 
     * @param contraseña
     * @return 
     */
    @Override
    public boolean validar(String contraseña) {
        System.out.println("validad en gestor de contraseñas para extracciones");
        permiso = true;
        return true;
    }

    /**
     * Metodo real para crear extracciones
     * 
     * @param date 
     */
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
