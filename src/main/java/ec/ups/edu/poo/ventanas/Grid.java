package ec.ups.edu.poo.ventanas;

import java.awt.GridLayout;
import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class Grid {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel miPanel = new Panel();
        GridLayout matriz = new GridLayout(2, 3);
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++) {
            botones[i] = new Button("Opcion " + i);
        }
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++) {
            miPanel.add(botones[i]);
        }
        miVentana.add(miPanel);
        miVentana.setSize(500, 300);
        miVentana.setTitle("Ventana Gestion de Compras");
        miVentana.setVisible(true);
    }
}