package co.edu.udec.examenesacademicos.domain.events;

import java.time.Instant;

public record ProfesorRegistradoEvent(String idProfesor, Instant fecha) {}
