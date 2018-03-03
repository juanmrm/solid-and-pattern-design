package com.demo.pattern.behavioral.template;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class Polideportivo {

	@Getter private final Map<Torneo, Integer> reservas = new HashMap<>();
	
	public void reserva(Torneo torneo, int horas) {
		reservas.put(torneo, horas);
	}
}
