package ec.ups.edu.poo.ventanas.acciones;

import ec.ups.edu.poo.ventanas.adapters.InterrupcionesDeEnfoque;

import java.awt.*;

public class Ejemplo3 {
    public static void main(String[] args) {
        Frame miVentana= new Frame("Prueba eventos de enfoque");
        Panel miPanel= new Panel();
        Button boton1 = new Button("Componente 1");
        Button boton2 = new Button("Componente 2");
        miPanel.add(boton1);
        miPanel.add(boton2);
        miVentana.add(miPanel);
        miVentana.setSize(300, 200);
        miVentana.setVisible(true);
        boton2.addFocusListener(new InterrupcionesDeEnfoque());
    }
}
