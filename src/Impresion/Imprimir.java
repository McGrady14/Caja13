
package Impresion;

import java.util.List;

/**
 * Interface para manejar las impresiones.
 */
public interface Imprimir {
    
    /**
     * Devuelve las impresoras instaladas en el sistema.
     * 
     * @return Lista de impresoras 
     */
    public List<String> getImpresoras();
    
    /**
     * Imprimir ticket con un parametro de tipo String
     * 
     * @param texto 
     */
    public void printTexto(String texto);
    
    /**
     * Imprimir ticket con un parametro de tipo Bytes
     * 
     * @param texto 
     */
    public void printBytes(byte[] bytes);
    
}
