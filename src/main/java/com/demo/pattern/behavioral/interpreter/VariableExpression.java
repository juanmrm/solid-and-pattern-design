package com.demo.pattern.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class VariableExpression implements Expression {

    private final String variable;

    @Override
    public Double evaluate(Map<String, Double> contexto) {
        Double valor = contexto.get(variable);
        if (valor == null) {
            return 0.0;
        }
        return valor;
    }
}