package ec.ups.edu.poo.ventanas.adapters;

import java.awt.*;
public class Ejemplo2 {
    public static void main(String[] args) {
        Frame miVentana= new Frame("Prueba eventos de ventana");
        miVentana.setSize(200, 100);
        miVentana.setVisible(true);
        Frame otraVentana= new Frame("Prueba eventos de ventana");
        otraVentana.setSize(100, 50);
        otraVentana.setLocation(200, 0);
        otraVentana.setVisible(true);
        miVentana.addWindowListener(new InterrupcionesDeVentana());
        otraVentana.addWindowListener(new InterrupcionesDeVentana());
    }
}