package ec.ups.edu.poo.ventanas;

import java.awt.Frame;
import java.awt.Button;
import java.awt.Panel;

public class Panel1 {
    public static void main(String[] args) {
        Frame MiMarco = new Frame();
        Panel PanelPrincipal = new Panel();
        Panel PanelIzq = new Panel();
        Panel PanelDcha = new Panel();

        Button BotonCorrer = new Button("Correr");
        Button BotonSaltar = new Button("Saltar");
        Button BotonDescansar = new Button("Descansar");

        MiMarco.add(PanelPrincipal);
        PanelPrincipal.add(PanelIzq);
        PanelPrincipal.add(PanelDcha);
        PanelDcha.add(BotonCorrer);
        PanelDcha.add(BotonSaltar);
        PanelDcha.add(BotonDescansar);

        MiMarco.setSize(400, 200);
        MiMarco.setTitle("Ventana con paneles");
        MiMarco.setVisible(true);
    }
}