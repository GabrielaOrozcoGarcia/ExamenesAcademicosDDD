package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.model.Profesor;
import co.edu.udec.examenesacademicos.domain.model.Curso;

public class AsignacionCursoService {

    public void asignarCurso(Profesor profesor, Curso curso) {
        if (profesor == null) {
            throw new IllegalArgumentException("El profesor no puede ser nulo");
        }
        if (curso == null) {
            throw new IllegalArgumentException("El curso no puede ser nulo");
        }
        profesor.cambiarDepartamento(curso.getNombre());
    }
}
