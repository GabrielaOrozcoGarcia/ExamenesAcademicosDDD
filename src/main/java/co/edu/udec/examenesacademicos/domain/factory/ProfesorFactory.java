package co.edu.udec.examenesacademicos.domain.factory;

import co.edu.udec.examenesacademicos.domain.model.Profesor;

public class ProfesorFactory {
    public static Profesor crearProfesor(String id, String nombre, String departamento) {
        return new Profesor(id, nombre, departamento);
    }
}
