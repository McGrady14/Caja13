
package Creacion;

import AccesoModelo.Fachada;
import AccesoModelo.FachadaArticulos;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
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

    @Override
    public void crearExtraccion(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
