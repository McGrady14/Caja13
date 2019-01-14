
package Creacion;

import java.util.Date;
import Modelo.*;
import AccesoModelo.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;


public class TicketBuilder {
    
    
    Ticket ticket;
    FachadaTickets fachada = new FachadaTickets();
    public Date getFecha(){
        Date fecha = new Date();
        fecha.getTime();
        return fecha;
    }
    public BigDecimal calcularImporte(List<Articulo> articulos){
        BigDecimal importe = new BigDecimal("0");
        for(Articulo articulo: articulos){
            importe = articulo.getPrecio().add(importe);
 
        }
        return importe;
    }
    
    public Ticket crearTicket(Date fecha, BigDecimal importe){
        Ticket ticket = null;
        ticket = fachada.crearTicket(fecha, importe);
        return ticket;
    }
    public List<Lineaticket> crearLineaTicket(Ticket ticket, ArrayList<Articulo> articulos){
       List<Lineaticket> lineaTicket = null;
       fachada.crearLineaTicket(ticket, articulos);
       return lineaTicket;
    }
}
