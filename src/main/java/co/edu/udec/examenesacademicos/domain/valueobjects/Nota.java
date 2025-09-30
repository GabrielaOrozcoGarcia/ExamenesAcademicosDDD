package co.edu.udec.examenesacademicos.domain.valueobjects;

public class Nota {

    private final double valor;

    public Nota(double valor) {
        if (valor < 0 || valor > 5) {
            throw new IllegalArgumentException("La nota debe estar entre 0 y 5");
        }
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
