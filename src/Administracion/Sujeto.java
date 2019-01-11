/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import Modelo.Bebida;

/**
 *
 * @author ernes
 */
public interface Sujeto {
    public void setBebida(Bebida b);

    /**
     * Devuelve el valor al que monitorizar su cotización.
     *
     * @return Valor al que monitorizar su cotización.
     */
    public Bebida getBebida();

    /**
     * Añade un observador a la lista.
     *
     * @param o Observador.
     */
    public void añadirObservador(Observador o);

    /**
     * Elimina un observador de la lista
     *
     * @param o Observador.
     */
    public void eliminarObservador(Observador o);

    /**
     * Notifica a todos los observadores de que se ha producido un cambio
     */
    public void notificarObservadores();
    
    
}
