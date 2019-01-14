
package Creacion;


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
        if (tipo == ticket){
            builder = new TicketBuilder();
            dir.setBuilder(builder);
            dir.crearTicket(articulos);
            //fac.crearTicket(fecha, importe); //Factoty method
            //Imprimir ticketNormal
            
        }
        else if (tipo == ticketMojito){
            //Imprimir ticket mojito 
            
        }
    }
}
