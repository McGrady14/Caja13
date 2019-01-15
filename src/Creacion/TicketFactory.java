
package Creacion;


import ImprimirTickets.Contexto;
import ImprimirTickets.Estrategia;
import ImprimirTickets.EstrategiaTicketMojito;
import ImprimirTickets.EstrategiaTicketNormal;
import Modelo.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class TicketFactory {
    
    private static final int ticket = 1;
    private static final int ticketMojito = 0;
    Director dir = new Director();
    TicketBuilder builder;

    public TicketFactory() {
    }

    
    public void factoryTicket(int tipo, ArrayList<Articulo> articulos){
        builder = new TicketBuilder();
        dir.setBuilder(builder);
        Ticket auxTicket = dir.crearTicket(articulos);
        Estrategia est;
        est = new EstrategiaTicketNormal();
        if (tipo == ticketMojito){         
            //fac.crearTicket(fecha, importe); //Factoty method
            //Imprimir ticketNormal
            est = new EstrategiaTicketMojito();        
        }
        Contexto contexto = new Contexto(est, auxTicket, articulos);
        contexto.ejecutaEstrategia();    

        
        
    }
    
    
    
}
