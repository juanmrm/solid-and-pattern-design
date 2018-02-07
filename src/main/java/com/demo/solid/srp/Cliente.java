package com.demo.solid.srp;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class Cliente {
 
	private final String nombre;
	private final List<Pelicula> favoritas;
}
