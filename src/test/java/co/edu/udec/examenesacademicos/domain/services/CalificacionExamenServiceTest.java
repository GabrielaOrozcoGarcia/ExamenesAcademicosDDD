package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.model.ExamenEscrito;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalificacionExamenServiceTest {

    private final CalificacionExamenService service = new CalificacionExamenService();

    @Test
    void debeCalcularDefinitivaDeExamenEscrito() {
        ExamenEscrito examen = new ExamenEscrito("E001", "Matematicas", 10, 8);
        assertThat(service.calcularDefinitiva(examen)).isEqualTo(4.0);
    }

    @Test
    void debeFallarSiExamenEsNulo() {
        assertThatThrownBy(() -> service.calcularDefinitiva(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("nulo");
    }
}
