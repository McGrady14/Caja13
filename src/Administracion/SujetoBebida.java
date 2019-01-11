/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import Modelo.Bebida;
import java.util.ArrayList;

/**
 *
 * @author ernes
 */
public class SujetoBebida implements Sujeto{

    private ArrayList<Observador> observadores = new ArrayList<>();
    private Bebida bebida;
    
    @Override
    public void setBebida(Bebida b) {
        System.out.println("Set bebida"); 
        this.bebida = b;
    }

    @Override
    public Bebida getBebida() {
        System.out.println("Get bebida"); 
        return this.bebida;
    }

    @Override
    public void añadirObservador(Observador o) {
        System.out.println("add observador"); 
        if (observadores.contains(o) == false) {
            observadores.add(o);
        }
    }

    @Override
    public void eliminarObservador(Observador o) {
        observadores.remove(o);
    }

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
