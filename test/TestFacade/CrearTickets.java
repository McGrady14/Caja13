/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import Creacion.TicketFactory;
import Creacion.Singleton;
import Modelo.Articulo;
import Modelo.Lineaticket;
import java.util.ArrayList;


/**
 *
 * @author lafuente
 */
public class CrearTickets {
    static Singleton instancia = Singleton.getInstancia();
    
    public static void main(String[] args) {
        // TODO code application logic here

        
        TicketFactory facT = new TicketFactory();
        Lineaticket linea1 = new Lineaticket();
        ArrayList<Articulo> articulos = new ArrayList();
        Articulo articulo1;
        articulo1 = instancia.retornarArticulo("Agua");
        articulos.add(articulo1);
        facT.factoryTicket(1, articulos);
        
    }
}
