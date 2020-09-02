package guis;

import modelo.Calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanaCalculadoraCientífica extends VentanaCalculadora {

    //// Atributos
    /**
     * Botón para realizar una potencia
     */
    private JButton potenciaButton;
    /**
     * Botón para realizar una raíz
     */
    private JButton raizButton;

    //// Constructores
    public VentanaCalculadoraCientífica(){
        iniciar();
    }

    public void iniciar(){
        super.iniciar();

        panel.remove(limpiarButton);
        panel.remove(salirButton);

        potenciaButton = new JButton("Potencia (n1^n2)");
        raizButton = new JButton("Raíz n2-ésima");

        panel.add(potenciaButton);
        panel.add(raizButton);
        panel.add(limpiarButton);
        panel.add(salirButton);

        // Implementación de ActionListener para el botón potenciaButton
        potenciaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora c;
                int num1 = Integer.parseInt(textFieldNumero1.getText());
                int num2 = Integer.parseInt(textFieldNumero2.getText());

                c = new Calculadora(num1, num2);

                int resultado = c.potencia();

                textFieldResultado.setText(""+resultado);
            }
        });

        // Implementación de ActionListener para el botón raizButton
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Calculadora c;
                int num1 = Integer.parseInt(textFieldNumero1.getText());
                int num2 = Integer.parseInt(textFieldNumero2.getText());

                c = new Calculadora(num1, num2);

                int resultado = c.raiz();

                textFieldResultado.setText(""+resultado);
            }
        });
    }
}
