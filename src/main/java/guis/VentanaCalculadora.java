package guis;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Clase que contiene la ventana de la calculadora
 */
public class VentanaCalculadora extends JFrame implements ActionListener{

    //// Atributos
    /**
     * Panel principal
     */
    private JPanel panel;
    /**
     * Botón para realizar una suma
     */
    private JButton sumarButton;
    /**
     * Botón para realizar una resta
     */
    private JButton restarButton;
    /**
     * Botón para realizar una multiplicación
     */
    private JButton multiplicarButton;
    /**
     * Botón para realizar una división
     */
    private JButton dividirButton;
    /**
     * Botón para limpiar los números ingresados
     */
    private JButton limpiarButton;
    /**
     * Botón para salir del programa
     */
    private JButton salirButton;
    /**
     * Label con el texto "Número 1:"
     */
    private JLabel labelNumero1;
    /**
     * Label con el texto "Número 2:"
     */
    private JLabel labelNumero2;
    /**
     * Label con el texto "Resultado:"
     */
    private JLabel labelResultado;
    /**
     * TextField donde se ingresa el número 1
     */
    private JTextField textFieldNumero1;
    /**
     * TextField donde se ingresa el número 2
     */
    private JTextField textFieldNumero2;
    /**
     * TextField donde se muestra el resultado
     */
    private JTextField textFieldResultado;

    //// Constructor
    public VentanaCalculadora(){
        iniciarVentanaCalculadora();

        //// Otras características de la ventana
        // Tamaño inicial
        setSize(600, 400);
        // Iniciar en el centro
        setLocationRelativeTo(null);
        // Terminar el programa al salir de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //// Métodos
    private void iniciarVentanaCalculadora(){
        panel = new JPanel();
        
    }


    public void actionPerformed(ActionEvent ae){

    }
}
