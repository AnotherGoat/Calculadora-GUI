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

    //// Constructores
    public Calculadora(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

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

    // Getters y Setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
