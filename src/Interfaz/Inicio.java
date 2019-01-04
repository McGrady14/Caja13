/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Creacion.*;
import Modelo.*;
import java.util.List;
import java.util.Date;
import java.util.ArrayList;
import java.math.BigInteger;

/**
 *
 * @author lafuente
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TicketFactory facT = new TicketFactory();
        Lineaticket linea1 = new Lineaticket();
        List<Lineaticket> lineas = new ArrayList();
        Articulo articulo = new Articulo();
        articulo.setIdArticulo(1);
        linea1.setIdArticulo(articulo);
        linea1.setIdLinea(1);
        linea1.setTipo(articulo.getNombre());
        lineas.add(linea1);
        Date fecha = new Date();
        fecha.getTime();
        //facT.factoryTicket(1, fecha, new BigInteger("50"), lineas);
        
    }
    
}
