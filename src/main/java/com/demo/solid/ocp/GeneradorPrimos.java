package com.demo.solid.ocp;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GeneradorPrimos {

	public List<Integer> primos (int limit) {
	    List<Integer> primos = IntStream.range(2, limit - 1)
                .filter(this::esPrimo)
                .boxed()
                .collect(Collectors.toList());

	    this.ordenar(primos);

	    return primos;
	}

	private boolean esPrimo (int candidato) {
        return IntStream.range(2, candidato - 1)
                .noneMatch(i ->  candidato % i == 0);
	}

    protected void ordenar(List<Integer> lista) {
        Collections.sort(lista);
    }

}
