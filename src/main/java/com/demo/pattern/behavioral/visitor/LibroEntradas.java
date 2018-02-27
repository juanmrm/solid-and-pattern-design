package com.demo.pattern.behavioral.visitor;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LibroEntradas {

    private final List<RegistroEntrada> registros;

    public void visit (RegistroEntradaVisitor visitor) {
        this.registros.forEach(visitor::visit);
    }

}
