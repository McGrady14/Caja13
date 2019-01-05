
package AccesoModelo;

import Modelo.Articulo;
import Modelo.Bebida;
import Modelo.Bocata;
import Modelo.Mojito;
import Modelo.Montado;
import Modelo.Otro;
import Modelo.Lineaticket;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lafuente
 */
public class FachadaArticulos extends Fachada{

    /*private int idArticulo;
    private int idBebida;
    private int idMontado;
    private int idBocata;
    private int idMojito;
    private int idOtro;*/
    
    Invocador inv = new Invocador();
    
    public FachadaArticulos() {
        super.crearFactory();
        super.crearManager();
    }
    
    @Override 
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        Comando comando = new ComandoBebida();
        inv.setComando(comando);
        inv.ejecutaCrearArticulo(etiqueta, existencias, nombre, precio);
    }
    @Override 
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio){
        BigInteger existencias = new BigInteger("0");
        Comando comando = new ComandoBocata();
        inv.setComando(comando);
        inv.ejecutaCrearArticulo(etiqueta, existencias, nombre, precio);
    }
    @Override 
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
        BigInteger existencias = new BigInteger("0");
        Comando comando = new ComandoMojito();
        inv.setComando(comando);
        inv.ejecutaCrearArticulo(etiqueta, existencias, nombre, precio);
    }
    @Override 
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio){
        BigInteger existencias = new BigInteger("0");
        Comando comando = new ComanadoOtro();
        inv.setComando(comando);
        inv.ejecutaCrearArticulo(etiqueta, existencias, nombre, precio);
    }
    @Override 
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio){
        BigInteger existencias = new BigInteger("0");
        Comando comando = new ComandoMontado();
        inv.setComando(comando);
        inv.ejecutaCrearArticulo(etiqueta, existencias, nombre, precio);
    }
    
    
    
    
    
    
    public int devolverNumArticulos(){
        List<Articulo> articulos = devolverArticulos();
        int numArticulos = articulos.size();
        return numArticulos;
    }
    public int devolverElementos(int tipo){
        int numElementos = 0;
        if(tipo == 1){
            List<Bebida> elementos =  devolverBebidas();
            numElementos = elementos.size();
        }
        else if(tipo == 2){
            List<Bocata> elementos = devolverBocatas();
            numElementos = elementos.size();
        }
        else if(tipo == 3){
            List<Mojito> elementos = devolverMojitos();
            numElementos = elementos.size();
        }
        else if(tipo == 4){
            List<Otro> elementos = devolverOtros();
            numElementos = elementos.size();
        }
        else if(tipo == 5){
            List<Montado> elementos = devolverMontados();
            numElementos = elementos.size();
        }
        return numElementos;
    }
    public List<Articulo> devolverArticulos(){
        return (List<Articulo>) manager.createQuery("SELECT u FROM Articulo u").getResultList();
    }
    public List<Bebida> devolverBebidas(){
        return (List<Bebida>) manager.createQuery("SELECT u FROM Bebida u").getResultList();
    }
    public List<Bocata> devolverBocatas(){
        return (List<Bocata>) manager.createQuery("SELECT u FROM Bocata u").getResultList();
    }
    public List<Montado> devolverMontados(){
        return (List<Montado>) manager.createQuery("SELECT u FROM Montado u").getResultList();
    }
    public List<Mojito> devolverMojitos(){
        return (List<Mojito>) manager.createQuery("SELECT u FROM Mojito u").getResultList();
    }
    public List<Otro> devolverOtros(){
        return (List<Otro>) manager.createQuery("SELECT u FROM Otro u").getResultList();
    }
    
    
    
    @Override
    public void crearTicket(Date fecha, BigDecimal importe, List<Lineaticket> lineaTicket){
    }
    
}
