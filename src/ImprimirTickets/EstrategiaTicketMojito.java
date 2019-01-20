
package ImprimirTickets;

import Impresion.AdaptadorImpresoraTXT;
import Impresion.ImpresoraTXT;
import Impresion.Imprimir;
import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;

/**
 * Clase que implementa la interfaz Estrategia. Imprime tickets de tipo mojito.
 *
 * 
 */
public class EstrategiaTicketMojito implements Estrategia{

    @Override
    public void imprimirTicket(Ticket ticket, ArrayList<Articulo> articulos) {
        Imprimir impresora = new AdaptadorImpresoraTXT(new ImpresoraTXT());    
        impresora.printTexto("Ticket mojito");
    }
    
    
    
}
