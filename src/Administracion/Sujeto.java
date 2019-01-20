
package Administracion;

import Modelo.Bebida;

/**
 * Sujeto (Observado): Interfaz que define como pueden interactuar los
 * observadores con el sujeto. Define métodos para añadir y quitar observadores
 * y avisarles de que se han producido cambios en el sujeto.
 *
 * 
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
