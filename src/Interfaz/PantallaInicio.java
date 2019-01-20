/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Modelo.Articulo;
import Modelo.Bebida;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ernes
 */
public class PantallaInicio extends JFrame {

    
    private static DecimalFormat df;
    private static DefaultListModel listaArticulos;

    private static CestaArticulos cesta;
    private static JList listaCesta;
    private PanelBotones bebidas, bocatas, montados, otros, mojitos;
    private static JButton confBoton, vueltaBoton, imprimirMojitoBoton, imprimirBoton, terminarBoton, borrarBoton, cancelarBoton;
    private JLabel textoTotal, textoEfectivo;
    private static JTextField cajaPrecio, cajaPago, cajaVuelta;

    public PantallaInicio(CestaArticulos cesta) {
        super();                    // usamos el contructor de la clase padre JFrame
        PantallaInicio.cesta = cesta;
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
    }

    private void configurarVentana() {
        this.setTitle("Caja de la caseta 13 Rosas");                   // colocamos titulo a la ventana
        this.setSize(1280, 800);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(true);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }

    private void inicializarComponentes() {
        df = new DecimalFormat("#.##");
        listaArticulos = new DefaultListModel();

        iniciarPaneles();

        iniciarLista();

        iniciarBotones();
        iniciarTextos();
        iniciarCajas();

    }

    private void iniciarBoton(Font fontBoton, JButton boton, int pos1, int pos2, int pos3, int pos4, String texto, Boolean enabled) {
        boton.setBounds(pos1, pos2, pos3, pos4);
        boton.setText(texto);
        boton.setFont(fontBoton);
        boton.setEnabled(enabled);
        this.add(boton);

    }

    private void iniciarBotones() {
        Font fontBoton = new Font("Verdana", Font.BOLD, 15);

        imprimirBoton = new JButton();
        iniciarBoton(fontBoton, imprimirBoton, 1080, 10, 200, 30, "IMPRIMIR", false);
        imprimirBoton.addActionListener((ActionEvent e) -> {
           // imprimir();
        });

        imprimirMojitoBoton = new JButton();
        iniciarBoton(fontBoton, imprimirMojitoBoton, 1080, 40, 200, 30, "IMP.MOJITO", false);
        imprimirMojitoBoton.addActionListener((ActionEvent e) -> {
           // imprimirMojito();
        });

        borrarBoton = new JButton();
        iniciarBoton(fontBoton, borrarBoton, 1080, 550, 100, 30, "ELIM", false);
        borrarBoton.addActionListener((ActionEvent e) -> {
           // borrarArticulo();
        });

        vueltaBoton = new JButton();
        iniciarBoton(fontBoton, vueltaBoton, 1080, 670, 100, 30, "Vuelta:", true);
        vueltaBoton.addActionListener((ActionEvent e) -> {
          //  calcular();
        });

        cancelarBoton = new JButton();
        iniciarBoton(fontBoton, cancelarBoton, 1180, 550, 100, 30, "CANC", false);
        cancelarBoton.addActionListener((ActionEvent e) -> {
           // cancelar();
        });

        terminarBoton = new JButton();
        iniciarBoton(fontBoton, terminarBoton, 1080, 70, 200, 30, "Terminar", false);
        terminarBoton.addActionListener((ActionEvent e) -> {
            //terminar();
        });

        confBoton = new JButton();
        iniciarBoton(fontBoton, confBoton, 1080, 720, 200, 30, "CONFIGURACION", true);
        confBoton.addActionListener((ActionEvent e) -> {
           // PantallaConfiguracion configuracion = new PantallaConfiguracion(sisGes);      // creamos una ventana
           // configuracion.setVisible(true);
        });
    
    }
    
    
        

    private void iniciarPaneles() {
        bebidas = new PanelBotones(cesta);
        bebidas.setBounds(10, 10, 1060, 144);
        this.add(bebidas);
        /*
        bocatas = new PanelBotones(sisGes, 1);
        bocatas.setBounds(10, 164, 1060, 144);
        this.add(bocatas);

        montados = new PanelBotones(sisGes, 2);
        montados.setBounds(10, 318, 1060, 144);
        this.add(montados);

        otros = new PanelBotones(sisGes, 3);
        otros.setBounds(10, 472, 1060, 144);
        this.add(otros);

        mojitos = new PanelBotones(sisGes, 4);
        mojitos.setBounds(10, 626, 1060, 144);
        this.add(mojitos);
         */
    } //Metodo que inicia los paneles con los articulos

    public static void refrescarPantalla() {
        listaArticulos.clear();
        imprimirBoton.setEnabled(false);
        imprimirMojitoBoton.setEnabled(false);
        borrarBoton.setEnabled(false);
        cancelarBoton.setEnabled(false);
        terminarBoton.setEnabled(false);
        for (int i = 0; i < cesta.getCestaBebida().size(); i++) {
            listaArticulos.addElement(cesta.getCestaBebida().get(i).getEtiqueta());
            imprimirBoton.setEnabled(true);
            borrarBoton.setEnabled(true);
            cancelarBoton.setEnabled(true);
            terminarBoton.setEnabled(true);
        }
        listaCesta.setModel(listaArticulos);

        double importe = 0;
        for (Bebida B : cesta.getCestaBebida()) {
            importe = importe + B.getIdArticulo().getPrecio().doubleValue();

        }

        cajaPrecio.setText(df.format(importe));
        if (cajaPago.getText().isEmpty() == false) {

            double vuelta = Double.parseDouble(cajaPago.getText()) - importe;
            cajaVuelta.setText(df.format((vuelta)));
            if (vuelta < 0) {
                cajaVuelta.setText("ERROR");
                terminarBoton.setEnabled(false);
            }
        }
    } //Metodo que pinta en pantalla los elementos de la cesta y sy valor

    private void iniciarLista() {
        Font fontLista = new Font("Verdana", Font.BOLD, 15);
        listaCesta = new JList();
        listaCesta.setBounds(1080, 100, 200, 450);
        listaCesta.setFont(fontLista);
        this.add(listaCesta);
    }

    private void iniciarTextos() {
        Font fontTexto = new Font("Verdana", Font.BOLD, 16);

        textoTotal = new JLabel();
        textoTotal.setText("TOTAL: ");    // colocamos un texto a la etiqueta
        textoTotal.setBounds(1080, 590, 100, 30);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        textoTotal.setFont(fontTexto);
        this.add(textoTotal);

        textoEfectivo = new JLabel();
        textoEfectivo.setText("EFECTIVO:");    // colocamos un texto a la etiqueta
        textoEfectivo.setBounds(1080, 630, 100, 30);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        textoEfectivo.setFont(fontTexto);
        this.add(textoEfectivo);
    }

    private void iniciarCajas() {
        Font fontPrecio = new Font("Verdana", Font.BOLD, 18);
        cajaPrecio = new JTextField();
        cajaPrecio.setBounds(1180, 590, 150, 30);
        cajaPrecio.setFont(fontPrecio);
        cajaPrecio.setEditable(false);
        this.add(cajaPrecio);

        cajaPago = new JTextField();
        cajaPago.setFont(fontPrecio);
        cajaPago.setBounds(1180, 630, 150, 30);
        this.add(cajaPago);

        cajaVuelta = new JTextField();
        cajaVuelta.setFont(fontPrecio);
        cajaVuelta.setBounds(1180, 670, 150, 30);
        cajaVuelta.setEditable(false);
        this.add(cajaVuelta);
    }

}
