package com.demo.pattern.structural.facade;

public class ServicioFidelizacionImpl implements ServicioFidelizacion {

	@Override
	public void crearTarjeta(String cliente, FidelizacionTipoEnum tipo) {
		BBDD.INSTANCE.addTarjeta(cliente, tipo);
	}

}
