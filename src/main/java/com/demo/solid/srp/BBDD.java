package com.demo.solid.srp;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BBDD {

	private static final String GENERO_FANTASTICO = "fantastica";
	private static final String GENERO_BELICO = "belico";
	
	public static final String DIRECTOR_SPIELBERG = "Spielberg";
	
	public static final Pelicula ET = new Pelicula("ET", GENERO_FANTASTICO, DIRECTOR_SPIELBERG);
	public static final Pelicula SOLDADO_RYAN = new Pelicula("Salvar al soldado Ryan", GENERO_BELICO, DIRECTOR_SPIELBERG);
	
	public static final Pelicula [] TODAS = { ET, SOLDADO_RYAN};
	
	public static final Cliente JUAN = new Cliente("Juan", Arrays.asList(ET));
	
	public static Map<String, List<Pelicula>> PELIS_POR_DIRECTOR = Arrays.stream(TODAS)
			.collect(Collectors.groupingBy(Pelicula::getDirector));
}
