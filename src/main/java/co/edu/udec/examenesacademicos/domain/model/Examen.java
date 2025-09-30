package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Nota;

public abstract class Examen {

    private final String idExamen;
    private final String asignatura;
    private Nota nota;

    protected Examen(String idExamen, String asignatura) {
        if (idExamen == null || idExamen.isBlank()) {
            throw new IllegalArgumentException("El id del examen no puede ser vacio");
        }
        if (asignatura == null || asignatura.isBlank()) {
            throw new IllegalArgumentException("La asignatura no puede ser vacia");
        }
        this.idExamen = idExamen;
        this.asignatura = asignatura;
    }

    public String getIdExamen() {
        return idExamen;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public Nota getNota() {
        return nota;
    }

    public void asignarNota(Nota nota) {
        this.nota = nota;
    }

    public abstract double calcularNotaFinal();
}
