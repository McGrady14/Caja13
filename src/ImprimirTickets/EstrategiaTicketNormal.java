/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImprimirTickets;

import Impresion.AdaptadorImpresoraTXT;
import Impresion.ImpresoraTXT;
import Impresion.Imprimir;
import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;

/**
 *
 * @author lafuente
 */
public class EstrategiaTicketNormal implements Estrategia{

    @Override
    public void imprimirTicket(Ticket ticket, ArrayList<Articulo> articulos) {
        Imprimir impresora = new AdaptadorImpresoraTXT(new ImpresoraTXT());    
        impresora.printTexto("Ticket Normal");
    }
    
}
