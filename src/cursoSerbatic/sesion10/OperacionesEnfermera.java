package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Paciente;
import cursoSerbatic.sesion10.personas.Persona;

public interface OperacionesEnfermera {
    static void vacunar(){
        for(Persona p : Centro.aVacunar) {
            vacunar(p);
        }
    }

    static void vacunar(Persona persona){
        persona.setVacunado(true);
    }
}
