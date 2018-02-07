package com.demo.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class Recomendador {

	public List<Pelicula> recomendaciones (Cliente cliente) {

        return cliente.getFavoritas().stream()
                .flatMap(p -> BBDD.PELIS_POR_DIRECTOR.get(p.getDirector()).stream())
                .filter(p -> !cliente.getFavoritas().contains(p))
                .distinct()
                .collect(Collectors.toList());
	}

}
