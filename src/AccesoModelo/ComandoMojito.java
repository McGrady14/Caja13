
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Mojito;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ComandoMojito implements Comando {
    
    FachadaArticulos fachada = new FachadaArticulos();
    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = fachada.devolverNumArticulos() + 1;
        int idMojito = fachada.devolverElementos(3) + 1;
        Articulo articulo = new Articulo(idArticulo, nombre, precio);
        Mojito mojito = new Mojito(idMojito, etiqueta, articulo);
        try {
            manager.getTransaction().begin();
            manager.persist(articulo);
            manager.persist(mojito);
            System.out.println("Registra mojito");
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No registra mojito");
        }
    }
    @Override
    public void modificarArticulo(){
        
    }
    @Override
    public void eliminarArticulo(){
        
    }
}
