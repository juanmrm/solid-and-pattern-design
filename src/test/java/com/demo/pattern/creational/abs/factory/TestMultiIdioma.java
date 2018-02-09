package com.demo.pattern.creational.abs.factory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMultiIdioma {

	@Test
	public void test_es() {
		AbstractFactory factory = new FactoryEs();

		Preguntas preguntas = factory.getPreguntas();
		
		assertEquals("¿qué hora es?", preguntas.preguntaHora() );
		assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );
		
		Saludos saludos = factory.getSaludos();
		
		assertEquals("buenos días", saludos.buenosDias());
		assertEquals("buenas tardes", saludos.buenasTardes());
	}
	
	@Test
	public void test_en() {
	    AbstractFactory factory = new FactoryEn();

		Preguntas preguntas = factory.getPreguntas();
		
		assertEquals("what time is it?", preguntas.preguntaHora() );
		assertEquals("how is the weather?", preguntas.preguntaTiempo() );
		
		Saludos saludos = factory.getSaludos();
		
		assertEquals("good morning", saludos.buenosDias());
		assertEquals("good afternoon", saludos.buenasTardes());
	}

}
