
package Impresion;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para manejar las impresiones en TXT.
 */
public class ImpresoraTXT {
    
    /**
     * Imprimir ticket en TXT
     * 
     * @param text 
     */
    public void printLinea(String text){
    PrintWriter writer;
        try {
            writer = new PrintWriter("ticket.txt", "UTF-8");
            writer.println(text);

writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImpresoraTXT.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ImpresoraTXT.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
