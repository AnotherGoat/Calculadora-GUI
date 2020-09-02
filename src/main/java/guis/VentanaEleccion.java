package guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaEleccion extends JFrame{

    //// Atributos
    /**
     * Panel principal
     */
    private JPanel panel;
    private JButton opcion1Button;
    private JButton opcion2Button;

    //// Constructores
    public VentanaEleccion(){
        iniciar();

        //// Otras características de la ventana
        // Título
        setTitle("Escoja el tipo de calculadora");
        // Tamaño inicial
        setSize(600, 400);
        // Iniciar en el centro
        setLocationRelativeTo(null);
        // Terminar el programa al salir de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciar(){
        panel = new JPanel();

        opcion1Button = new JButton("Calculadora simple");
        opcion2Button = new JButton("Calculadora científica");

        panel.add(opcion1Button);
        panel.add(opcion2Button);

        add(panel);
    }

}
