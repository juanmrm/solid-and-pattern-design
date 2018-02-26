package com.demo.pattern.behavioral.interpreter;

import lombok.AllArgsConstructor;

import java.util.Map;

@AllArgsConstructor
public class AddExpression implements Expression {

    private final Expression expr1;
    private final Expression expr2;

    @Override
    public Double evaluate(Map<String, Double> contexto) {
        return expr1.evaluate(contexto) + expr2.evaluate(contexto);
    }
}