
package AccesoModelo;

import static AccesoModelo.Fachada.manager;
import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Bocata;
import Modelo.Extraccion;
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
 * Fachada concreta para crear extracciones.
 */
public class FachadaExtraccion extends Fachada {

    Invocador inv = new Invocador();
    
    public FachadaExtraccion() {
        super.crearFactory();
        super.crearManager();
    }
    
    /**
     * Metodo para llamar a los metodos que crearan las extracciones.
     * 
     * @param date 
     */
    @Override
    public void crearExtraccion(Date date){        
        
        Comando comando = new ComandoExtraccion();
        inv.setComando(comando);
        inv.ejecutaCrearExtraccion(date);
    
    }

    /**
     * Devuelve el numero de extracciones.
     * 
     * @return 
     */
    public int devolverNumExtracciones(){

        List<Extraccion> elementos =  (List<Extraccion>) manager.createQuery("SELECT e FROM Extraccion e").getResultList();
        int numElementos = elementos.size();
        return numElementos;
    }
    
    
    
    @Override
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Ticket crearTicket(Date fecha, BigDecimal importe) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
