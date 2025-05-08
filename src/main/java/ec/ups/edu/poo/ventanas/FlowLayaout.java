package ec.ups.edu.poo.ventanas;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.GridLayout;

public class FlowLayaout {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel panelB = new Panel();
        Panel panelInferior = new Panel(); // Nuevo panel para miPanel y Label
        FlowLayout flowLayoutSuperior = new FlowLayout();
        FlowLayout flowLayoutPanelInferior = new FlowLayout(FlowLayout.LEFT);
        BorderLayout borderLayoutPrincipal = new BorderLayout();
        Label prototipo = new Label("Prototipo");
        GridLayout matriz = new GridLayout(2, 3);

        prototipo.setSize(100, 100);
        Button miBotonA = new Button("Boton A");
        Button miBotonB = new Button("Boton B");
        Button miBotonC = new Button("Boton C");
        Button miBotonD = new Button("Boton D");
        Button botonSur = new Button("Sur");
        Button botonEste = new Button("Este");
        Button botonOeste = new Button("Oeste");
        Button botonCentro = new Button("Centro");

        panelB.setLayout(flowLayoutSuperior);
        panelB.add(miBotonA);
        panelB.add(miBotonB);
        panelB.add(miBotonC);
        panelB.add(miBotonD);

        Panel miPanel = new Panel();
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++) {
            botones[i] = new Button("Opcion " + i);
        }
        miPanel.setLayout(matriz);
        for (int i = 0; i < 6; i++) {
            miPanel.add(botones[i]);
        }

        panelInferior.setLayout(flowLayoutPanelInferior);
        panelInferior.add(miPanel);
        panelInferior.add(prototipo);

        miVentana.setLayout(borderLayoutPrincipal);
        miVentana.add(panelB, BorderLayout.NORTH);
        miVentana.add(botonSur, BorderLayout.SOUTH);
        miVentana.add(botonEste, BorderLayout.EAST);
        miVentana.add(botonOeste, BorderLayout.WEST);
        miVentana.add(botonCentro, BorderLayout.CENTER);
        miVentana.add(panelInferior, BorderLayout.PAGE_END);

        miVentana.setSize(500, 400);
        miVentana.setTitle("Pruebas");
        miVentana.setVisible(true);
    }
}