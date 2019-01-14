/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import java.util.List;

/**
 *
 * @author ernes
 */
public class AdaptadorImpresoraTXT implements Imprimir {
    private ImpresoraTXT impresora;

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
