
package Creacion;

import Modelo.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;


public class Director {
    
    private TicketBuilder builder;

    public void setBuilder(TicketBuilder builder) {
        this.builder = builder;
    }
    
    public void crearTicket(ArrayList<Articulo> articulos){
        Date fecha = builder.getFecha();
        BigDecimal importe = builder.calcularImporte(articulos);
        Ticket ticket = builder.crearTicket(fecha,importe);
        builder.crearLineaTicket(ticket, articulos);
        
        
    }
}
