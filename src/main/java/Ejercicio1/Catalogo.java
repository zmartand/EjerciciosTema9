package Ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;
    public class Catalogo {
        public void Menu(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido al catálogo de alquiler de bicicletas");
            System.out.println("Estos son los ciclos que ofrecemos en alquiler:");
            System.out.println("- Bicis Lapierre speed 400 (1 año) 27 velocidades                  4,90€/hora");
            System.out.println("- Bicis Btwin riverside 900 (0 años) 10 velocidades                4,90€/hora");
            System.out.println("- Giroscopio Segway Nine (0 años) 40 km de autonomía [1h50 min]     9,90€/hora");
            System.out.println("- Giroscopio Weebot Echo (1 año) 35 km de autonomía [1h60 min]     9,90€/hora");
            System.out.println("- Segway Immotion v8 (0 años) 40 km de autonomía                 18,90€/hora");
            System.out.println("- Segway Ninebot One E+ (0 años) 30 km de autonomía               18,90€/hora");

            System.out.println("¿Qué tipo de ciclo desea alquilar? (Escriba Bici, Segway o Giroscopio): ");
            String tipo = scanner.nextLine();

            if (tipo.equals("Bici")) {
                System.out.println("¿Qué marca de bicicleta desea alquilar? (Escriba Lapierre o Btwin): ");
                String marca = scanner.nextLine();
                System.out.println("¿Cuántas horas desea alquilarla? ");
                int horas = scanner.nextInt();
                Bicicleta bicicleta = null;
                if (marca.equals("Lapierre")) {
                    bicicleta = new Bicicleta("Lapierre", "Speed 400", LocalDate.now(), 27);
                } else if (marca.equals("Btwin")) {
                    bicicleta = new Bicicleta("Btwin", "Riverside 900", LocalDate.now(), 10);
                }
                double costo = bicicleta.getAlquilerHora();
                System.out.println("El costo del alquiler de la bicicleta es: " + costo + "€");
                
            } else if (tipo.equals("Segway")) {
                System.out.println("¿Cuál es su altura en cm? ");
                int altura = scanner.nextInt();
                System.out.println("¿Cuántas horas desea alquilarlo? ");
                int horas = scanner.nextInt();
                Segway segway;
                if (altura >= 150) {
                    segway = new Segway("Segway", "Immotion v8", LocalDate.now(), 150,40);
                } else {
                    segway = new Segway("Segway", "Ninebot One E+", LocalDate.now(), 50, 30);
                }
                double costo = segway.getAlquilerHora() * horas;
                System.out.println("El costo del alquiler del segway es: " + costo + "€");
                
                
            } else if (tipo.equals("Giroscopio")) {
                System.out.println("¿Cuál es su altura en cm? ");
                int altura = scanner.nextInt();
                System.out.println("¿Cuántas horas desea alquilarlo? ");
                int horas = scanner.nextInt();
                Giroscopio giroscopio;
                if (altura >= 150) {
                    giroscopio = new Giroscopio("Segway", "Nine", LocalDate.now(), 40);
                } else {
                    giroscopio = new Giroscopio("Weebot", "Echo", LocalDate.now(), 35);
                }
                double costo = giroscopio.getAlquilerHora() * horas;
                System.out.println("El costo del alquiler del giroscopio es: " + costo + "€");
            }
        }
    }

