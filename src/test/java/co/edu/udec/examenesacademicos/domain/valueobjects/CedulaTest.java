package co.edu.udec.examenesacademicos.domain.valueobjects;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CedulaTest {

    @Test
    void debeCrearCedulaValida() {
        Cedula cedula = new Cedula("12345678");
        assertThat(cedula.valor()).isEqualTo("12345678");
    }

    @Test
    void debeFallarSiEsVacia() {
        assertThatThrownBy(() -> new Cedula(" "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("vacia");
    }

    @Test
    void debeFallarSiNoTieneFormatoCorrecto() {
        assertThatThrownBy(() -> new Cedula("ABC123"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("digitos numericos");
    }
}
