package cursoSerbatic.sesion8;

import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Crear ficheros con prioridad");
            System.out.println("2. Hilo demonio contar líneas en fichero o base de datos");
            System.out.println("3. Monitorear inserciones en fichero o base de datos");
            System.out.println("4. Bloquear y desbloquear método de escritura");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    ejecutarCrearFicherosConPrioridad();
                    break;
                case 2:
                    ejecutarContarLineas();
                    break;
                case 3:
                    ejecutarMonitorInserciones();
                    break;
                case 4:
                    ejecutarBloquearYDesbloquear();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
            System.out.println();
        } while (opcion != 0);

        scanner.close();
    }

    // Método para el Ejercicio 1: Crear Ficheros con Prioridad
    public static void ejecutarCrearFicherosConPrioridad() {
        System.out.println("Ejecutando: Crear Ficheros con Prioridad...");
        FicheroConPrioridad hilo1 = new FicheroConPrioridad("Fichero 1", Thread.MIN_PRIORITY);
        FicheroConPrioridad hilo2 = new FicheroConPrioridad("Fichero 2", Thread.MIN_PRIORITY);
        FicheroConPrioridad hilo3 = new FicheroConPrioridad("Fichero 3", Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }

    // Método para el Ejercicio 2: Hilo Demonio para contar líneas en fichero o base de datos
    public static void ejecutarContarLineas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea contar líneas en fichero (1) o registros en BD (2)?");
        int opcion = sc.nextInt();
        boolean contarBD = opcion == 2;

        ContarLineas hiloContador = new ContarLineas(contarBD);
        hiloContador.start();

        System.out.println("El hilo demonio está contando en segundo plano.");
    }

    // Método para el Ejercicio 3: Monitorear inserciones en fichero o base de datos
    public static void ejecutarMonitorInserciones() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea monitorear inserciones en fichero (1) o en BD (2)?");
        int opcion = sc.nextInt();
        boolean monitorearBD = opcion == 2;

        MonitorInserciones hiloMonitor = new MonitorInserciones(monitorearBD);
        hiloMonitor.start();

        System.out.println("Monitorizando inserciones...");
    }

    // Método para el Ejercicio 4: Bloquear y Desbloquear método de escritura
    public static void ejecutarBloquearYDesbloquear() throws InterruptedException {
        BloquearEscritura bloqueo = new BloquearEscritura();
        HiloEscritor hiloEscritor = new HiloEscritor(bloqueo);

        hiloEscritor.start();

        System.out.println("Desbloqueando el método de escritura en 5 segundos...");
        Thread.sleep(5000);  // Simulando algún retraso
        bloqueo.desbloquear();
    }
}

class BloquearEscritura {
    private boolean bloqueado = true;

    public synchronized void escribir(String texto) throws InterruptedException {
        while (bloqueado) {
            wait();
        }
        System.out.println("Escribiendo: " + texto);
    }

    public synchronized void desbloquear() {
        bloqueado = false;
        notifyAll();
    }
}

class HiloEscritor extends Thread {
    private BloquearEscritura bloqueo;

    public HiloEscritor(BloquearEscritura bloqueo) {
        this.bloqueo = bloqueo;
    }

    public void run() {
        try {
            bloqueo.escribir("Nuevo contenido en fichero o BD.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class BloquearYDesbloquearMain {
    public static void main(String[] args) throws InterruptedException {
        BloquearEscritura bloqueo = new BloquearEscritura();
        HiloEscritor hiloEscritor = new HiloEscritor(bloqueo);

        hiloEscritor.start();

        System.out.println("Desbloqueando el método de escritura...");
        Thread.sleep(5000);  // Simulando algún retraso
        bloqueo.desbloquear();
    }
}



import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class ContarLineas extends Thread {
    private boolean contarBD;

    public ContarLineas(boolean contarBD) {
        this.contarBD = contarBD;
        setDaemon(true);  // Configurar como hilo demonio
    }

    @Override
    public void run() {
        try {
            while (true) {
                if (contarBD) {
                    contarRegistrosBD();
                } else {
                    contarLineasFichero("archivo.txt");
                }
                Thread.sleep(5000);  // Recuento cada 5 segundos
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contarLineasFichero(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            int count = 0;
            while (br.readLine() != null) {
                count++;
            }
            System.out.println("Líneas en fichero: " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void contarRegistrosBD() {
        try (Connection con = ConexionBD.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM tabla")) {
            if (rs.next()) {
                System.out.println("Registros en la tabla: " + rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class ConexionBD {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/tu_base_de_datos";
        String user = "root";
        String password = "tu_password";
        return DriverManager.getConnection(url, user, password);
    }
}

public class ContarLineasMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Desea contar líneas en fichero (1) o registros en BD (2)?");
        int opcion = sc.nextInt();

        boolean contarBD = opcion == 2;
        ContarLineas hiloContador = new ContarLineas(contarBD);
        hiloContador.start();

        System.out.println("El hilo demonio está contando en segundo plano.");
    }
}


class FicheroConPrioridad extends Thread {
    private static boolean bandera = false;

    public FicheroConPrioridad(String nombre, int prioridad) {
        this.setName(nombre);
        this.setPriority(prioridad);
    }

    public void run() {
        if (this.getPriority() == Thread.MAX_PRIORITY) {
            System.out.println(this.getName() + ": Soy el hilo de máxima prioridad, creando fichero...");
            bandera = true;
        }

        if (this.getPriority() == Thread.MIN_PRIORITY && bandera) {
            System.out.println(this.getName() + ": Hilo con prioridad mínima, creando fichero...");
        }
    }
}

public class CrearFicherosConPrioridad {
    public static void main(String[] args) {
        FicheroConPrioridad hilo1 = new FicheroConPrioridad("Fichero 1", Thread.MIN_PRIORITY);
        FicheroConPrioridad hilo2 = new FicheroConPrioridad("Fichero 2", Thread.MIN_PRIORITY);
        FicheroConPrioridad hilo3 = new FicheroConPrioridad("Fichero 3", Thread.MAX_PRIORITY);

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}




