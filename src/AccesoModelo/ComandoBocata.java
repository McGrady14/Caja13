
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bocata;
import Creacion.Singleton;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ComandoBocata implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = fachada.devolverNumArticulos() + 1;
        int idBocata = fachada.devolverElementos(2) + 1;
        Articulo articulo = new Articulo(idArticulo, nombre, precio);
        Bocata bocata = new Bocata(idBocata, etiqueta, articulo);
        try {
            manager.getTransaction().begin();
            manager.persist(articulo);
            manager.persist(bocata);
            System.out.println("Registra bocata");
            manager.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No registra bocata");
        }
    }
    @Override
    public void modificarArticulo(){
        
    }
    @Override
    public void eliminarArticulo(){
        
    }
}
