package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Paciente;

import static cursoSerbatic.sesion10.Centro.pacientes;

public class HiloAgregaPacientes implements Runnable{
    private String nombre;


    @Override
    public void run() {
        synchronized (pacientes) { // Sincronizar al iterar
            for(Paciente paciente : pacientes){

            }
        }
    }
}
