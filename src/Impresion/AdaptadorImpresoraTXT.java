
package Impresion;

import Modelo.Ticket;
import java.util.List;

/**
 * Clase para adaptar la clase impresoraTXT
 * 
 */
public class AdaptadorImpresoraTXT implements Imprimir {
    /**
     * Impresora TXT
     */
    private ImpresoraTXT impresora;

    /**
     * Constructor
     * 
     * @param impresora 
     */
    public AdaptadorImpresoraTXT(ImpresoraTXT impresora) {
        this.impresora = impresora;
    }
    
    
    @Override
    public List<String> getImpresoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printTexto(String texto) {
        impresora.printLinea(texto);
    }

    @Override
    public void printBytes(byte[] bytes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
