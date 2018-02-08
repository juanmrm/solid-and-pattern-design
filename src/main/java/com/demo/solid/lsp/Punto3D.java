package com.demo.solid.lsp;

import lombok.ToString;

@ToString(callSuper = true)
public class Punto3D extends Punto2D {

	private final int z;

	public Punto3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public double distancia (Punto3D otro) {
		int distX = x - otro.x;
		int distY = y - otro.y;
		int distZ = z - otro.z;
		return Math.sqrt( distX * distX + distY * distY + distZ * distZ);
	}

	@Override
	public boolean equals(Object obj) {
		if (getClass() != obj.getClass())
			return false;
		Punto3D other = (Punto3D) obj;
		return x == other.x && y == other.y && z == other.z;
	}

}
