
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Creacion.Singleton;
import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Otro;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;


public class ComanadoOtro implements Comando{
    
    FachadaArticulos fachada = new FachadaArticulos();
    Singleton singleton = Singleton.getInstancia();

    public ComanadoOtro() {
    }
    
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
    public void modificarArticulo(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        if (singleton.existeArticulo(nombre) && singleton.existeOtro(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Otro otro = singleton.retornarOtro(etiqueta);
                articulo.setNombre(nombre);
                articulo.setPrecio(precio);
                otro.setEtiqueta(etiqueta);
                manager.getTransaction().commit();
                System.out.println("SI actualiza Otro");
            } catch (Exception e) {
                System.out.println("No actualiza Otro");
            }
        }
    }
    @Override
    public void eliminarArticulo(String etiqueta, String nombre){
        if (singleton.existeArticulo(nombre) && singleton.existeOtro(etiqueta)){
            try {
                manager.getTransaction().begin();
                Articulo articulo = singleton.retornarArticulo(nombre);
                Otro otro = singleton.retornarOtro(etiqueta);
                manager.remove(articulo);
                manager.remove(otro);
                System.out.println("Borrar otro");
                manager.getTransaction().commit();
            } catch (Exception e) {
                System.out.println("No borra otro");
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
