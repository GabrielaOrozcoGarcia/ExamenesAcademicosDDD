package co.edu.udec.examenesacademicos.domain.model;

public class ExamenPractico extends Examen {

    private final double desempeno;
    private final double proyecto;

    public ExamenPractico(String idExamen, String asignatura, double desempeno, double proyecto) {
        super(idExamen, asignatura);
        if (desempeno < 0 || desempeno > 5) throw new IllegalArgumentException("El desempeño debe estar entre 0 y 5");
        if (proyecto < 0 || proyecto > 5) throw new IllegalArgumentException("El proyecto debe estar entre 0 y 5");
        this.desempeno = desempeno;
        this.proyecto = proyecto;
    }

    @Override
    public double calcularNotaFinal() {
        return (desempeno * 0.4) + (proyecto * 0.6);
    }
}
