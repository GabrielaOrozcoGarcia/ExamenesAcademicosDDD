package co.edu.udec.examenesacademicos.domain.factory;

import co.edu.udec.examenesacademicos.domain.model.Alumno;
import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;

public class AlumnoFactory {
    public static Alumno crearAlumno(String matricula, String nombre, String grupo) {
        return new Alumno(new Matricula(matricula), nombre, grupo);
    }
}

