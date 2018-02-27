package com.demo.pattern.behavioral.visitor;

import lombok.Getter;

public class TotalPagadoVisitor implements RegistroEntradaVisitor {

    @Getter
    private int total = 0;

    @Override
    public void visit(RegistroEntrada registro) {
        total += registro.getPagado();
    }

}
