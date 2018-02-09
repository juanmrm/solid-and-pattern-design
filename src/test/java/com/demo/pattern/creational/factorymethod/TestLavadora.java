package com.demo.pattern.creational.factorymethod;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestLavadora {

	@Test
	public void test_carga_frontal() {
		
		Lavadora lavadora = new LavadoraCargaFrontalFactory().crea();
		
		assertEquals("frontal", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

	@Test
	public void test_carga_superior() {
		
		Lavadora lavadora = new LavadoraCargaSuperiorFactory().crea();
		
		assertEquals("superior", lavadora.tipoCarga);
		assertTrue(lavadora.tieneMandos);
		assertTrue(lavadora.tieneTambor);
	}

}
