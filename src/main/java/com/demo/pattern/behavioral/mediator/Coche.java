package com.demo.pattern.behavioral.mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Coche {

    private final CocheMediator mediator;

    public void enciende() {
	    this.mediator.enciendeRadio();
	}
	
	public void apaga() {
		this.mediator.apagaRadio();
	}
	
}
