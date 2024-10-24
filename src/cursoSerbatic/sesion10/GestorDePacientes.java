package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Paciente;

import java.util.HashMap;

public class GestorDePacientes extends Thread {
    private boolean running = true;

    @Override
    public void run() {
        while (running) {
            try {
                // Insertar un nuevo paciente cada 5 segundos
                int dni = (int) (Math.random() * 10000);
                HashMap<Integer, String> historial = new HashMap<>();
                historial.put(dni, "Historial médico del paciente");
                Paciente nuevoPaciente = new Paciente(dni, false, historial);

                Centro.pacientes.add(nuevoPaciente);
                synchronized(Centro.aVacunar) {
                    Centro.aVacunar.add(nuevoPaciente);
                }
                System.out.println("Paciente añadido con DNI: " + dni);

                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopRunning() {
        this.running = false;
    }
}

