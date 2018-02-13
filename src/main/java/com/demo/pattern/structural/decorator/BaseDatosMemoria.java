package com.demo.pattern.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class BaseDatosMemoria implements BaseDatos {

	private final List<String> valores = new ArrayList<>();
	
	@Override
	public void inserta(String registro) {
		valores.add(registro);
	}

	@Override
	public List<String> registros() {
		return new ArrayList<>(valores);
	}

}
