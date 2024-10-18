package cursoSerbatic.sesion10.personas;
import cursoSerbatic.sesion10.Vacunable;

import java.util.HashMap;

public class Paciente extends Persona implements Vacunable {

    private HashMap<Integer, String> historial;

    public Paciente(int dni, boolean vacunado, HashMap historial) {
        super(dni, vacunado);
        this.historial = historial;
        Vacunable.agregarVacunable(this);
    }
}
