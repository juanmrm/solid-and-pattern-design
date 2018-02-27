package com.demo.pattern.behavioral.chainofresponsability;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LectorDocumentosTest {

	@Test
	public void test() {
		ProcesadorDocumentos procesador = new ProcesadorDocumentos(Arrays.asList(
		                new LectorDoc(),
                        new LectorOdt(),
                        new LectorPdf()));

		List<Documento> lista = Arrays.asList(
			 new Documento(TipoDocumento.DOC, "documento doc"),
			 new Documento(TipoDocumento.PDF, "documento pdf"),
			 new Documento(TipoDocumento.ODT, "documento odt"));
		
		String resultado = procesador.concatena(lista);
		
		String esperado = "doc documento doc\n" + "pdf documento pdf\n" + "odt documento odt\n";
		
		assertEquals(esperado, resultado);
	}

}
