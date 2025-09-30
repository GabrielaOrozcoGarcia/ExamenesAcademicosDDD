package co.edu.udec.examenesacademicos.domain.model;

import co.edu.udec.examenesacademicos.domain.exceptions.ProfesorException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ProfesorTest {

    @Test
    void debeCrearProfesorCorrecto() {
        Profesor profesor = new Profesor("P001", "Carlos Perez", "Matematicas");
        assertThat(profesor.getNombre()).isEqualTo("Carlos Perez");
        assertThat(profesor.getDepartamento()).isEqualTo("Matematicas");
    }

    @Test
    void debeFallarSiElNombreEsVacio() {
        assertThatThrownBy(() -> new Profesor("P002", "   ", "Historia"))
                .isInstanceOf(ProfesorException.class)
                .hasMessageContaining("El nombre no puede estar vacio");
    }

    @Test
    void debePermitirCambiarDepartamento() {
        Profesor profesor = new Profesor("P003", "Ana Gomez", "Fisica");
        profesor.cambiarDepartamento("Quimica");
        assertThat(profesor.getDepartamento()).isEqualTo("Quimica");
    }
}
