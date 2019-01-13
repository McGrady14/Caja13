
package Creacion;

import AccesoModelo.Fachada;
import AccesoModelo.FachadaArticulos;
import AccesoModelo.FachadaExtraccion;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author lafuente
 */
public class FactoriaExtraccion implements FactoriaArticulos {
    
    FachadaExtraccion fachada = new FachadaExtraccion();
    
    @Override
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigDecimal precio){
        
    }
    @Override
    public void crearMojito(String etiqueta, String nombre, BigDecimal precio){
        
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
        fachada.crearExtraccion(date);
    }
}
