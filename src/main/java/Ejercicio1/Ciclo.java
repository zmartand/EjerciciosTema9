package Ejercicio1;

import java.time.LocalDate;

public abstract class Ciclo {
    //atributos
    private String marca;
    private String modelo;
    private LocalDate fechaFabricacion;
    //constructor
    public Ciclo(String marca, String modelo, LocalDate fechaFabricacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fechaFabricacion = fechaFabricacion;
    }
    //metodos
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }
    public abstract double getAlquilerHora();
    public String toString(){
        return String.format("%s %s (%d años)", getMarca(), getModelo(),
                LocalDate.now().getYear() - getFechaFabricacion().getYear());
    }

}
