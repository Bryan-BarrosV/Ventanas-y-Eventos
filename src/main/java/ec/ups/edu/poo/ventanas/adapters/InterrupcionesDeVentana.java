package ec.ups.edu.poo.ventanas.adapters;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class InterrupcionesDeVentana implements WindowListener {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana "+ e.getWindow().getName() + " abierta");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Si pulsas aquise cierra la ventana "+ e.getWindow().getName());
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana "+ e.getWindow().getName()
                + " cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}