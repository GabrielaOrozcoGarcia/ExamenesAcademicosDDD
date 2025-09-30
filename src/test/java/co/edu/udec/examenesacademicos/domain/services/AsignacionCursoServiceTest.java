package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.factory.CursoFactory;
import co.edu.udec.examenesacademicos.domain.model.Curso;
import co.edu.udec.examenesacademicos.domain.model.Profesor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AsignacionCursoServiceTest {

    private final AsignacionCursoService service = new AsignacionCursoService();

    @Test
    void debeAsignarCursoAProfesor() {
        Profesor profesor = new Profesor("P001", "Laura Mendez", "Ciencias");
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");

        service.asignarCurso(profesor, curso);

        assertThat(profesor.getDepartamento()).isEqualTo("Matematicas");
    }

    @Test
    void debeFallarSiProfesorEsNulo() {
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");

        assertThatThrownBy(() -> service.asignarCurso(null, curso))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("profesor");
    }

    @Test
    void debeFallarSiCursoEsNulo() {
        Profesor profesor = new Profesor("P001", "Laura Mendez", "Ciencias");

        assertThatThrownBy(() -> service.asignarCurso(profesor, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("curso");
    }
}
