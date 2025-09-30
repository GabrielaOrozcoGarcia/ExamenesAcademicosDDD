package co.edu.udec.examenesacademicos.domain.valueobjects;

public record Matricula(String valor) {
    public Matricula {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("La matrícula no puede estar vacía");
        }
        if (!valor.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]+$")) {
            throw new IllegalArgumentException("La matrícula debe ser combinación de letras y números");
        }
    }
}

