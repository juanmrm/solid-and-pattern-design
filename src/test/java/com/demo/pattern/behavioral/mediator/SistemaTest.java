package com.demo.pattern.behavioral.mediator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SistemaTest {

	private Radio radio;
	private Telefono telefono;
	private Coche coche;
	
	@Before
	public void init() {
        CocheMediator mediator = new CocheMediatorImpl();
		radio = new Radio(mediator);
		telefono = new Telefono(mediator);
		coche = new Coche(mediator);

		mediator.addRadio(radio);
		mediator.addTelefono(telefono);
	}
	
	@Test
	public void test_encender_apagar_coche() {
		assertFalse(radio.isEncendida());
		assertFalse(telefono.isMusicaOn());
		
		telefono.enciendeMusica();
		assertTrue(telefono.isMusicaOn());
		
		coche.enciende();
		
		assertTrue(radio.isEncendida());
		assertFalse(telefono.isMusicaOn());
	
		coche.apaga();
		assertFalse(radio.isEncendida());
	}

	@Test
	public void test_suena_telefono() {
		radio.enciende();
		assertTrue(radio.isEncendida());
		
		telefono.recibeLlamada();
		
		assertFalse(radio.isEncendida());
	}
	
	@Test
	public void test_enciende_radio() {
		
		telefono.enciendeMusica();
		assertTrue(telefono.isMusicaOn());
		
		radio.enciende();
		
		assertFalse(telefono.isMusicaOn());
	}
}
