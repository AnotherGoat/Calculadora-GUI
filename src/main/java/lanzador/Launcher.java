package lanzador;

import guis.VentanaCalculadora;
import guis.VentanaEleccion;

/**
 * Clase que lanza el programa
 */
public class Launcher {
    public static void main(String[] args){
        VentanaEleccion ve = new VentanaEleccion();
        ve.setVisible(true);
    }
}
