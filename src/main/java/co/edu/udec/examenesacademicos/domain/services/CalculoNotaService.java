package co.edu.udec.examenesacademicos.domain.services;

import java.util.List;

public class CalculoNotaService {
    public double calcularPromedio(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        return notas.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}

