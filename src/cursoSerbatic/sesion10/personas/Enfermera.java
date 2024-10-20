package cursoSerbatic.sesion10.personas;

import cursoSerbatic.sesion10.Centro;
import cursoSerbatic.sesion10.OperacionesEnfermera;

public class Enfermera extends Sanitario implements OperacionesEnfermera, Runnable {

    private boolean running = true;

    public Enfermera(int dni, boolean vacunado, int numeroEmpleado) {
        super(dni, vacunado, numeroEmpleado);
    }

    @Override
    public void run() {
        while (running) {
            try {
                System.out.println("La enfermera está procesando la lista de vacunación...");
                OperacionesEnfermera.vacunar();
                System.out.println("Pacientes vacunados: " + Centro.vacunados.size());

                // Dormimos el hilo por 1 minuto antes de vacunar de nuevo
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopRunning() {
        this.running = false;
    }
}


