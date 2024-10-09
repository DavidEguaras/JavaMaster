package cursoSerbatic.sesion2.arrays;

import java.util.Scanner;

public class AppTren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de tren, y asignar mediante el input del usuario sus respectivos atributos
        //El nombre puede ser AVE, por ejemplo
        System.out.println("Introduce el nombre del tren:");
        String nombreTren = scanner.nextLine();
        System.out.println("Introduce el lugar de salida:");
        String lugarSalida = scanner.nextLine();
        System.out.println("Introduce el destino:");
        String lugarDestino = scanner.nextLine();
        Tren tren = new Tren(nombreTren, lugarSalida, lugarDestino);


        boolean salir = false;
        while (!salir) {
            //Mostramos el menu
            System.out.println("\n-------- Menú de Tren: " +nombreTren+ " " +lugarSalida+ " - " +lugarDestino+ " --------");
            mostrarMenu();
            int opcion = scanner.nextInt();

            switch (opcion) {
                // Imprimir las plazas del tren
                case 1:
                    tren.imprimirPlazasTren();
                    break;

               // Reservar una plaza especifica
                case 2:
                    // Inputs de la posicion de la plaza deseada por el usuario
                    System.out.print("Introduce el número del vagón (1-3): ");
                    int numeroVagon = scanner.nextInt();
                    System.out.print("Introduce el número de fila (0-15): ");
                    int numeroFila = scanner.nextInt();
                    System.out.print("Introduce el número de columna (0-3): ");
                    int numeroColumna = scanner.nextInt();

                    scanner.nextLine();
                    // Input datos pasajero
                    System.out.println("Ahora, debes introducir tus datos de pasajero");
                    Persona personaEspecifica = crearPersona(scanner);

                    // Llamamos al metodo de reservar plaza especifica de la clase tren
                    tren.reservarPlazaEspecifica(numeroVagon, personaEspecifica, numeroFila, numeroColumna);
                    break;


                // Reservar una plaza del vagon seleccionado, automaticamente
                case 3:
                    // Input del numero de vagon
                    System.out.print("Introduce el número del vagón (1-3): ");
                    int numeroVagonAuto = scanner.nextInt();

                    scanner.nextLine();

                    // Input datos pasajero
                    System.out.println("Ahora, debes introducir tus datos de pasajero");
                    Persona personaAuto = crearPersona(scanner);

                    // Llamamos al metodo de reservar plaza automaticamente de la clase Tren
                    tren.reservarPlazaAutomaticamente(numeroVagonAuto, personaAuto);
                    break;

                // Salir del manu
                case 4:
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;

                // Opcion por defecto
                default:
                    System.out.println("❌Opción no válida❌. Por favor, elija una opción del 1 al 4.");
                    break;
            }
        }

        scanner.close();
    }

    private static Persona crearPersona(Scanner scanner) {
        System.out.print("Introduce el nombre del pasajero: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce los apellidos del pasajero: ");
        String apellidos = scanner.nextLine();

        return new Persona(nombre, apellidos);
    }

    private static void mostrarMenu(){
        System.out.println("1. Imprimir plazas del tren");
        System.out.println("2. Reservar plaza específica");
        System.out.println("3. Reservar plaza automáticamente");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
