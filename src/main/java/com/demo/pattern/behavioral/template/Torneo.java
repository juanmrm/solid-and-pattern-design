package com.demo.pattern.behavioral.template;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Torneo {

	private final String nombre;
	private final List<Solicitud> aceptadas = new ArrayList<>();
	
	public void apunta (Solicitud solicitud) {
		aceptadas.add(solicitud);
	}

}
