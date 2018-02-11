package com.demo.pattern.structural.adapter;

public interface InternationalMoneyOrganization {

	void transfer(int cantidad, String cliente);
	
	/** debe devolver 0 si el cliente no existe */
	int state(String cliente);

}
