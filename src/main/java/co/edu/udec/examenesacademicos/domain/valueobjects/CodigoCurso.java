package co.edu.udec.examenesacademicos.domain.valueobjects;

public record CodigoCurso(String valor) {

    public CodigoCurso {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("El codigo del curso no puede estar vacio");
        }
        if (!valor.matches("[A-Z]{3}\\d{3}")) {
            throw new IllegalArgumentException("El codigo debe tener el formato AAA999 (tres letras y tres numeros)");
        }
    }
}
