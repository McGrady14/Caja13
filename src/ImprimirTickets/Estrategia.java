
package ImprimirTickets;

import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;


/**
 * Interfaz en la que se definen todos los métodos disponibles para ser
 * manejados por Contexto.
 *
 * 
 */


public interface Estrategia {
    
    
    /**
     * Imprime los tickets que se pasan como argumento
     * 
     * @param ticket
     * @param articulos 
     */
    public void imprimirTicket(Ticket ticket, ArrayList<Articulo> articulos);
    
}
