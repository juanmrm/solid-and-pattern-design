package com.demo.pattern.structural.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class PreferenciasComunicacion {

	private final boolean emailDiario;
	private final boolean emailSemanal;
	private final boolean emailHtml;
}
