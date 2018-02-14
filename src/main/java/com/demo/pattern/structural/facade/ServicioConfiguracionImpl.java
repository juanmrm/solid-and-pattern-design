package com.demo.pattern.structural.facade;


public class ServicioConfiguracionImpl implements ServicioConfiguracion {

	@Override
	public void addEmail(String cliente, String email) {
	    BBDD.INSTANCE.setEmail(cliente, email);
	}
	
}
