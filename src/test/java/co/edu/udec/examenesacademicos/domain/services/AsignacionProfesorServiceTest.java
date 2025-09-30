package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.factory.CursoFactory;
import co.edu.udec.examenesacademicos.domain.model.Curso;
import co.edu.udec.examenesacademicos.domain.model.Profesor;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AsignacionProfesorServiceTest {

    private final AsignacionProfesorService service = new AsignacionProfesorService();

    @Test
    void debeAsignarProfesorCorrectamente() {
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");
        Profesor profesor = new Profesor("P001", "Carlos Perez", "Ciencias");

        assertThatNoException().isThrownBy(() -> service.asignarProfesor(curso, profesor));
    }

    @Test
    void debeFallarSiCursoEsNulo() {
        Profesor profesor = new Profesor("P001", "Carlos Perez", "Ciencias");

        assertThatThrownBy(() -> service.asignarProfesor(null, profesor))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("curso");
    }

    @Test
    void debeFallarSiProfesorEsNulo() {
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");

        assertThatThrownBy(() -> service.asignarProfesor(curso, null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("profesor");
    }
}
