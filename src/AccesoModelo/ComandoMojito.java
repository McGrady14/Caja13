
package AccesoModelo;

/**
 * Implementa la interfaz comando. Proporciona el comportamiento necesario para
 * crear, modificar y eliminar articulos de tipo Mojito
 *
 */

import static AccesoModelo.Fachada.manager;
import Creacion.Singleton;
import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Mojito;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class ComandoMojito implements Comando {
    
    FachadaArticulos fachada = new FachadaArticulos();
    Singleton singleton = Singleton.getInstancia();
    
    /**
     * Crea un articulo de tipo Mojito
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
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
    
    /**
     * Modifica un articulo de tipo Mojito
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    @Override
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        if (singleton.existeArticulo(nombre) && singleton.existeMojito(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Mojito mojito = singleton.retornarMojito(etiqueta);
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                mojito.setEtiqueta(etiqueta);
                manager.getTransaction().commit();
                System.out.println("SI actualiza Mojito");
            } catch (Exception e) {
                System.out.println("No actualiza Mojito");
            }
        }
    }
    
    /**
     * Elimina un articulo de tipo Mojito
     * 
     * @param etiqueta
     * @param nombre 
     */
    @Override
    public void eliminarArticulo(String etiqueta, String nombre){
        if (singleton.existeArticulo(nombre) && singleton.existeMojito(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Mojito mojito = singleton.retornarMojito(etiqueta);
                manager.remove(articulo);
                manager.remove(mojito);
                System.out.println("Borrar mojito");
                manager.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("No borra mojito");
            }
        }
    }

    @Override
    public Bebida retornarBebida(String etiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void crearExtraccion(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
