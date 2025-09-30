package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.model.Examen;

public class CalificacionExamenService {

    public double calcularDefinitiva(Examen examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen no puede ser nulo");
        }
        return examen.calcularNotaFinal();
    }
}
