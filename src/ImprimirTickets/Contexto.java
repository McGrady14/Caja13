
package ImprimirTickets;

import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;

/**
 * Clase que utiliza las diferentes estrategias para las distintas formas de imprimir tickets.
 * Mantiene una referencia a la instancia Estrategia que usa, y tiene un método
 * para reemplazar la actual instancia de Estrategia.
 *
 * 
 */
public class Contexto {
    
    private Estrategia estrategia;
    private Ticket ticket;
    private ArrayList<Articulo> articulos;

    /**
     * Constructor
     * 
     * @param estrategia
     * @param ticket
     * @param articulos 
     */
    public Contexto(Estrategia estrategia, Ticket ticket, ArrayList<Articulo> articulos) {
        this.estrategia = estrategia;
        this.ticket = ticket;
        this.articulos = articulos;
    }

    /**
     * Establece la estrategia a utilizar
     * 
     * @param estrategia 
     */
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    
    /**
     * Ejecuta la estrategia
     * 
     */
    public void ejecutaEstrategia() {
        estrategia.imprimirTicket(ticket,articulos);
    }
    
    
}
