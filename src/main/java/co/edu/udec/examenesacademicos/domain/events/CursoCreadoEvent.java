package co.edu.udec.examenesacademicos.domain.events;

import java.time.Instant;

public record CursoCreadoEvent(String codigoCurso, Instant fecha) {}
