package com.demo.solid.isp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class TestProcesadorTexto {

	@Test
	public void test_simple() {
		
		ProcesadorBasico procesador = new ProcesadorTextoImpl();
		
		procesador.nueva("No");
		procesador.nueva("himporta");
		procesador.nueva("la");
		procesador.nueva("hortografia");
		
		assertEquals("No himporta la hortografia", procesador.texto());
	}
	
	@Test
	public void test_con_idioma() {

		ProcesadorTextoImpl procesadorTextoImpl = new ProcesadorTextoImpl();
		ProcesadorComplejo procesadorComplejo = procesadorTextoImpl;
		ProcesadorBasico procesadorBasico = procesadorTextoImpl;

		procesadorBasico.nueva("Tengo");
		procesadorBasico.nueva("hambre");
		
		assertEquals("Tengo hambre", procesadorBasico.texto());
		
		assertTrue(procesadorComplejo.correcto(Idioma.ES));
	}
}
