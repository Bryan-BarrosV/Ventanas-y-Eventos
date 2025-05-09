package ec.ups.edu.poo.ventanas.acciones;

import ec.ups.edu.poo.ventanas.adapters.EsquemaRaton;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ejemplo {
    public static void main(String[] args) {
        Frame miVentana = new Frame("Esquema de eventos");
        Panel miPanel = new Panel();
        Button botonHola = new Button("Saludo");
        Button botonAdios = new Button("Despedida");

        miPanel.add(botonHola);
        miPanel.add(botonAdios);

        miPanel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                e.getComponent().setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                e.getComponent().setBackground(Color.gray);
            }
        });


        miVentana.add(miPanel);
        miVentana.setSize(200, 100);
        miVentana.setVisible(true);
        EsquemaRaton esquema1 = new EsquemaRaton();
        botonHola.addMouseListener(new EsquemaRaton());
        botonAdios.addMouseListener(new EsquemaRaton());
    }
}