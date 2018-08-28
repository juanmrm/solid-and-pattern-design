package com.demo.pattern.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Telefono {

	@Getter
	private boolean musicaOn = false;

    private final CocheMediator mediator;

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
