package com.demo.pattern.structural.flyweight;

public class Jugador2 implements Jugador {

	private final Camiseta camiseta = CamisetaFactory.getCamiseta("Mi equipo");

	public String dibuja() {
		return camiseta.gerCamisetaJugador(Integer.valueOf(2));
	}

}
