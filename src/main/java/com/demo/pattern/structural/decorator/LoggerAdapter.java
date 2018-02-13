package com.demo.pattern.structural.decorator;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class LoggerAdapter implements BaseDatos {

	private final Logger logger;
	private final BaseDatos db;

	@Override
	public void inserta(String registro) {
	    this.logger.add("inserta " + registro);
        this.db.inserta(registro);
	}

	@Override
	public List<String> registros() {
	    this.logger.add("lectura");
	    return this.db.registros();
	}

}
