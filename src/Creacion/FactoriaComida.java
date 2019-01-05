
package Creacion;

import AccesoModelo.FachadaArticulos;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author lafuente
 */
public class FactoriaComida implements FactoriaArticulos {
    
    FachadaArticulos fachada = new FachadaArticulos();
    
    @Override
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
    }
    @Override
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio){
        fachada.crearMontado(etiqueta, nombre, precio);
    }
    @Override
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio){
        fachada.crearBocata(etiqueta, nombre, precio);
    }
    @Override
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio){
        fachada.crearOtro(etiqueta, nombre, precio);
    }
}
