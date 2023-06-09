package Ejercicio2;

import javax.swing.*;

public class Ingles implements Traduccion {
    public String introducirDistancia() {
        return JOptionPane.showInputDialog("Enter the distance traveled (kilometers).");
    }

    public String introducirTiempo() {
        return JOptionPane.showInputDialog("Enter the time of the trip (minutes).");
    }

    public void inicioRespuesta(double velocidad) {
        JOptionPane.showMessageDialog(null, "You have traveled at a speed of " + velocidad + " km/h.");
    }

    public void finRespuesta() {
        JOptionPane.showMessageDialog(null, "Thank you for using our program!");
    }
}

