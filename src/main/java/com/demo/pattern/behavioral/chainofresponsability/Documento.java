package com.demo.pattern.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Documento {

    @Getter
	private final TipoDocumento tipo;

    @Getter
	private final String contenido;
}
