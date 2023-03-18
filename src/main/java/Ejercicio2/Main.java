package Ejercicio2;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Traduccion traduccion = seleccionarTraduccion();

        double distancia = Double.parseDouble(traduccion.introducirDistancia());
        double tiempo = Double.parseDouble(traduccion.introducirTiempo());
        double velocidad = (distancia / tiempo) * 60;

        traduccion.inicioRespuesta(velocidad);
        traduccion.finRespuesta();
    }

    private static Traduccion seleccionarTraduccion() {
        String idioma = JOptionPane.showInputDialog("Elija un idioma (Español o Ingles) \nSelect a language (Spanish or English):");
        switch (idioma.toLowerCase()) {
            case "spanish":
            case "español":
                return new Espanol();
            case "english":
            case "inglés":
                return new Ingles();
            default:
                JOptionPane.showMessageDialog(null, "Invalid language, using English by default.");
                return new Ingles();
        }
    }
}
