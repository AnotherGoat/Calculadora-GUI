package utilidades;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Esta clase tiene todos los métodos para validar y recibir entrada
 */
public class Validador {

    //// Atributos
    /**
     * Scanner para recibir entrada por teclado;
     */
    private Scanner teclado;

    //// Constructores
    /**
     * Constructor de clase Validador (instancia su Scanner cada vez para evitar errores)
     */
    public Validador() {
        this.teclado = new Scanner(System.in);
    }

    //// Métodos
    /**
     * Verifica que un String ingresado puede ser convertido a double sin tirar ninguna excepción
     * @param entrada String que contiene la entrada del usuario
     * @return Un boolean que indica si la entrada es double (true) o no (false)
     */
    public boolean esDouble(String entrada) {
        // Si la entrada es nula, retornar false automáticamente
        if(entrada == null){
            return false;
        }

        else {
            try {
                // Intenta convertir el String a un double
                double i = Integer.parseInt(entrada);
            } catch (NumberFormatException nfe) {
                // Si la conversión tira un error
                return false;
            }
        }
        return true;
    }
}
