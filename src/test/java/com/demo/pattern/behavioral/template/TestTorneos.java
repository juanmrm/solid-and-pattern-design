package com.demo.pattern.behavioral.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestTorneos {
	
	private Solicitud solicitud_edad_9 = new Solicitud("sol 9", 9, 40);
	private Solicitud solicitud_edad_15_ligero = new Solicitud("sol 15 ligero", 15, 40);
	private Solicitud solicitud_edad_15_pesado = new Solicitud("sol 15 pesado", 15, 70);
	
	private Polideportivo polideportivo = new Polideportivo();
	private InscripcionLucha lucha = new InscripcionLucha(polideportivo);
	private InscripcionTenis tenis = new InscripcionTenis(polideportivo);

	@Test
	public void test_torneo_tenis_acceptados() {
		assertFalse("con edad 9 no puede apuntarse",tenis.apunta(solicitud_edad_9));
		assertTrue("con edad 15 si puede apuntarse",tenis.apunta(solicitud_edad_15_ligero));
		assertTrue("con edad 15 si puede apuntarse",tenis.apunta(solicitud_edad_15_pesado));
		assertEquals("dos aceptados", 2, tenis.getTorneo().getAceptadas().size());
	}
	
	@Test
	public void test_torneo_lucha_acceptados() {
		assertFalse("con edad 9 no puede apuntarse",lucha.apunta(solicitud_edad_9));
		assertFalse("con edad 15 pero ligero puede apuntarse",lucha.apunta(solicitud_edad_15_ligero));
		assertTrue("con edad 15 y peso adecuado puede apuntarse",lucha.apunta(solicitud_edad_15_pesado));
		assertEquals("un aceptado", 1, lucha.getTorneo().getAceptadas().size());
	}

	
	@Test
	public void test_torneo_tenis_limite() {
		for (int i = 0; i < 4; i++) {
			assertTrue("apuntado participante " + (i+1), tenis.apunta(new Solicitud("participante " + 1, 15, 60)));
		}
		
		assertFalse("Ya hay 4 apuntados", tenis.apunta(solicitud_edad_15_ligero));
		
		Integer horasReservadas = polideportivo.getReservas().get(tenis.getTorneo());
		
		assertNotNull("hay reserva hecha", horasReservadas);
		assertEquals("la reserva es de 8 horas", 8, horasReservadas.intValue());
	}

	
	@Test
	public void test_torneo_lucha_limite() {
		for (int i = 0; i < 6; i++) {
			assertTrue("apuntado participante " + (i+1), lucha.apunta(new Solicitud("participante " + 1, 15, 70)));
		}
		
		assertFalse("Ya hay 6 apuntados", lucha.apunta(solicitud_edad_15_pesado));
		
		Integer horasReservadas = polideportivo.getReservas().get(lucha.getTorneo());
		
		assertNotNull("hay reserva hecha", horasReservadas);
		assertEquals("la reserva es de 4 horas", 4, horasReservadas.intValue());
	}

}
