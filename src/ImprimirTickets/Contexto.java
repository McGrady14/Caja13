/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImprimirTickets;

import Modelo.Articulo;
import Modelo.Ticket;
import java.util.ArrayList;

/**
 *
 * @author lafuente
 */
public class Contexto {
    
    private Estrategia estrategia;
    private Ticket ticket;
    private ArrayList<Articulo> articulos;

    public Contexto(Estrategia estrategia, Ticket ticket, ArrayList<Articulo> articulos) {
        this.estrategia = estrategia;
        this.ticket = ticket;
        this.articulos = articulos;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    
    
    public void ejecutaEstrategia() {
        estrategia.imprimirTicket(ticket,articulos);
    }
    
    
}
