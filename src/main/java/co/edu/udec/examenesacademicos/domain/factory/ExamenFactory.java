package co.edu.udec.examenesacademicos.domain.factory;

import co.edu.udec.examenesacademicos.domain.model.Examen;
import co.edu.udec.examenesacademicos.domain.model.ExamenEscrito;
import co.edu.udec.examenesacademicos.domain.model.ExamenPractico;

/**
 * Factory para la creacion de examenes en el dominio.
 */
public class ExamenFactory {

    private ExamenFactory() {
        // Evita instanciacion
    }

    public static Examen crearExamenEscrito(String idExamen, String asignatura, int numeroPreguntas, int respuestasCorrectas) {
        return new ExamenEscrito(idExamen, asignatura, numeroPreguntas, respuestasCorrectas);
    }

    public static Examen crearExamenPractico(String idExamen, String asignatura, double desempeno, double proyecto) {
        return new ExamenPractico(idExamen, asignatura, desempeno, proyecto);
    }
}
