package com.demo.solid.isp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorTextoImpl implements ProcesadorBasico, ProcesadorComplejo {

	private List<String> texto = new ArrayList<>();

	@Override
	public void nueva (String palabra) {
		this.texto.add(palabra);
	}

    @Override
	public String texto () {
		return this.texto.stream()
                .collect(Collectors.joining(" "));
	}

    @Override
	public boolean correcto (Idioma idioma) {
	    return this.texto.stream()
                .allMatch(w -> idioma.diccionario.contains(w.toLowerCase()));
	}
}
