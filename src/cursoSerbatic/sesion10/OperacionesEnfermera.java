package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Paciente;
import cursoSerbatic.sesion10.personas.Persona;

public interface OperacionesEnfermera {

    static void vacunar() {
        synchronized(Centro.aVacunar) {  // Asegurar que no haya problemas de concurrencia
            if (Centro.aVacunar.isEmpty()) {
                System.out.println("No hay pacientes en la lista para vacunar.");
                return;
            }

            for (Persona p : Centro.aVacunar) {
                vacunar(p);
            }

            Centro.vacunados.addAll(Centro.aVacunar);  // Mover a los vacunados
            Centro.aVacunar.clear();  // Limpiar la lista de pendientes de vacunar
        }
    }

    static void vacunar(Persona persona) {
        persona.setVacunado(true);
        System.out.println("La persona con DNI " + persona.getDni() + " ha sido vacunada.");
    }
}
