package com.demo.solid.lsp;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Punto2D {

	protected final int x;
	protected final int y;
	
	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Punto2D other = (Punto2D) obj;
		return x == other.x && y == other.y;
	}

	public double distancia (Punto2D otro) {
		int distX = x - otro.x;
		int distY = y - otro.y;
		return Math.sqrt( distX * distX + distY * distY);
	}

}
