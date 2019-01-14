/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Impresion;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ernes
 */
public class ImpresoraTXT {
    
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
