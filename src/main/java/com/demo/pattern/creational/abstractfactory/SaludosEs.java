package com.demo.pattern.creational.abstractfactory;

public class SaludosEs implements Saludos {

	@Override
	public String buenosDias() {
		return "buenos días";
	}

	@Override
	public String buenasTardes() {
		return "buenas tardes";
	}

}
