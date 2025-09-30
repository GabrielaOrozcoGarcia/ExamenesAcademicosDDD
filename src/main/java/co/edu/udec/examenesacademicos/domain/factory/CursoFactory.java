package co.edu.udec.examenesacademicos.domain.factory;

import co.edu.udec.examenesacademicos.domain.model.Curso;
import co.edu.udec.examenesacademicos.domain.valueobjects.CodigoCurso;

public class CursoFactory {
    public static Curso crearCurso(String codigo, String nombre) {
        return new Curso(new CodigoCurso(codigo), nombre);
    }
}
