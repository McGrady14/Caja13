
package AccesoModelo;

import Modelo.*;
import java.util.List;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigInteger;
import java.math.BigDecimal;

/**
 * Facade o fachada: simplifica la creacion de objetos de las clases del modelo.
 */
public abstract class Fachada {
    //@PersistenceContext(unitname = "PeclPatronesPU")
    protected static EntityManagerFactory factory;
    protected static EntityManager manager;

    public Fachada() {

    }

    /**
     * Crea un EntityManagerFactory
     */
    public void crearFactory(){
        factory = Persistence.createEntityManagerFactory("PeclPatronesPU");
    }
    /**
     * Devuelve el EntityManagerFactory
     * 
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getFactory() {
        return factory;
    }
    
    /**
     * Crea un EntityManager
     */
    public void crearManager(){
        manager = factory.createEntityManager();
    }

    /**
     * Devuelve el EntityManager
     * 
     * @return EntityManager
     */
    public static EntityManager getManager() {
        return manager;
    }

    public abstract void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio);
    public abstract void crearMojito(String etiqueta, String nombre, BigDecimal precio);
    public abstract void crearBocata(String etiqueta, String nombre, BigDecimal precio);
    public abstract void crearOtro(String etiqueta, String nombre, BigDecimal precio);
    public abstract void crearMontado(String etiqueta, String nombre, BigDecimal precio);
    public abstract void crearExtraccion(Date date);
    
    public abstract Ticket crearTicket(Date fecha, BigDecimal importe);
    
    
    
    
    
    
    
}
