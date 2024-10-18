package cursoSerbatic.sesion10.personas;

import cursoSerbatic.sesion10.OperacionesEnfermera;

public class Enfermera extends Sanitario implements OperacionesEnfermera {
    public Enfermera(int dni, boolean vacunado, int numeroEmpleado) {
        super(dni, vacunado, numeroEmpleado);
    }
}
