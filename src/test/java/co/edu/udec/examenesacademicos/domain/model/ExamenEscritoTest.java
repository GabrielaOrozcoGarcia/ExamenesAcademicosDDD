package co.edu.udec.examenesacademicos.domain.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ExamenEscritoTest {

    @Test
    void debeCalcularNotaFinalCorrectamente() {
        ExamenEscrito examen = new ExamenEscrito("E001", "Matematicas", 10, 7);
        assertThat(examen.calcularNotaFinal()).isEqualTo(3.5);
    }

    @Test
    void debeFallarSiPreguntasInvalidas() {
        assertThatThrownBy(() -> new ExamenEscrito("E002", "Fisica", 0, 0))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
