/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import Modelo.Ticket;
import java.util.List;

/**
 * Clase para adaptar la clase ImpresoraDeCalor
 * 
 */
public class AdaptadorImpresoraCalorPOS58 implements Imprimir {

    /**
     * Impresora de calor
     */
    private ImpresoraCalor impresora;
    
    /**
     * Constructor
     * 
     * @param impresora 
     */    
    public AdaptadorImpresoraCalorPOS58(ImpresoraCalor impresora) {
        this.impresora = impresora;
    }
    
    @Override
    public List<String> getImpresoras() {
        return impresora.getPrinters();
    }

    @Override
    public void printTexto(String texto) {
        impresora.printString("POS-58", texto);
    }

    @Override
    public void printBytes(byte[] bytes) {
        impresora.printBytes("POS-58", bytes);
    }
    
}
