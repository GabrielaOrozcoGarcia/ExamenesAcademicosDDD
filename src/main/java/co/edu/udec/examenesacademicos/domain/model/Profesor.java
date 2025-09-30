package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.exceptions.ProfesorException;
import java.util.Objects;

public class Profesor {
    private final String id; // identidad del profesor
    private String nombre;
    private String departamento;

    public Profesor(String id, String nombre, String departamento) {
        if (id == null || id.isBlank()) throw new ProfesorException("El id del profesor no puede estar vacio");
        if (nombre == null || nombre.isBlank()) throw new ProfesorException("El nombre no puede estar vacio");
        if (departamento == null || departamento.isBlank()) throw new ProfesorException("El departamento no puede estar vacio");

        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDepartamento() { return departamento; }

    public void cambiarDepartamento(String nuevoDepto) {
        if (nuevoDepto == null || nuevoDepto.isBlank())
            throw new ProfesorException("El departamento no puede estar vacio");
        this.departamento = nuevoDepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Profesor)) return false;
        Profesor profesor = (Profesor) o;
        return id.equals(profesor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
