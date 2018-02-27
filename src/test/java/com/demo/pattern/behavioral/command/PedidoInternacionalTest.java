package com.demo.pattern.behavioral.command;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PedidoInternacionalTest {

	@Test
	public void test() {
		Oficina oficina = new OficinaImpl();

        List<TratamientoPedido> pedidos = Arrays.asList(
                new TratamientoPedidoInternacional(new PedidoInternacional("Mordor", 100)),
                new TratamientoPedidoInternacional(new PedidoInternacional("Comarca", 100))
        );

        List<String> resultados = pedidos.stream()
                .map(oficina::recibe)
                .collect(Collectors.toList());

        assertEquals(resultados.size(), pedidos.size());
        assertTrue(resultados.get(0).contains("No se ha podido tratar el pedido"));
        assertTrue(resultados.get(1).contains("Pedido tratado correctament"));

	}

}
