package Ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;
    /*public static void main(String[] args) {
        Bicicleta biciLapierre = new Bicicleta("Lapierre", "Speed 400", LocalDate.now().minusYears(1), 27);
        Bicicleta biciBtwin = new Bicicleta("Btwin", "Riverside 900", LocalDate.now(), 10);
        Giroscopio giroSegway = new Giroscopio("Segway", "Nine", LocalDate.now(), 40);
        Giroscopio giroWeebot = new Giroscopio("Weebot", "Echo", LocalDate.now().minusYears(1), 35);
        Segway segwayImmotion = new Segway("Immotion", "v8", LocalDate.now(), 40, 30);

        System.out.println("Estos son los ciclos que ofrecemos en alquiler:");
        System.out.println("- " + biciLapierre);
        System.out.println("- " + biciBtwin);
        System.out.println("- " + giroSegway);
        System.out.println("- " + giroWeebot);
        System.out.println("- " + segwayImmotion);

        //Menu
        System.out.println("¿Qué desea alquilar?");
        System.out.println("1. Bicicleta");
        System.out.println("2. Segway");
        System.out.println("3. Giroscopio");
        System.out.println("4. Salir");



    }
}*/
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

    public class Catalogo {
        /*public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Bicicleta biciLapierre = new Bicicleta("Lapierre", "Speed 400", LocalDate.now().minusYears(1), 27);
            Bicicleta biciBtwin = new Bicicleta("Btwin", "Riverside 900", LocalDate.now(), 10);
            Giroscopio giroSegway = new Giroscopio("Segway", "Nine", LocalDate.now(), 40);
            Giroscopio giroWeebot = new Giroscopio("Weebot", "Echo", LocalDate.now().minusYears(1), 35);
            Segway segwayImmotion = new Segway("Immotion", "v8", LocalDate.now(), 40,70);

            System.out.println("Estos son los ciclos que ofrecemos en alquiler:");
            System.out.println("marca: Lapierre Speed 400 27 velocidades 4.90€/hora");
            System.out.println("- " + biciLapierre);
            System.out.println("- " + biciBtwin);
            System.out.println("- " + giroSegway);
            System.out.println("- " + giroWeebot);
            System.out.println("- " + segwayImmotion);

            System.out.println("\nSeleccione qué ciclo desea alquilar (1-5):");
            int opcion = scanner.nextInt();

            if (opcion == 1 || opcion == 2) {
                Bicicleta bici = (opcion == 1) ? biciLapierre : biciBtwin;

                System.out.println("\nHa seleccionado una bicicleta.");
                System.out.println("Ingrese la marca:");
                String marca = scanner.next();
                System.out.println("Ingrese el modelo:");
                String modelo = scanner.next();
                System.out.println("Ingrese la fecha de compra (formato: yyyy-mm-dd):");
                LocalDate fechaCompra = LocalDate.parse(scanner.next());

                long horasAlquiler = calcularHorasAlquiler();

                double costo = horasAlquiler * bici.getAlquilerHora();

                System.out.println("El costo total del alquiler es de " + costo + " €.");
            } else if (opcion == 3 || opcion == 4) {
                Giroscopio giroscopio = (opcion == 3) ? giroSegway : giroWeebot;

                System.out.println("\nHa seleccionado un giroscopio.");
                System.out.println("Ingrese la marca:");
                String marca = scanner.next();
                System.out.println("Ingrese el modelo:");
                String modelo = scanner.next();
                System.out.println("Ingrese la fecha de compra (formato: yyyy-mm-dd):");
                LocalDate fechaCompra = LocalDate.parse(scanner.next());

                long horasAlquiler = calcularHorasAlquiler();

                double costo = horasAlquiler * giroscopio.getAlquilerHora();

                System.out.println("El costo total del alquiler es de " + costo + " €.");
            } else if (opcion == 5) {
                System.out.println("\nHa seleccionado un segway.");
                System.out.println("Ingrese la marca:");
                String marca = scanner.next();
                System.out.println("Ingrese el modelo:");
                String modelo = scanner.next();
                System.out.println("Ingrese la fecha de compra (formato: yyyy-mm-dd):");
                LocalDate fechaCompra = LocalDate.parse(scanner.next());
            }
        }
        public static long calcularHorasAlquiler() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese la fecha y hora de inicio del alquiler (formato: yyyy-mm-dd hh:mm): Ejemplo: 2021-05-01 12:00");
            LocalDateTime fechaHoraInicio = LocalDateTime.parse(scanner.next().replace(" ", "T"));
            System.out.println("Ingrese la fecha y hora de fin del alquiler (formato: yyyy-mm-dd hh:mm): Ejemplo: 2021-05-01 12:00");
            LocalDateTime fechaHoraFin = LocalDateTime.parse(scanner.next().replace(" ", "T"));

            return ChronoUnit.HOURS.between(fechaHoraInicio, fechaHoraFin);
        }*/


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Bicicleta bicicleta = new Bicicleta("a", "a", LocalDate.now(), 1);

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
                double costo = segway.getAlquilerHora();
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
                double costo = giroscopio.getAlquilerHora();
                System.out.println("El costo del alquiler del giroscopio es: " + costo + "€");
            }
        }
    }

