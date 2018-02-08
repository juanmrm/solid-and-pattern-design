package com.demo.solid.isp;

import java.util.Arrays;
import java.util.List;

public enum Idioma {
	
	EN ("I","am","angry"), 
	ES ("tengo","hambre"), 
	CA ("tenc", "fam");
	
	List<String> diccionario;

	Idioma(String ... palabras) {
		this.diccionario = Arrays.asList(palabras);
	}

}
