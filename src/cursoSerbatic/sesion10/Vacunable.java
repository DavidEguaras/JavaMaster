package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Persona;

public interface Vacunable {
    static void agregarVacunable(Persona persona){
        if(!persona.isVacunado()){
            Centro.vacunables.add(persona);
        }
    }
}
