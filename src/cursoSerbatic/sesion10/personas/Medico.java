package cursoSerbatic.sesion10.personas;

import cursoSerbatic.sesion10.OperacionesEnfermera;
import cursoSerbatic.sesion10.OperacionesMedico;
import cursoSerbatic.sesion10.Vacunable;

public class Medico extends Sanitario implements OperacionesMedico, Vacunable {

    public Medico(int dni, boolean vacunado, int numeroEmpleado) {
        super(dni, vacunado, numeroEmpleado);
        Vacunable.agregarVacunable(this);
    }

    public void pasarConsulta(){
        OperacionesMedico.pasarConsulta(this);
    }


}
