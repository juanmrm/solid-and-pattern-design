package com.demo.pattern.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class LiteralExpression implements Expression {

    private final double literal;

    @Override
    public Double evaluate(Map<String, Double> contexto) {
        return literal;
    }
}