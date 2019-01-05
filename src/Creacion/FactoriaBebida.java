
package Creacion;

import AccesoModelo.Fachada;
import AccesoModelo.FachadaArticulos;
import java.math.BigInteger;
import java.math.BigDecimal;
/**
 *
 * @author lafuente
 */
public class FactoriaBebida implements FactoriaArticulos {
    
    FachadaArticulos fachada = new FachadaArticulos();
    
    @Override
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        fachada.crearBebida(etiqueta, existencias, nombre, precio);
    }
    @Override
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
        fachada.crearMojito(etiqueta, nombre, precio);
    }
    @Override
    public void crearMontado(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override
    public void crearBocata(String etiqueta, String nombre, BigDecimal precio){
    }
    @Override
    public void crearOtro(String etiqueta, String nombre, BigDecimal precio){
    }
}
