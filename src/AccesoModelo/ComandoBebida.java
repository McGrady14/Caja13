
package AccesoModelo;

/**
 * Implementa la interfaz comando. Proporciona el comportamiento necesario para
 * crear, modificar y eliminar articulos de tipo Bebida
 *
 */

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.*;
import Creacion.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lafuente
 */
public class ComandoBebida implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    Singleton singleton = Singleton.getInstancia();
    
    /**
     * Crea articulos de tipo Bebida
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
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
    
    /**
     * Modifica un articulo de tipo Bebida
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    @Override
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        if (singleton.existeArticulo(nombre) && singleton.existeBebida(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Bebida bebida = singleton.retornarBebida(etiqueta);
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                bebida.setEtiqueta(etiqueta);
                bebida.setExistencias(existencias);
                manager.getTransaction().commit();
                System.out.println("SI actualiza Bebida");
            } catch (Exception e) {
                System.out.println("No actualiza Bebida");
            }
        }
    }
    
    /**
     * Elimina un articulo de tipo Bebida
     * 
     * @param etiqueta
     * @param nombre 
     */
    @Override
    public void eliminarArticulo(String etiqueta, String nombre){
        if (singleton.existeArticulo(nombre) && singleton.existeBebida(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Bebida bebida = singleton.retornarBebida(etiqueta);
                manager.remove(articulo);
                manager.remove(bebida);
                System.out.println("Borrar Bebida");
                manager.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("No borra bebida");
            }
        }
    }
    



    @Override
    public Bebida retornarBebida(String etiqueta) {
                       if (singleton.existeBebida(etiqueta)){
            try {
                manager.getTransaction().begin();
                
                Bebida bebida = singleton.retornarBebida(etiqueta);
                manager.getTransaction().commit();
                return bebida;                
            } catch (Exception e) {
                System.out.println("Bebida inexistente");
            }
        }
        return null;
    }



    @Override
    public void crearExtraccion(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

}
