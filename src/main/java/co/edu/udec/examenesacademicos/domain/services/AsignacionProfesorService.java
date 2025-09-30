package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.model.Curso;
import co.edu.udec.examenesacademicos.domain.model.Profesor;

public class AsignacionProfesorService {

    public void asignarProfesor(Curso curso, Profesor profesor) {
        if (curso == null) throw new IllegalArgumentException("El curso no puede ser nulo");
        if (profesor == null) throw new IllegalArgumentException("El profesor no puede ser nulo");

        System.out.println("Profesor " + profesor.getNombre() + " asignado al curso " + curso.getNombre());
    }
}
