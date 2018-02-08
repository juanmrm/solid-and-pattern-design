package com.demo.solid.dip.bbdd;

import com.demo.solid.dip.negocio.InventarioBBDD;

public class InventarioBBDDImpl implements InventarioBBDD {

	@Override
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}
}
