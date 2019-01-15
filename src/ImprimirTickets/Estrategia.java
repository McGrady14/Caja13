
package ImprimirTickets;

import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;
/**
 *
 * @author lafuente
 */
public interface Estrategia {
    
    
    
    public void imprimirTicket(Ticket ticket, ArrayList<Articulo> articulos);
    
}
