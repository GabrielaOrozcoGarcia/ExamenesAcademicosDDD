package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.exceptions.AlumnoException;

public class Alumno {
    private final Matricula matricula; // VO
    private String nombre;
    private String grupo;

    public Alumno(Matricula matricula, String nombre, String grupo) {
        if (matricula == null) throw new AlumnoException("La matrícula no puede ser nula");
        if (nombre == null || nombre.isBlank()) throw new AlumnoException("El nombre no puede estar vacío");
        if (grupo == null || grupo.isBlank()) throw new AlumnoException("El grupo no puede estar vacío");

        this.matricula = matricula;
        this.nombre = nombre;
        this.grupo = grupo;
    }

    public Matricula getMatricula() { return matricula; }
    public String getNombre() { return nombre; }
    public String getGrupo() { return grupo; }

    public void cambiarGrupo(String nuevoGrupo) {
        if (nuevoGrupo == null || nuevoGrupo.isBlank())
            throw new AlumnoException("El grupo no puede ser vacío");
        this.grupo = nuevoGrupo;
    }
}

