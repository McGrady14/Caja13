
package Creacion;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import AccesoModelo.*;

/**
 *
 * @author lafuente
 */
public class Singleton {
    
    private static Singleton instancia;
    
    private List<Articulo> articulos = new ArrayList<>();
    private List<Bebida> bebidas = new ArrayList<>();
    private List<Bocata> bocatas = new ArrayList<>();
    private List<Montado> montados = new ArrayList<>();
    private List<Otro> otros = new ArrayList<>();
    private List<Mojito> mojitos = new ArrayList<>();
    
    private FachadaArticulos fachada= new FachadaArticulos();
    //Constuctor privado
    private Singleton() {
    }
 
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    
    
    
    
    
    
    public List<Articulo> getArticulos() {
        articulos = fachada.devolverArticulos();
        return articulos;
    }

    public List<Bebida> getBebidas() {
        bebidas = fachada.devolverBebidas();
        return bebidas;
    }

    public List<Bocata> getBocatas() {
        bocatas = fachada.devolverBocatas();
        return bocatas;
    }

    public List<Montado> getMontados() {
        montados = fachada.devolverMontados();
        return montados;
    }

    public List<Otro> getOtros() {
        otros = fachada.devolverOtros();
        return otros;
    }

    public List<Mojito> getMojitos() {
        mojitos = fachada.devolverMojitos();
        return mojitos;
    }
    
    public boolean existeArticulo(String nombre){
        List<Articulo> articulos = getArticulos();
        for (Articulo articulo : articulos){
            if (articulo.getNombre().equals(nombre))
                return true;
        }
        return false;
    }
    public boolean existeBebida(String etiqueta){
        List<Bebida> bebidas = getBebidas();
        for (Bebida bebida : bebidas){
            if (bebida.getEtiqueta().equals(etiqueta))
                return true;
        }
        return false;
    }
    public boolean existeBocata(String etiqueta){
        List<Bocata> bocatas = getBocatas();
        for (Bocata bocata : bocatas){
            if (bocata.getEtiqueta().equals(etiqueta))
                return true;
        }
        return false;
    }
    public boolean existeMontado(String etiqueta){
        List<Montado> montados = getMontados();
        for (Montado montado : montados){
            if (montado.getEtiqueta().equals(etiqueta))
                return true;
        }
        return false;
    }
    public boolean existeMojito (String etiqueta){
        List<Mojito> mojitos = getMojitos();
        for (Mojito mojito : mojitos){
            if (mojito.getEtiqueta().equals(etiqueta))
                return true;
        }
        return false;
    }
    public boolean existeOtro(String etiqueta){
        List<Otro> otros = getOtros();
        for (Otro otro : otros){
            if (otro.getEtiqueta().equals(etiqueta))
                return true;
        }
        return false;
    }
    public Articulo retornarArticulo(String nombre){
        Articulo art = null;
        for (Articulo articulo : getArticulos()){
            if (articulo.getNombre().equals(nombre))
                art = articulo;
        }
        return art;
    }
    public Bebida retornarBebida(String etiqueta){
        Bebida beb = null;
        for (Bebida bebida : getBebidas()){
            if (bebida.getEtiqueta().equals(etiqueta))
                beb = bebida;
        }
        return beb;
    }
    public Bocata retornarBocata(String etiqueta){
        Bocata boc = null;
        for (Bocata bocata: getBocatas()){
            if (bocata.getEtiqueta().equals(etiqueta))
                boc = bocata;
        }
        return boc;
    }
    public Montado retornarMontado(String etiqueta){
        Montado mon = null;
        for (Montado montado : getMontados()){
            if (montado.getEtiqueta().equals(etiqueta))
                mon = montado;
        }
        return mon;
    }
    public Mojito retornarMojito(String etiqueta){
        Mojito moj = null;
        for (Mojito mojito : getMojitos()){
            if (mojito.getEtiqueta().equals(etiqueta))
                moj = mojito;
        }
        return moj;
    }
    public Otro retornarOtro(String etiqueta){
        Otro otr = null;
        for (Otro otro : getOtros()){
            if (otro.getEtiqueta().equals(etiqueta))
                otr = otro;
        }
        return otr;
    }
  
    
}
