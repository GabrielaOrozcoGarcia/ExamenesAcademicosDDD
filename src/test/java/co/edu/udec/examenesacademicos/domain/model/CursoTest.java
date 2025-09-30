package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.exceptions.CursoException;
import co.edu.udec.examenesacademicos.domain.factory.CursoFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CursoTest {

    @Test
    void debeCrearCursoCorrecto() {
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");
        assertThat(curso.getCodigo().valor()).isEqualTo("MAT101");
        assertThat(curso.getNombre()).isEqualTo("Matematicas");
    }

    @Test
    void debeFallarSiNombreEsVacio() {
        assertThatThrownBy(() -> CursoFactory.crearCurso("MAT101", " "))
                .isInstanceOf(CursoException.class)
                .hasMessageContaining("nombre");
    }

    @Test
    void debeMantenerCodigoInmutable() {
        Curso curso = CursoFactory.crearCurso("MAT101", "Matematicas");
        curso.cambiarNombre("Algebra");

        assertThat(curso.getCodigo().valor()).isEqualTo("MAT101"); // el código no cambia
        assertThat(curso.getNombre()).isEqualTo("Algebra");
    }

    @Test
    void debeFallarSiCodigoEsNulo() {
        assertThatThrownBy(() -> new Curso(null, "Matematicas"))
                .isInstanceOf(CursoException.class)
                .hasMessageContaining("codigo");
    }
}
