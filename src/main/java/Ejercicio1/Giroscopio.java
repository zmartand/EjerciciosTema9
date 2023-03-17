package Ejercicio1;

import java.time.LocalDate;

public class Giroscopio extends Ciclo {
    //atributo
    private int autonomia;
    //constructor
    public Giroscopio(String marca, String modelo, LocalDate fechaFabricacion, int autonomia) {
        super(marca, modelo, fechaFabricacion);
        this.autonomia = autonomia;
    }
    //metodos
    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public int getAutonomia() {
        return autonomia;
    }
    public double getAlquilerHora() {
        return 29.90;
    }
    public String toString(){
        int horas = getAutonomia() / 60;
        int minutos = getAutonomia() % 60;
        return String.format("- Giroscopio %s %d km de autonomía %s%.2f/hora",
                super.toString(), getAutonomia(), "€", getAlquilerHora());
    }
}
