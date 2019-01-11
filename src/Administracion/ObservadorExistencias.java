/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Administracion;

import Modelo.Bebida;
import java.math.BigInteger;

/**
 *
 * @author ernes
 */
public class ObservadorExistencias implements Observador {

    private String nombre;
    private int numeroExistenciasParaAlarma;
    private Sujeto sujetoObservado;

    public ObservadorExistencias(String nombre, int numeroExistenciasParaAlarma, Sujeto sujetoObservado) {
        this.nombre = nombre;
        this.numeroExistenciasParaAlarma = numeroExistenciasParaAlarma;
        this.sujetoObservado = sujetoObservado;
        sujetoObservado.añadirObservador(this);
    }
    
    
    @Override
    public String actualizar() {
        BigInteger existencias = sujetoObservado.getBebida().getExistencias();
        BigInteger minimasExistencias = BigInteger.valueOf(10);
        String notificacion;

        if (existencias.compareTo(minimasExistencias) == -1) {
            System.out.println("actualizar"); 
            notificacion = "Reposición necesaria" + "Existencias actuales: " + existencias;  
        } else {
            System.out.println("actualizar"); 
            notificacion = "Existencias actuales: " + existencias; 
        }

        return notificacion;
    }
    
}
