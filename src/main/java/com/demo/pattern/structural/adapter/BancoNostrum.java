package com.demo.pattern.structural.adapter;

public interface BancoNostrum {

	void movimiento(String cliente, int cantidad);
	
	Integer estado(String cliente);
}
