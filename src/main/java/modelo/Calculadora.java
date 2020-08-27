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

    /**
     * Suma 2 números
     * @return int con el resultado
     */
    public int sumar(){
        return numero1 + numero2;
    }

    /**
     * Resta 2 números
     * @return int con el resultado
     */
    public int restar(){
        return numero1 - numero2;
    }

    /**
     * Multiplica 2 números
     * @return int con el resultado
     */
    public int multiplicar(){
        return numero1 * numero2;
    }

    /**
     * Divide 2 números
     * @return int con el resultado
     */
    public int dividir(){
        return numero1 / numero2;
    }
}
