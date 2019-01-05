
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Bocata;
import Modelo.Mojito;
import Modelo.Montado;
import Modelo.Otro;
import Modelo.Ticket;
import Modelo.Lineaticket;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    public void crearTicket(Date fecha, BigDecimal importe, List<Lineaticket> lineaTicket){
        int idTicket = devolverNumTickets() + 1;
        Ticket ticket = new Ticket(idTicket, fecha, importe, lineaTicket);
        
        try {
            manager.getTransaction().begin();
            manager.persist(ticket);
            System.out.println("Registra ticket");
            manager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No registra ticket");
        }
    }
    public int devolverNumTickets(){
        List<Ticket> tickets = (List<Ticket>) manager.createQuery("SELECT u FROM Ticket u").getResultList();
        int numTickets = tickets.size();
        return numTickets;
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
}
