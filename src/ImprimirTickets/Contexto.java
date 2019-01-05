/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImprimirTickets;

import Modelo.Ticket;

/**
 *
 * @author lafuente
 */
public class Contexto {
    
    private Estrategia estrategia;
    private Ticket ticket;

    public Contexto(Estrategia estrategia, Ticket ticket) {
        this.estrategia = estrategia;
        this.ticket = ticket;
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
    
    
    
    public void ejecutaEstrategia() {
        estrategia.imprimirTicket(ticket);
    }
    
    
}
