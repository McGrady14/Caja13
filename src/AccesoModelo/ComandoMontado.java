
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Montado;
import java.math.BigDecimal;
import java.math.BigInteger;


public class ComandoMontado implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    @Override
    public void crearArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = 0;
        idArticulo = fachada.devolverNumArticulos() + 1;
        int idMontado = fachada.devolverElementos(5) + 1;
        Articulo articulo = new Articulo(idArticulo, nombre, precio);
        Montado montado = new Montado(idMontado, etiqueta, articulo);
        
        try {
            manager.getTransaction().begin();
            manager.persist(articulo);
            manager.persist(montado);
            System.out.println("Registra montado");
            manager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No registra montado");
        }
    }
    @Override
    public void modificarArticulo(){
        
    }
    @Override
    public void eliminarArticulo(){
        
    }
}
