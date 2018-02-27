package com.demo.pattern.behavioral.interpreter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class InterpreterTest {

    @Test
    public void evaluateComplexExpression() {

        // practica * 0.2 + conducta * 0.1 + examen * 0.7
        // TODO: faltaria por implementar un Parser que fuera capaz de analizar estas expresiones y construir la jerarquia de objetos correctamente.

        Expression expression = new AddExpression(
                new AddExpression (
                        new MultiplyExpression(new VariableExpression("practica"), new LiteralExpression(0.2)),
                        new MultiplyExpression(new VariableExpression("conducta"), new LiteralExpression(0.1))
                ),
                new MultiplyExpression(new VariableExpression("examen"), new LiteralExpression(0.7)));

        Map<String, Double> notas = new HashMap<>();
        notas.put("practica", 7.0);
        notas.put("conducta", 6.0);
        notas.put("examen", 8.7);

        Double notaFinal = expression.evaluate(notas);

        assertEquals( Double.valueOf(7.0 * 0.2 + 6.0 * 0.1 + 8.7 *0.7) , notaFinal);

    }
}
