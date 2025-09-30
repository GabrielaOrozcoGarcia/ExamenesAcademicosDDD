package co.edu.udec.examenesacademicos.domain.valueobjects;


import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MatriculaTest {

    @Test
    void debeCrearMatriculaValida() {
        var m = new Matricula("A2025B123");
        assertThat(m.valor()).isEqualTo("A2025B123");
    }

    @Test
    void debeFallarCuandoEsVacia() {
        assertThatThrownBy(() -> new Matricula("   "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("no puede estar vacía");
    }

    @Test
    void debeFallarCuandoNoTieneLetrasONumeros() {
        assertThatThrownBy(() -> new Matricula("123456"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}

