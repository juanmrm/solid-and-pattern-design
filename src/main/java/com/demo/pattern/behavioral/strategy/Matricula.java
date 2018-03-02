package com.demo.pattern.behavioral.strategy;

import lombok.Data;

import java.util.List;

@Data
public class Matricula {
    private final Alumno alumno;
    private final List<Materia> materias;
}
