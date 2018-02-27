package com.demo.pattern.behavioral.mediator;

public class Coche {

    private CocheMediator mediator;

    public Coche(CocheMediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
	    this.mediator.enciendeRadio();
	}
	
	public void apaga() {
		this.mediator.apagaRadio();
	}
	
}
