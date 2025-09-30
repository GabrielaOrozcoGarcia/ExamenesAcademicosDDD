package co.edu.udec.examenesacademicos.domain.model;

public class ExamenEscrito extends Examen {

    private final int numeroPreguntas;
    private final int respuestasCorrectas;

    public ExamenEscrito(String idExamen, String asignatura, int numeroPreguntas, int respuestasCorrectas) {
        super(idExamen, asignatura);
        if (numeroPreguntas <= 0) throw new IllegalArgumentException("Debe haber preguntas en el examen");
        if (respuestasCorrectas < 0 || respuestasCorrectas > numeroPreguntas) {
            throw new IllegalArgumentException("Respuestas correctas invalidas");
        }
        this.numeroPreguntas = numeroPreguntas;
        this.respuestasCorrectas = respuestasCorrectas;
    }

    @Override
    public double calcularNotaFinal() {
        return (double) respuestasCorrectas / numeroPreguntas * 5.0;
    }
}
