
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
            System.out.println("Registra ticket");
            manager.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("No registra ticket");
        }
        return ticket;
    }
    
    public int devolverNumElementos(int tipo){
        int numElementos = 0;
        if(tipo == 1){
            List<Lineaticket> elementos =  (List<Lineaticket>) manager.createQuery("SELECT u FROM Lineaticket u").getResultList();
            numElementos = elementos.size();
        }
        else if(tipo == 2){
            List<Ticket> elementos = (List<Ticket>) manager.createQuery("SELECT u FROM Ticket u").getResultList();
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
                lineaTicket.add(linea);
                try {
                    manager.getTransaction().begin();
                    manager.persist(linea);
                    System.out.println("Registra Linea ticket");
                    manager.getTransaction().commit();

                } catch (Exception e) {
                    System.out.println("No registra Linea ticket");
                }


            }
            
        }
        else{
            System.out.println("List null pointer");
        }
        
        return lineaTicket;
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
