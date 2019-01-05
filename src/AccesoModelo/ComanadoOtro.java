
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Otro;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ComanadoOtro implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = fachada.devolverNumArticulos() + 1;
        int idOtro = fachada.devolverElementos(4) + 1;
        Articulo articulo = new Articulo(idArticulo, nombre, precio);
        Otro otro = new Otro(idOtro, etiqueta, articulo);
        try {
            manager.getTransaction().begin();
            manager.persist(articulo);
            manager.persist(otro);
            System.out.println("Registra otro");
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No registra otro");
        }
    }
    @Override
    public void modificarArticulo(){
        
    }
    @Override
    public void eliminarArticulo(){
        
    }
}
