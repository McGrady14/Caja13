
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author lafuente
 */
public class ComandoBebida implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = 0;
        int idBebida =  0;
        idArticulo = fachada.devolverNumArticulos() + 1;
        idBebida = fachada.devolverElementos(1) + 1;
        Articulo articulo = new Articulo(idArticulo, nombre, precio);
        Bebida bebida = new Bebida(idBebida, etiqueta, existencias, articulo);
        try {
            manager.getTransaction().begin();
            manager.persist(articulo);
            manager.persist(bebida);
            manager.getTransaction().commit();
            System.out.println("Registra bebida");
        } catch (Exception e) {
            System.out.println("No registra bebida");
        }
    }
    @Override
    public void modificarArticulo(){
        
    }
    @Override
    public void eliminarArticulo(){
        
    }
}
