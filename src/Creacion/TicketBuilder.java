
package Creacion;

import java.util.Date;
import Modelo.*;
import AccesoModelo.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

/**
 * Constructor: Clase que especifica los métodos para crear las partes
 * del producto concreto, un ticket.
 */

public class TicketBuilder {
    
    
    Ticket ticket;
    FachadaTickets fachada = new FachadaTickets();
    
    /**
     * Retorna la fecha actual
     * 
     * @return Fecha
     */
    public Date getFecha(){
        Date fecha = new Date();
        fecha.getTime();
        return fecha;
    }
    
    /**
     * Devuelve el importe del ticket
     * 
     * @param articulos
     * @return BigDecimal Importe 
     */
    public BigDecimal calcularImporte(List<Articulo> articulos){
        BigDecimal importe = new BigDecimal("0");
        for(Articulo articulo: articulos){
            importe = articulo.getPrecio().add(importe);
 
        }
        return importe;
    }
    
    /**
     * Devuelve el ticket creado
     * 
     * @param fecha
     * @param importe
     * @return Ticket
     */
    public Ticket crearTicket(Date fecha, BigDecimal importe){
        Ticket ticket = null;
        ticket = fachada.crearTicket(fecha, importe);
        return ticket;
    }
    
    /**
     * Devuelve una lista con las lineas de ticket
     * 
     * @param ticket
     * @param articulos
     * @return Linea ticket
     */
    public List<Lineaticket> crearLineaTicket(Ticket ticket, ArrayList<Articulo> articulos){
       List<Lineaticket> lineaTicket = null;
       fachada.crearLineaTicket(ticket, articulos);
       return lineaTicket;
    }
}
