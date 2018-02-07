package com.demo.solid.srp;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestRecomendador {

	@Test
	public void test() {
		Recomendador r = new Recomendador();
		
		List<Pelicula> recomenaciones = r.recomendaciones(BBDD.JUAN);
		
		Assert.assertFalse(recomenaciones.contains(BBDD.ET));
	}
	
	@Test 
	public void test_formato() {
		Recomendador recomendador = new Recomendador();
		RecomendadorToCSV recomendadorToCSV = new RecomendadorToCSV();

		String csv = recomendadorToCSV.recomendacionesCSV(recomendador.recomendaciones(BBDD.JUAN));
		
		String esperado = "Salvar al soldado Ryan,Spielberg,belico";
		
		Assert.assertEquals(esperado, csv);

	}

}
