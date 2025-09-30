package co.edu.udec.examenesacademicos.domain.events;

import java.time.Instant;

public record AlumnoRegistradoEvent(String matricula, Instant fecha) {}

