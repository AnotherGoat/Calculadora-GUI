package guis;

import modelo.Calculadora;
import utilidades.Validador;

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
    protected JPanel panel;
    /**
     * Botón para realizar una suma
     */
    protected JButton sumarButton;
    /**
     * Botón para realizar una resta
     */
    protected JButton restarButton;
    /**
     * Botón para realizar una multiplicación
     */
    protected JButton multiplicarButton;
    /**
     * Botón para realizar una división
     */
    protected JButton dividirButton;
    /**
     * Botón para limpiar los números ingresados
     */
    protected JButton limpiarButton;
    /**
     * Botón para salir del programa
     */
    protected JButton salirButton;
    /**
     * Label con el texto "Número 1:"
     */
    protected JLabel labelNumero1;
    /**
     * Label con el texto "Número 2:"
     */
    protected JLabel labelNumero2;
    /**
     * Label con el texto "Resultado:"
     */
    protected JLabel labelResultado;
    /**
     * TextField donde se ingresa el número 1
     */
    protected JTextField textFieldNumero1;
    /**
     * TextField donde se ingresa el número 2
     */
    protected JTextField textFieldNumero2;
    /**
     * TextField donde se muestra el resultado
     */
    protected JTextField textFieldResultado;
    /**
     * Se usa para validar la entrada
     */
    protected Validador v;

    //// Constructores
    public VentanaCalculadora(){
        iniciar();

        //// Otras características de la ventana
        // Título
        setTitle("Calculadora VM");
        // Tamaño inicial
        setSize(640, 300);
        // Iniciar en el centro
        setLocationRelativeTo(null);
        // Terminar el programa al salir de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //// Métodos
    protected void iniciar(){
        panel = new JPanel();

        labelNumero1 = new JLabel("Número 1:");
        labelNumero2 = new JLabel("Número 2:");
        labelResultado = new JLabel("Resultado:");

        textFieldNumero1 = new JTextField(12);
        textFieldNumero2 = new JTextField(12);
        textFieldResultado = new JTextField(12);
        textFieldResultado.setEditable(false);

        sumarButton = new JButton("Sumar");
        restarButton = new JButton("Restar");
        multiplicarButton = new JButton("Multiplicar");
        dividirButton = new JButton("Dividir");
        limpiarButton = new JButton("Limpiar");
        salirButton = new JButton("Salir");

        // Se agregan elementos al panel
        panel.add(labelNumero1);
        panel.add(textFieldNumero1);
        panel.add(labelNumero2);
        panel.add(textFieldNumero2);
        panel.add(labelResultado);
        panel.add(textFieldResultado);
        panel.add(sumarButton);
        panel.add(restarButton);
        panel.add(multiplicarButton);
        panel.add(dividirButton);
        panel.add(limpiarButton);
        panel.add(salirButton);

        // Agregar panel a la ventana
        this.add(panel);

        // Implementación de ActionListener para el botón sumarButton
        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Si el texto no se puede convertir a double
                if(!v.esDouble(textFieldNumero1.getText()) || !v.esDouble(textFieldNumero1.getText())){
                    textFieldResultado.setText("ERROR");
                }

                else {
                    Calculadora c;
                    double num1 = Double.parseDouble(textFieldNumero1.getText());
                    double num2 = Double.parseDouble(textFieldNumero2.getText());

                    c = new Calculadora(num1, num2);

                    double resultado = c.sumar();

                    textFieldResultado.setText("" + resultado);
                }
            }
        });

        // Implementación de ActionListener para el botón restarButton
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Si el texto no se puede convertir a double
                if(!v.esDouble(textFieldNumero1.getText()) || !v.esDouble(textFieldNumero1.getText())){
                    textFieldResultado.setText("ERROR");
                }

                else {
                    Calculadora c;
                    double num1 = Double.parseDouble(textFieldNumero1.getText());
                    double num2 = Double.parseDouble(textFieldNumero2.getText());

                    c = new Calculadora(num1, num2);

                    double resultado = c.restar();

                    textFieldResultado.setText("" + resultado);
                }
            }
        });

        // Implementación de ActionListener para el botón multiplicarButton
        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Si el texto no se puede convertir a double
                if(!v.esDouble(textFieldNumero1.getText()) || !v.esDouble(textFieldNumero1.getText())){
                    textFieldResultado.setText("ERROR");
                }

                else {
                    Calculadora c;
                    double num1 = Double.parseDouble(textFieldNumero1.getText());
                    double num2 = Double.parseDouble(textFieldNumero2.getText());

                    c = new Calculadora(num1, num2);

                    double resultado = c.multiplicar();

                    textFieldResultado.setText("" + resultado);
                }
            }
        });

        // Implementación de ActionListener para el botón dividirButton
        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Si el texto no se puede convertir a double
                if(!v.esDouble(textFieldNumero1.getText()) || !v.esDouble(textFieldNumero1.getText())){
                    textFieldResultado.setText("ERROR");
                }

                else {
                    Calculadora c;
                    double num1 = Double.parseDouble(textFieldNumero1.getText());
                    double num2 = Double.parseDouble(textFieldNumero2.getText());

                    c = new Calculadora(num1, num2);

                    double resultado = c.dividir();

                    textFieldResultado.setText("" + resultado);
                }
            }
        });

        // Implementación de ActionListener para el botón limpiarButton
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldNumero1.setText("");
                textFieldNumero2.setText("");
                textFieldResultado.setText("");
            }
        });

        // Implementación de ActionListener para el botón salirButton
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crea el panel para pedir confirmación
                int n = JOptionPane.showConfirmDialog(panel.getParent(),
                        "¿Está seguro de que desea salir?",
                        "Salir del programa",
                        JOptionPane.YES_NO_OPTION);

                // Si el usuario escoge "Sí"
                if(n == JOptionPane.YES_OPTION){
                    // Sale del programa y retorna 0
                    System.exit(0);
                }
            }
        });

    }


    public void actionPerformed(ActionEvent ae){

    }
}
