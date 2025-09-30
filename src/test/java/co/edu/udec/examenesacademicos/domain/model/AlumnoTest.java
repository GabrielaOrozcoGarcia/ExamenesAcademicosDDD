package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.valueobjects.Matricula;
import co.edu.udec.examenesacademicos.domain.exceptions.AlumnoException;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class  AlumnoTest {

    @Test
    void debeCrearAlumnoCorrecto() {
        var alumno = new Alumno(new Matricula("A123B"), "Gabriela", "Grupo1");
        assertThat(alumno.getNombre()).isEqualTo("Gabriela");
    }

    @Test
    void debeFallarSiGrupoEsInvalido() {
        assertThatThrownBy(() -> new Alumno(new Matricula("A123B"), "Gabriela", ""))
                .isInstanceOf(AlumnoException.class);
    }
}

