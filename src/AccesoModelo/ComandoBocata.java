
package AccesoModelo;


/**
 * Implementa la interfaz comando. Proporciona el comportamiento necesario para
 * crear, modificar y eliminar articulos de tipo Bocata
 *
 */

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bocata;
import Creacion.Singleton;
import Modelo.Bebida;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class ComandoBocata implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    Singleton singleton = Singleton.getInstancia();
    
    /**
     * Crea un articulo de tipo Bocata
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
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
    
    /**
     * Modifica un articulo de tipo Bocata
     * 
     * @param etiqueta
     * @param existencias
     * @param nombre
     * @param precio 
     */
    @Override
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        if (singleton.existeArticulo(nombre) && singleton.existeBocata(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Bocata bocata = singleton.retornarBocata(etiqueta);
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                bocata.setEtiqueta(etiqueta);
                manager.getTransaction().commit();
                System.out.println("SI actualiza Bocata");
            } catch (Exception e) {
                System.out.println("No actualiza Bocata");
            }
        }
    }
    
    /**
     * Elimina un articulo de tipo Bocata
     * 
     * @param etiqueta
     * @param nombre 
     */
    @Override
    public void eliminarArticulo(String etiqueta, String nombre){
        if (singleton.existeArticulo(nombre) && singleton.existeBocata(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Bocata bocata = singleton.retornarBocata(etiqueta);
                manager.remove(articulo);
                manager.remove(bocata);
                System.out.println("Borrar Bocata");
                manager.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("No borra bocata");
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
