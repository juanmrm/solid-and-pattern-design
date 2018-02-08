package com.demo.solid.lsp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestPuntos {

	private final Punto2D referencia = new Punto2D(3,5);

	private final List<Punto2D> puntos_prueba = Arrays.asList(
	        new Punto2D(2,3),
            new Punto2D(3, 5),
            // TODO: Si introduciomos un punto cuya distancia calculada al punto de referencia es 0, pero el metodo equals no los puede comparar -> Punto3D no es un substituto seguro de Punto2D
            //new Punto3D(3,5, 0),
            new Punto2D(4,3));

	@Test
	public void test_iguales_si_solo_si_distancia_0() {

		for (Punto2D punto: puntos_prueba) {
            System.out.println(punto);
			Assert.assertEquals("test para " + referencia + " y " + punto,
					             referencia.equals(punto),
					             referencia.distancia(punto) == 0);
		}
	}

}
