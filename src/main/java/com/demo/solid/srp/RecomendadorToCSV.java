package com.demo.solid.srp;

import java.util.List;
import java.util.stream.Collectors;

public class RecomendadorToCSV {

    public String recomendacionesCSV (List<Pelicula> peliculas) {

        return peliculas.stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }

}
