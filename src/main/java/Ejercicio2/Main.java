package Ejercicio2;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
            double distancia, tiempo, velocidad; //Declaramos las 3 variables necesarias para calcular la velocidad
            distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la distancia recorrida (kilometros).")); //Pedimos al usuario que introduzca la distancia recorrida en km
            tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tiempo del recorrido (minutos).")); //Pedimos al usuario que introduzca el tiempo del recorrido en minutos
            velocidad = (distancia / tiempo) * 60;//Realizamos el cálculo de la velocidad y los minutos los pasamos a horas para que el resultado final sea en km/h
            JOptionPane.showMessageDialog(null, "Se ha desplazado a una velocidad de " + velocidad + " km/h."); //Informamos sobre el resultado
        }

}
