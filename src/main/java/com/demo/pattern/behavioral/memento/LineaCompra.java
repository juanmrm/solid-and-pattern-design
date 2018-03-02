package com.demo.pattern.behavioral.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LineaCompra {

    private Producto producto;
    private int cantidad;
    private int precio;

    public void incrementa() {
        cantidad++;
        precio += producto.getPrecio();
    }

}
