
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
  
    
}
