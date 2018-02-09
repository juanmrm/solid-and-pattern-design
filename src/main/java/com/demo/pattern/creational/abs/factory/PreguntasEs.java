package com.demo.pattern.creational.abs.factory;

public class PreguntasEs implements Preguntas {

	@Override
	public String preguntaHora() {
		return "¿qué hora es?";
	}

	@Override
	public String preguntaTiempo() {
		return "¿qué tiempo hace?";
	}

}
