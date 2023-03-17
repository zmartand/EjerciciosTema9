package Ejercicio1;

import java.time.LocalDate;

public class Bicicleta extends Ciclo{
    private int numCambios;
    public Bicicleta(String marca, String modelo, LocalDate fechaFabricacion, int numCambios) {
        super(marca, modelo,fechaFabricacion);
        this.numCambios = numCambios;
    }
    public int getNumCambios() {
        return numCambios;
    }
    public double getAlquilerHora() {
        return 4.90;
    }
    public String toString(){
        return String.format("- Bici %s %d velocidades %s%.2f/hora",
                super.toString(), getNumCambios(), "€", getAlquilerHora());
    }

}
