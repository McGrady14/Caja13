
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.*;
import Modelo.Ticket;
import Modelo.Lineaticket;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author lafuente
 */
public class FachadaTickets extends Fachada {

    public FachadaTickets() {
        super.crearFactory();
        super.crearManager();
    }
    
    @Override
    public Ticket crearTicket(Date fecha, BigDecimal importe){
        int idTicket = devolverNumElementos(2) + 1;
        Ticket ticket = new Ticket(idTicket, fecha, importe);
        
        try {
            manager.getTransaction().begin();
            manager.persist(ticket);

            manager.getTransaction().commit();
            System.out.println("Registra ticket");
            actualizarCaja(importe);
        } catch (Exception e) {
            System.out.println("No registra ticket");
        }
        return ticket;
    }
    public void actualizarCaja(BigDecimal importe){
        int cajas = devolverNumElementos(3);
        Caja caja = manager.find(Caja.class, cajas);
        BigDecimal recaudacion = new BigDecimal("0");
        Date fecha = new Date();
        fecha.getTime();
        if (caja != null){
            recaudacion = caja.getRecaudacion().add(importe);
        }
        Caja caja1 = new Caja();
        caja1.setFecha(fecha);
        caja1.setIdCaja(cajas + 1);
        caja1.setRecaudacion(recaudacion);
        try {
            manager.getTransaction().begin();
            manager.persist(caja1);

            manager.getTransaction().commit();
            System.out.println("Registra caja");
        } catch (Exception e) {
            System.out.println("No registra caja");
        }
    }
    
    public int devolverNumElementos(int tipo){
        int numElementos = 0;
        if(tipo == 1){// Lineaticket
            List<Lineaticket> elementos =  (List<Lineaticket>) manager.createQuery("SELECT u FROM Lineaticket u").getResultList();
            numElementos = elementos.size();
        }
        else if(tipo == 2){//Ticket
            List<Ticket> elementos = (List<Ticket>) manager.createQuery("SELECT u FROM Ticket u").getResultList();
            numElementos = elementos.size();
        }
        else if(tipo == 3){//Caja
            List<Caja> elementos = (List<Caja>) manager.createQuery("SELECT u FROM Caja u").getResultList();
            numElementos = elementos.size();
        }
        return numElementos;
    }
    public List<Lineaticket> crearLineaTicket(Ticket ticket, ArrayList<Articulo> articulos){
        int idLinea, tamaño;
        List<Lineaticket> lineaTicket = new ArrayList();
        Lineaticket linea = new Lineaticket();
        tamaño = articulos.size();
        if (tamaño != 0){
            int i = 0;
            for (Articulo articulo: articulos ){
                //ticket = manager.find(Ticket.class, idTicket);
                idLinea = devolverNumElementos(1) + 1;
                //linea = new Lineaticket(idLinea, articulo.getNombre(), articulo.getPrecio(), articulo, ticket);
                Articulo articulo1 = articulo;
                linea.setIdArticulo(articulo1);
                linea.setIdLinea(idLinea);
                linea.setIdTicket(ticket);
                linea.setNombre(articulo.getNombre());
                linea.setPrecio(articulo.getPrecio());
                i++;
                persistirLinea(linea);
//                if ( i%2 == 0){
//                    persistirLinea(linea);
//                }
                lineaTicket.add(linea);
                
            }
            
        }
        else{
            System.out.println("List null pointer");
        }
        return lineaTicket;
    }
    
    public void persistirLinea (Lineaticket linea){

        try {
            manager.clear();
            manager.getTransaction().begin();
            manager.persist(linea);
            manager.getTransaction().commit();
            System.out.println("Registra Linea ticket");  
        } catch (Exception e) {
            System.out.println("No registra Linea ticket");
        }
    }
    
    
    
    
    
    @Override 
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
    }
    @Override 
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override 
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override 
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override 
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio){
    }



    @Override
    public void crearExtraccion(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
