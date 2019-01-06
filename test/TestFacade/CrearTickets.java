/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import Creacion.TicketFactory;
import Modelo.Articulo;
import Modelo.Lineaticket;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lafuente
 */
public class CrearTickets {
    
    protected static EntityManagerFactory factory = Persistence.createEntityManagerFactory("PeclPatronesPU");
    
    protected static EntityManager manager = factory.createEntityManager();
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        TicketFactory facT = new TicketFactory();
        Lineaticket linea1 = new Lineaticket();
        ArrayList<Articulo> articulos = new ArrayList();
        Articulo articulo1 = manager.find(Articulo.class, 1);
        Articulo articulo2 = manager.find(Articulo.class, 2);
        Articulo articulo3 = manager.find(Articulo.class, 3);
        articulos.add(articulo1);
        articulos.add(articulo2);
        articulos.add(articulo3);
        facT.factoryTicket(1, articulos);
        
    }
}
