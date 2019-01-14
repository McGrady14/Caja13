/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestFacade;

import Impresion.AdaptadorImpresoraTXT;
import Impresion.ImpresoraTXT;
import Impresion.Imprimir;

/**
 *
 * @author ernes
 */
public class ImpresionTest {
    
    
    public static void main(String[] args){
        
        Imprimir impresora = new AdaptadorImpresoraTXT(new ImpresoraTXT());    
        impresora.printTexto("Hola");
    }
}
