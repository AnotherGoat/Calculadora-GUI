package guis;

import modelo.Calculadora;

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
        setSize(400, 200);
        // Iniciar en el centro
        setLocationRelativeTo(null);
        // Terminar el programa al salir de la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void iniciar(){
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));

        opcion1Button = new JButton("Calculadora simple");
        opcion2Button = new JButton("Calculadora científica");

        panel.add(opcion1Button);
        panel.add(opcion2Button);

        add(panel);

        // Implementación de ActionListener para el botón opcion1Button
        opcion1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                VentanaCalculadora vc = new VentanaCalculadora();
                vc.setVisible(true);
            }
        });

        // Implementación de ActionListener para el botón opcion2Button
        opcion2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                VentanaCalculadoraCientífica vcc = new VentanaCalculadoraCientífica();
                vcc.setVisible(true);
            }
        });
    }

}
