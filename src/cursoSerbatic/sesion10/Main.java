package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Enfermera;

import java.util.Scanner;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorDePacientes gestorDePacientes = new GestorDePacientes();
        Enfermera enfermera1 = new Enfermera(1234, false, 1);
        Thread hiloEnfermera = new Thread(enfermera1);

        boolean exit = false;

        while (!exit) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Lanzar hilo que inserte un paciente cada 5 segundos");
            System.out.println("2. Lanzar hilo para que la enfermera procese la lista cada minuto");
            System.out.println("3. Salir del programa");
            System.out.print("Seleccione una opción: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    if (!gestorDePacientes.isAlive()) {
                        gestorDePacientes.start();
                        System.out.println("Hilo de inserción de pacientes iniciado.");
                    } else {
                        System.out.println("El hilo de inserción de pacientes ya está en ejecución.");
                    }
                    break;
                case 2:
                    if (!hiloEnfermera.isAlive()) {
                        hiloEnfermera.start();
                        System.out.println("Hilo de la enfermera iniciado.");
                    } else {
                        System.out.println("El hilo de la enfermera ya está en ejecución.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    gestorDePacientes.stopRunning();
                    enfermera1.stopRunning();
                    try {
                        gestorDePacientes.join();
                        hiloEnfermera.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    exit = true;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione nuevamente.");
            }
        }

        scanner.close();
        System.out.println("Programa finalizado.");
    }
}
