
package AccesoModelo;

import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Bocata;
import Modelo.Mojito;
import Modelo.Montado;
import Modelo.Otro;
import Modelo.Ticket;
import Modelo.Lineaticket;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
/**
 *
 * @author lafuente
 */
public class FachadaArticulos extends Fachada{

    /*private int idArticulo;
    private int idBebida;
    private int idMontado;
    private int idBocata;
    private int idMojito;
    private int idOtro;*/
    
    
    public FachadaArticulos() {
        super.crearFactory();
        super.crearManager();
    }
    
    @Override 
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        int idArticulo = 0;
        int idBebida =  0;
        idArticulo = devolverNumArticulos() + 1;
        idBebida = devolverElementos(1) + 1;
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
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio){
        int idArticulo = devolverNumArticulos() + 1;
        int idBocata = devolverElementos(2) + 1;
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
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
       int idArticulo = devolverNumArticulos() + 1;
        int idMojito = devolverElementos(3) + 1;
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
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio){
        int idArticulo = devolverNumArticulos() + 1;
        int idOtro = devolverElementos(4) + 1;
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
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio){
        int idArticulo = 0;
        idArticulo = devolverNumArticulos() + 1;
        int idMontado = devolverElementos(5) + 1;
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
    public int devolverNumArticulos(){
        List<Articulo> articulos = devolverArticulos();
        int numArticulos = articulos.size();
        return numArticulos;
    }
    public int devolverElementos(int tipo){
        int numElementos = 0;
        if(tipo == 1){
            List<Bebida> elementos =  devolverBebidas();
            numElementos = elementos.size();
        }
        else if(tipo == 2){
            List<Bocata> elementos = devolverBocatas();
            numElementos = elementos.size();
        }
        else if(tipo == 3){
            List<Mojito> elementos = devolverMojitos();
            numElementos = elementos.size();
        }
        else if(tipo == 4){
            List<Otro> elementos = devolverOtros();
            numElementos = elementos.size();
        }
        else if(tipo == 5){
            List<Montado> elementos = devolverMontados();
            numElementos = elementos.size();
        }
        return numElementos;
    }
    public List<Articulo> devolverArticulos(){
        return (List<Articulo>) manager.createQuery("SELECT u FROM Articulo u").getResultList();
    }
    public List<Bebida> devolverBebidas(){
        return (List<Bebida>) manager.createQuery("SELECT u FROM Bebida u").getResultList();
    }
    public List<Bocata> devolverBocatas(){
        return (List<Bocata>) manager.createQuery("SELECT u FROM Bocata u").getResultList();
    }
    public List<Montado> devolverMontados(){
        return (List<Montado>) manager.createQuery("SELECT u FROM Montado u").getResultList();
    }
    public List<Mojito> devolverMojitos(){
        return (List<Mojito>) manager.createQuery("SELECT u FROM Mojito u").getResultList();
    }
    public List<Otro> devolverOtros(){
        return (List<Otro>) manager.createQuery("SELECT u FROM Otro u").getResultList();
    }
    
    
    
    @Override
    public void crearTicket(Date fecha, BigDecimal importe, List<Lineaticket> lineaTicket){
    }
    
}
