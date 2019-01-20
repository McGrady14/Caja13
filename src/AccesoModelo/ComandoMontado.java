
package AccesoModelo;

/**
 * Implementa la interfaz comando. Proporciona el comportamiento necesario para
 * crear, modificar y eliminar articulos de tipo Montado
 *
 */

import static AccesoModelo.Fachada.manager;
import Creacion.Singleton;
import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Montado;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class ComandoMontado implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    Singleton singleton = Singleton.getInstancia();
    
    /**
     * Crea un articulo de tipo Montado
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
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
    
    /**
     * Modifica un articulo de tipo Montado
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    @Override
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        if (singleton.existeArticulo(nombre) && singleton.existeMontado(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Montado montado = singleton.retornarMontado(etiqueta);
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                montado.setEtiqueta(etiqueta);
                manager.getTransaction().commit();
                System.out.println("SI actualiza Montado");
            } catch (Exception e) {
                System.out.println("No actualiza Montado");
            }
        }
    }
    
    /**
     * Elimina un articulo de tipo Montado
     * 
     * @param etiqueta
     * @param nombre 
     */
    @Override
    public void eliminarArticulo(String etiqueta, String nombre){
        if (singleton.existeArticulo(nombre) && singleton.existeMontado(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Montado montado = singleton.retornarMontado(etiqueta);
                manager.remove(articulo);
                manager.remove(montado);
                System.out.println("Borrar montado");
                manager.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("No borra montado");
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
