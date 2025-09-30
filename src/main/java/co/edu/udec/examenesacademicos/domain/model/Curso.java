package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.exceptions.CursoException;
import co.edu.udec.examenesacademicos.domain.valueobjects.CodigoCurso;

import java.util.Objects;

public class Curso {
    private final CodigoCurso codigo;
    private String nombre;

    public Curso(CodigoCurso codigo, String nombre) {
        if (codigo == null) throw new CursoException("El codigo del curso no puede ser nulo");
        if (nombre == null || nombre.isBlank()) throw new CursoException("El nombre del curso no puede estar vacio");

        this.codigo = codigo;
        this.nombre = nombre;
    }

    public CodigoCurso getCodigo() { return codigo; }
    public String getNombre() { return nombre; }

    public void cambiarNombre(String nuevoNombre) {
        if (nuevoNombre == null || nuevoNombre.isBlank()) throw new CursoException("El nombre no puede estar vacio");
        this.nombre = nuevoNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Curso)) return false;
        Curso curso = (Curso) o;
        return codigo.equals(curso.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
