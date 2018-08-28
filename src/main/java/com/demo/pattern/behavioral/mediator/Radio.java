package com.demo.pattern.behavioral.mediator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Radio {

    @Getter
	private boolean encendida = false;

    private final CocheMediator mediator;

    public void enciende() {
		encendida = true; 
		mediator.apagaMusica();
	}
	
	public void apaga() {
		encendida = false; 
	}
	
}
