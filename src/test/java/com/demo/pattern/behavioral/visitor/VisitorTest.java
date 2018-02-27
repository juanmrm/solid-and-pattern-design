package com.demo.pattern.behavioral.visitor;

import org.junit.Test;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void totalPagado() {

        List<RegistroEntrada> registros = Arrays.asList(
                new RegistroEntrada("cliente1", Instant.now(), 50, 25),
                new RegistroEntrada("cliente2", Instant.now(), 100, 5),
                new RegistroEntrada("cliente3", Instant.now(), 5, 5));

        LibroEntradas libroEntradas = new LibroEntradas(registros);

        TotalPagadoVisitor visitor = new TotalPagadoVisitor();

        libroEntradas.visit(visitor);

        int totalCalculado = registros.stream()
                .mapToInt(RegistroEntrada::getPagado)
                .sum();

        assertEquals(totalCalculado, visitor.getTotal());
    }
}
