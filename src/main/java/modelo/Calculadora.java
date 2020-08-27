package modelo;

/**
 * Clase que contiene todos los métodos de la calculadora
 */
public class Calculadora {

    //// Atributos
    /**
     * Primer número
     */
    private int numero1;
    /**
     * Segundo número
     */
    private int numero2;

    //// Métodos
    public int sumar(int numero1, int numero2){
        return numero1 + numero2;
    }

    public int restar(int numero1, int numero2){
        return numero1 - numero2;
    }

    public int multiplicar(int numero1, int numero2){
        return numero1 * numero2;
    }

    public int dividir(int numero1, int numero2){
        return numero1 / numero2;
    }
}
