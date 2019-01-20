/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Bebida;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import Creacion.Singleton;


/**
 *
 * @author ernes
 */
public class PanelBotones extends javax.swing.JPanel {

    private final CestaArticulos cesta;
    //private final int tipo;
    private JButton botones[];
    private int numBotones;

    public PanelBotones(CestaArticulos cesta) {
        super();                    // usamos el contructor de la clase padre JFrame
        this.cesta = cesta;
        //this.tipo = tipo;
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setSize(1060, 144);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLayout(new GridLayout(0, 7));                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
    }

    private void inicializarComponentes() {
        this.numBotones = numeroBotones();
        initBotones();
    }

    public void initBotones() {
        
        Font fontBoton = new Font("Verdana", Font.BOLD, 15);
        botones = new JButton[numBotones];

        Singleton singleton = Singleton.getInstancia();
        List<Bebida> List = singleton.getBebidas();

        for (Bebida B : List) {
            int i = 0;
            botones[i] = new JButton("<html>" + B.getEtiqueta() + " </html>");
            botones[i].setFont(fontBoton);
            this.add(botones[i]);
            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ActionEvent) {
                    agregarArticulo(List.indexOf(B));
                }
            });
            i++;

        }

    }

    private void agregarArticulo(int Indice) {
        Singleton singleton = Singleton.getInstancia();
        List<Bebida> List = singleton.getBebidas();
        CestaArticulos.getCestaBebida().add(List.get(Indice));
        PantallaInicio.refrescarPantalla();

    }

    private int numeroBotones() {
        Singleton singleton = Singleton.getInstancia();
        List<Bebida> List = singleton.getBebidas();
        int auxBotones;
        auxBotones = List.size();
        return auxBotones;
    }

}
