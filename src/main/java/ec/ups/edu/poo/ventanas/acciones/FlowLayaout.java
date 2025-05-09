package ec.ups.edu.poo.ventanas.acciones;

import ec.ups.edu.poo.ventanas.adapters.InterrupcionesDeRaton;
import ec.ups.edu.poo.ventanas.adapters.InterrupcionesDeVentana;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class FlowLayaout {
    public static void main(String[] args) {
        Frame miVentana = new Frame();
        Panel panelB = new Panel(new GridLayout(3, 1));
        Panel panelInferior = new Panel();
        TextField campoDeTexto = new TextField("Texto ");


        FlowLayout flowLayoutSuperior = new FlowLayout();
        FlowLayout flowLayoutPanelInferior = new FlowLayout(FlowLayout.LEFT);
        BorderLayout borderLayoutPrincipal = new BorderLayout();
        Label prototipo = new Label("Prototipo");
        Label etiquetaMensaje = new Label("Accion: ");

        prototipo.setSize(100, 100);
        Button miBotonA = new Button("Boton A");
        miBotonA.setName("Boton A 01");
        Button miBotonB = new Button("Boton B");
        miBotonB.setName("Boton B 02");
        Button miBotonC = new Button("Boton C");
        miBotonC.setName("Boton C 03");
        Button miBotonD = new Button("Boton D");
        miBotonD.setName("Boton D 04");
        Button botonSur = new Button("Sur");
        botonSur.setName("Boton Sur 05");
        Button botonEste = new Button("Este");
        botonEste.setName("Boton Este 06");
        Button botonOeste = new Button("Oeste");
        botonOeste.setName("Boton Oeste 07");
        Button botonCentro = new Button("Centro");
        botonCentro.setName("Boton Centro 08");
        Button botonAdios = new Button("Adios");
        botonAdios.setName("Boton Adios 09");

        panelB.setLayout(flowLayoutSuperior);
        panelB.add(miBotonA);
        panelB.add(miBotonB);
        panelB.add(miBotonC);
        panelB.add(miBotonD);

        Panel miPanel = new Panel();
        Button[] botones = new Button[6];
        for (int i = 0; i < 6; i++) {
            botones[i] = new Button("Opcion " + i);
            botones[i].setName("Opcion " + i + (i + 10));
            miPanel.add(botones[i]);
        }

        panelInferior.setLayout(flowLayoutPanelInferior);
        panelInferior.add(miPanel);
        panelInferior.add(prototipo);
        panelInferior.add(etiquetaMensaje);

        miVentana.setLayout(borderLayoutPrincipal);
        miVentana.add(panelB, BorderLayout.NORTH);
        miVentana.add(botonSur, BorderLayout.SOUTH);
        miVentana.add(botonEste, BorderLayout.EAST);
        miVentana.add(botonOeste, BorderLayout.WEST);
        miVentana.add(botonCentro, BorderLayout.CENTER);
        miVentana.add(panelInferior, BorderLayout.PAGE_END);

        MouseListener colorHandler = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent evento) {}
            @Override
            public void mousePressed(MouseEvent evento) {}

            @Override
            public void mouseReleased(MouseEvent evento) {}

            @Override
            public void mouseEntered(MouseEvent evento) {
                evento.getComponent().setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent evento) {
                evento.getComponent().setBackground(Color.gray);
            }
        };

        miBotonA.addMouseListener(colorHandler);
        miBotonB.addMouseListener(colorHandler);
        miBotonC.addMouseListener(colorHandler);
        miBotonD.addMouseListener(colorHandler);

        InterrupcionesDeRaton mensajeHandler = new InterrupcionesDeRaton(etiquetaMensaje);
        botonSur.addMouseListener(mensajeHandler);
        botonEste.addMouseListener(mensajeHandler);
        botonOeste.addMouseListener(mensajeHandler);
        botonCentro.addMouseListener(mensajeHandler);
        botonAdios.addMouseListener(mensajeHandler);
        for (Button boton : botones) {
            boton.addMouseListener(mensajeHandler);
        }

        panelInferior.add(campoDeTexto);
        miVentana.setSize(700, 600);
        miVentana.setTitle("Pruebas");
        miVentana.setVisible(true);
        miVentana.addWindowListener(new InterrupcionesDeVentana());

        miBotonA.addActionListener(new InterrupcionDeAccion());
        campoDeTexto.addActionListener(new InterrupcionDeAccion());
        botonAdios.addActionListener(new InterrupcionDeAccion());
    }
}