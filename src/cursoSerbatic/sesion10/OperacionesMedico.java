package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Medico;
import cursoSerbatic.sesion10.personas.Persona;

import java.util.List;

public interface OperacionesMedico {

     static List<Persona> pasarConsulta(Medico medico){
         for (int i = 0; i < Centro.vacunables.size(); i += 2) {
             Centro.aVacunar.add(Centro.vacunables.get(i));
         }
         Centro.aVacunar.add(medico);
         Centro.vacunables.removeAll(Centro.aVacunar);
         System.out.println("El medico ha pasado consulta");
         return Centro.aVacunar;
     }
}
