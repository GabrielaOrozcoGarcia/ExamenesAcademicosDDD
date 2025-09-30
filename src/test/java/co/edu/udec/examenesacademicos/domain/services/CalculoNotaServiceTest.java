package co.edu.udec.examenesacademicos.domain.services;

import co.edu.udec.examenesacademicos.domain.services.CalculoNotaService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class CalculoNotaServiceTest {

    @Test
    void debeCalcularPromedioCorrecto() {
        var service = new CalculoNotaService();
        double promedio = service.calcularPromedio(List.of(4.0, 3.0, 5.0));
        assertThat(promedio).isEqualTo(4.0);
    }
}

