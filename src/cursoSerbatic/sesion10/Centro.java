package cursoSerbatic.sesion10;

import cursoSerbatic.sesion10.personas.Enfermera;
import cursoSerbatic.sesion10.personas.Medico;
import cursoSerbatic.sesion10.personas.Paciente;
import cursoSerbatic.sesion10.personas.Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Centro {
    public static List <Paciente> pacientes = Collections.synchronizedList(new ArrayList<>());;
    public static List <Medico> medicos = Collections.synchronizedList(new ArrayList<>());;
    public static List <Enfermera> enfermeras = Collections.synchronizedList(new ArrayList<>());;
    public static List<Persona> vacunables = Collections.synchronizedList(new ArrayList<>());
    public static List <Persona> aVacunar = Collections.synchronizedList(new ArrayList<>());
    public static List <Persona> vacunados = Collections.synchronizedList(new ArrayList<>());;
}
