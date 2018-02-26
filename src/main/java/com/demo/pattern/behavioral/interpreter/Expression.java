package com.demo.pattern.behavioral.interpreter;

import java.util.Map;

public interface Expression {
    Double evaluate(Map<String, Double> contexto);
}