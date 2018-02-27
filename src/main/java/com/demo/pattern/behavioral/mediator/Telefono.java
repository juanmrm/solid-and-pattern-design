package com.demo.pattern.behavioral.mediator;

import lombok.Getter;

public class Telefono {

	@Getter
	private boolean musicaOn = false;

    private CocheMediator mediator;

    public Telefono(CocheMediator mediator) {
        this.mediator = mediator;
    }

    public void recibeLlamada() {
        mediator.apagaRadio();
	}

	public void enciendeMusica() {
		musicaOn = true;
	}
	
	public void apagaMusica() {
		musicaOn = false;
	}

}
