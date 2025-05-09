package ec.ups.edu.poo.ventanas.acciones;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterrupcionDeAccion implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent evento) {
        Component componente = (Component) evento.getSource();
        String accionRealizada = evento.getActionCommand();
        System.out.println("Componente: " + componente.getName() );
        System.out.println("Suceso: " + accionRealizada);
        System.out.println();
    }
}
