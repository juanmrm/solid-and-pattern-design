package com.demo.pattern.behavioral.memento;

public class Oferta3x2Leche implements Oferta {
    @Override
    public void aplica(LineaCompra linea) {
        Producto producto = linea.getProducto();
        if (producto.getNombre().equals("leche") && linea.getCantidad() % 3 == 0) {
            linea.setPrecio(linea.getPrecio() - producto.getPrecio());
        }
    }
}