package co.edu.udec.examenesacademicos.domain.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ExamenPracticoTest {

    @Test
    void debeCalcularNotaFinalCorrectamente() {
        ExamenPractico examen = new ExamenPractico("P001", "Quimica", 4.0, 5.0);
        assertThat(examen.calcularNotaFinal()).isEqualTo(4.6);
    }

    @Test
    void debeFallarSiValoresInvalidos() {
        assertThatThrownBy(() -> new ExamenPractico("P002", "Historia", -1, 6))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
