package modelo;

/**
 * Clase que contiene todos los métodos de la calculadora
 */
public class Calculadora {

    //// Atributos
    /**
     * Primer número
     */
    protected double numero1;
    /**
     * Segundo número
     */
    protected double numero2;

    //// Constructores
    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //// Métodos
    /**
     * Suma 2 números
     * @return double con el resultado
     */
    public double sumar(){
        return numero1 + numero2;
    }

    /**
     * Resta 2 números
     * @return double con el resultado
     */
    public double restar(){
        return numero1 - numero2;
    }

    /**
     * Multiplica 2 números
     * @return double con el resultado
     */
    public double multiplicar(){
        return numero1 * numero2;
    }

    /**
     * Divide 2 números
     * @return double con el resultado
     */
    public double dividir(){
        return numero1 / numero2;
    }

    // Getters y Setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}
