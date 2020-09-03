package modelo;

public class CalculadoraCientifica extends Calculadora {

    //// Atributos

    //// Constructores
    public CalculadoraCientifica(double numero1, double numero2) {
        super(numero1, numero2);
    }

    //// Métodos
    /**
     * Calcula la potencia entre 2 números
     * @return double con el resultado
     */
    public double potencia(){
        return Math.pow(numero1, numero2);
    }

    /**
     * Calcula la raíz entre 2 números
     * @return double con el resultado
     */
    public double raiz(){
        return Math.pow(numero1, 1/numero2);
    }
}
