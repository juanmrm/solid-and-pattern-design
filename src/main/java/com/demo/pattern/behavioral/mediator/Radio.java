package com.demo.pattern.behavioral.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Radio {

    @Getter
	private boolean encendida = false;

    private CocheMediator mediator;

    public Radio(CocheMediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
		encendida = true; 
		mediator.apagaMusica();
	}
	
	public void apaga() {
		encendida = false; 
	}
	
}
