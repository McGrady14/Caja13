
package Creacion;

import Modelo.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * Director: Construye un objeto complejo Ticket usando la clase 
 * TicketBuilder.
 */
public class Director {
    
    private TicketBuilder builder;

    /**
     * Establece el constructor o builder
     * @param builder 
     */
    public void setBuilder(TicketBuilder builder) {
        this.builder = builder;
    }
    
    /**
     * Metodo para crear tickets 
     * 
     * @param articulos
     * @return Ticket
     */
    public Ticket crearTicket(ArrayList<Articulo> articulos){
        Date fecha = builder.getFecha();
        BigDecimal importe = builder.calcularImporte(articulos);
        Ticket ticket = builder.crearTicket(fecha,importe);
        builder.crearLineaTicket(ticket, articulos);
        return ticket;
        
        
    }
}
