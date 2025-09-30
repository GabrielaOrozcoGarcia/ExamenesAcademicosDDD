package co.edu.udec.examenesacademicos.domain.valueobjects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CodigoCursoTest {

    @Test
    void debeCrearCodigoValido() {
        CodigoCurso codigo = new CodigoCurso("MAT101");
        assertThat(codigo.valor()).isEqualTo("MAT101");
    }

    @Test
    void debeFallarSiEsVacio() {
        assertThatThrownBy(() -> new CodigoCurso(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("vacio");
    }

    @Test
    void debeFallarSiFormatoIncorrecto() {
        assertThatThrownBy(() -> new CodigoCurso("123ABC"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("formato");
    }
}
