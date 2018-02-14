package com.demo.pattern.structural.facade;

public class ServicioComunicacionImpl implements ServicioComunicacion {

	@Override
	public void setPreferencias(String cliente, PreferenciasComunicacion preferencias) {
		BBDD.INSTANCE.setPreferencias(cliente, preferencias);
	}

}
