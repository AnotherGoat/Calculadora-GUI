package guis;

import modelo.Calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Clase que contiene la ventana de la calculadora
 */
public class VentanaCalculadora extends JFrame{

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

        labelNumero1 = new JLabel();
        labelNumero1.setText("Número 1:");

        labelNumero2 = new JLabel();
        labelNumero2.setText("Número 2:");

        labelResultado = new JLabel();
        labelResultado.setText("Resultado:");

        textFieldNumero1 = new JTextField(10);
        textFieldNumero2 = new JTextField(10);
        textFieldResultado = new JTextField(10);

        sumarButton = new JButton();
        sumarButton.setText("Sumar");

        salirButton = new JButton();
        salirButton.setText("Salir");

        limpiarButton = new JButton();
        limpiarButton.setText("Limpiar");

        // Se agregan elementos al panel
        panel.add(labelNumero1);
        panel.add(textFieldNumero1);
        panel.add(labelNumero2);
        panel.add(textFieldNumero2);
        panel.add(labelResultado);
        panel.add(textFieldResultado);
        panel.add(sumarButton);
        panel.add(limpiarButton);
        panel.add(salirButton);

        // Agregar panel a la ventana
        this.add(panel);

        // Implementación de ActionListener en el botón sumarButton
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora c;
                int num1 = Integer.parseInt(textFieldNumero1.getText());
                int num2 = Integer.parseInt(textFieldNumero2.getText());

                c = new Calculadora(num1, num2);

                int resultado = c.sumar();

                textFieldResultado.setText(""+resultado);
            }
        });
    }


    public void actionPerformed(ActionEvent ae){

    }
}
