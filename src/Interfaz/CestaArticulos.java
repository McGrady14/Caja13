/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Articulo;
import Modelo.Bebida;
import java.util.ArrayList;

/**
 *
 * @author ernes
 */
public class CestaArticulos {
    
    private static ArrayList<Articulo> cesta;
    private static ArrayList<Bebida> cestaBebida;
    
    public CestaArticulos() {
        cesta = new ArrayList();
        cestaBebida = new ArrayList();
    }

    public static ArrayList<Articulo> getCesta() {
        return cesta;
    }

    public static void setCesta(ArrayList<Articulo> cesta) {
        CestaArticulos.cesta = cesta;
    }

    public static ArrayList<Bebida> getCestaBebida() {
        return cestaBebida;
    }
    
    
    
}
