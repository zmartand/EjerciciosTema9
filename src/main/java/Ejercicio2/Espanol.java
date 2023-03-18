package Ejercicio2;

import javax.swing.*;

public class Espanol implements Traduccion {
    public String introducirDistancia() {
        return JOptionPane.showInputDialog("Introduzca la distancia recorrida (kilómetros).");
    }

    public String introducirTiempo() {
        return JOptionPane.showInputDialog("Introduzca el tiempo del recorrido (minutos).");
    }
    public void inicioRespuesta() {
        JOptionPane.showMessageDialog(null, "La velocidad media es:");
    }

    public void finRespuesta() {
        JOptionPane.showMessageDialog(null, "¡Gracias por utilizar nuestro programa!");
    }

    public void mostrarVelocidad(double velocidad) {
        JOptionPane.showMessageDialog(null, "Se ha desplazado a una velocidad de " + velocidad + " km/h.");
    }
}
