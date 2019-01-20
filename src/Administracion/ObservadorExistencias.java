
package Administracion;

import Modelo.Bebida;
import java.math.BigInteger;

/**
 * Mantiene una referencia a un objeto SujetoBebida e Implementa la interfaz
 * Observador. Tambien define los métodos para responder a los mensajes recibidos del
 * sujeto.
 *
 */
public class ObservadorExistencias implements Observador {

    private String nombre;
    private int numeroExistenciasParaAlarma;
    private Sujeto sujetoObservado;

    /**
     * Constructor
     * 
     * @param nombre
     * @param numeroExistenciasParaAlarma
     * @param sujetoObservado 
     */
    public ObservadorExistencias(String nombre, int numeroExistenciasParaAlarma, Sujeto sujetoObservado) {
        this.nombre = nombre;
        this.numeroExistenciasParaAlarma = numeroExistenciasParaAlarma;
        this.sujetoObservado = sujetoObservado;
        sujetoObservado.añadirObservador(this);
    }
    
    /**
     * Metodo para actualizar los sujetos con cambios en el sujeto.
     * @return 
     */
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
