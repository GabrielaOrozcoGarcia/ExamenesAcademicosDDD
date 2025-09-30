package co.edu.udec.examenesacademicos.domain.valueobjects;

public record Cedula(String valor) {

    public Cedula {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("La cedula no puede estar vacia");
        }
        if (!valor.matches("\\d{6,10}")) {
            throw new IllegalArgumentException("La cedula debe tener entre 6 y 10 digitos numericos");
        }
    }
}
