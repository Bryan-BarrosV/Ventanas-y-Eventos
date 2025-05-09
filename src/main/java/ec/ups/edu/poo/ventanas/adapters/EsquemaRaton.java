package ec.ups.edu.poo.ventanas.adapters;
import java.awt.event.*;
import java.awt.Color;

public class  EsquemaRaton implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent evento) {
    }
    @Override
    public void mousePressed(MouseEvent evento) {
    }
    @Override
    public void mouseReleased(MouseEvent evento) {
    }
    @Override
    public void mouseEntered(MouseEvent evento) {
        evento.getComponent().setBackground(Color.red);
    }
    @Override
    public void mouseExited(MouseEvent evento) {
        evento.getComponent().
                setBackground(Color.gray);
    }
}