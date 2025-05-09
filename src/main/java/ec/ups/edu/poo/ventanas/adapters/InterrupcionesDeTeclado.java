package ec.ups.edu.poo.ventanas.adapters;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InterrupcionesDeTeclado extends KeyAdapter {
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.print(e.getKeyChar());
        if (e.getKeyChar() == 'x') {
            System.exit(0);
        }
    }
}