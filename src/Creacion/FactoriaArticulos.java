/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creacion;

import java.math.BigInteger;
/**
 *
 * @author lafuente
 */
public interface FactoriaArticulos {
    
    public void crearBebida(String etiqueta, BigInteger existencias, String nombre, BigInteger precio);
    public void crearMojito(String etiqueta, String nombre, BigInteger precio);
    public void crearMontado(String etiqueta, String nombre, BigInteger precio);
    public void crearBocata(String etiqueta, String nombre, BigInteger precio);
    public void crearOtro(String etiqueta, String nombre, BigInteger precio);
    
}