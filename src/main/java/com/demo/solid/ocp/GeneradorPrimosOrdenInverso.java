package com.demo.solid.ocp;

import java.util.Collections;
import java.util.List;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos {

    @Override
    protected void ordenar(List<Integer> lista) {
        Collections.reverse(lista);
    }
}
