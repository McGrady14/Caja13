
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bocata;
import Creacion.Singleton;
import Modelo.Bebida;
import Modelo.Extraccion;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class ComandoExtraccion implements Comando{
    
    FachadaExtraccion fachada = new FachadaExtraccion();
    Singleton singleton = Singleton.getInstancia();
    
    @Override
    public void crearExtraccion(Date date) {
        int idExtraccion = fachada.devolverNumExtracciones() + 1;
        
        Extraccion extraccion = new Extraccion(idExtraccion, date);
        
        try {
            manager.getTransaction().begin();
            manager.persist(extraccion);
            
            System.out.println("Registra extraccion");
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No registra extraccion");
        }
        
        
        
    }
    

    @Override
    public Bebida retornarBebida(String etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminarArticulo(String etiqueta, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
