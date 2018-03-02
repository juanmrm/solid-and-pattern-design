package com.demo.pattern.behavioral.strategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private int edad;
    @Setter private EstrategiaDePago estrategia;
}
