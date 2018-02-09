package com.demo.pattern.creational.abs.factory;

public class SaludosEn implements Saludos {

	@Override
	public String buenosDias() {
		return "good morning";
	}

	@Override
	public String buenasTardes() {
		return "good afternoon";
	}

}
