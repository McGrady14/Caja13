
package Creacion;

import AccesoModelo.*;
import Modelo.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
/**
 *
 * @author lafuente
 */
public class TicketFactory {
    
    private static final int ticket = 1;
    private static final int ticketMojito = 0;
    Fachada fac = new FachadaTickets();

    public TicketFactory() {
    }

    
    public void factoryTicket(int tipo, Date fecha, BigDecimal importe, List<Lineaticket> lineaTicket){
        if (tipo == ticket){
            fac.crearTicket(fecha, importe, lineaTicket); //Factoty method
            //Imprimir ticketNormal
            
        }
        else if (tipo == ticketMojito){
            //Imprimir ticket mojito 
        }
    }
}
