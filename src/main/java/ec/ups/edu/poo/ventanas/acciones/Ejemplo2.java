package ec.ups.edu.poo.ventanas.acciones;

import java.awt.*;
public class Ejemplo2 {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Prueba eventos de acción");
        Panel miPanel = new Panel(new GridLayout(3, 1));
        Button boton = new Button("Etiqueta del boton");
        TextField campoDeTexto = new TextField("Texto del campo 8");
        List lista = new List(3);
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");
        miPanel.add(boton);
        miPanel.add(campoDeTexto);
        miPanel.add(lista);
        boton.addActionListener(new InterrupcionDeAccion());
        campoDeTexto.addActionListener(new InterrupcionDeAccion());
        lista.addActionListener(new InterrupcionDeAccion());
        miVentana.add(miPanel);
        miVentana.setSize(400, 200);
        miVentana.setVisible(true);
    }
}
