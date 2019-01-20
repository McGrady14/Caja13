
package Administracion;

import Modelo.Bebida;
import java.util.ArrayList;

/**
 * SujetoBebida: Implementa la interfaz Sujeto. Contiene una lista de
 * observadores a los que notifica cambios en la cotización de una acción
 *
 * 
 */
public class SujetoBebida implements Sujeto{

    private ArrayList<Observador> observadores = new ArrayList<>();
    private Bebida bebida;
    
    /**
     * Metodo para establecer el sujeto
     * @param b 
     */
    @Override
    public void setBebida(Bebida b) {
        System.out.println("Set bebida"); 
        this.bebida = b;
    }

    /**
     * Metodo para recuperar el sujeto
     * @return 
     */
    @Override
    public Bebida getBebida() {
        System.out.println("Get bebida"); 
        return this.bebida;
    }

    /**
     * Metodo para añadir un observador
     * @param o 
     */
    @Override
    public void añadirObservador(Observador o) {
        System.out.println("add observador"); 
        if (observadores.contains(o) == false) {
            observadores.add(o);
        }
    }

    /**
     * Metodo para eliminar un observador
     * @param o 
     */
    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

    /**
     * Metodo para notificar a los observadores
     */
    @Override
    public void notificarObservadores() {
        //Pasamos el vector a un array para evitar la eliminación
        //de los observadores en tiempo de ejecución
        System.out.println("notify observador"); 
        Object[] obArray = observadores.toArray();

        for (int i = 0; i < obArray.length; ++i) {
            System.out.println("notificarObservadores"); 
            Observador o = (Observador) obArray[i];
            System.out.println(o.actualizar());
        }
    }
    
}
