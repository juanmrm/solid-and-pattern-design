package com.demo.pattern.behavioral.memento;

import lombok.Getter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class CestaCompra {

    @Getter
    private Map<Producto, LineaCompra> lista = new LinkedHashMap<>();
    private List<Oferta> ofertas = new ArrayList<>();

    public void add(Oferta oferta) {
        this.ofertas.add(oferta);
    }

    public void add(Producto producto) {
        LineaCompra linea = this.getLinea(producto);
        linea.incrementa();
        this.aplicaOfertas(linea);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        lista.forEach((p,l) -> sb.append(l.toString()).append("\n"));
        return sb.toString();
    }

    private LineaCompra getLinea(Producto producto) {
        LineaCompra linea = this.lista.get(producto);
        if (linea == null) {
            linea = new LineaCompra(producto, 0, 0);
            this.lista.put(producto, linea);
        }
        return linea;
    }

    private void aplicaOfertas(LineaCompra linea) {
        for (Oferta oferta: ofertas) {
            oferta.aplica(linea);
        }
    }

    public Memento creaEstado() {
        return new Memento(lista);
    }

    public void restaura(Memento memento) {
        lista = memento.estado;
    }

    public static class Memento {

        private final Map<Producto, LineaCompra> estado;

        // Deep copy of the map. We cannot use a shallow copy
        private Memento(Map<Producto, LineaCompra> estado) {
            this.estado = new LinkedHashMap<>(estado.size());
            for (Map.Entry<Producto, LineaCompra> each: estado.entrySet()) {
                LineaCompra linea = each.getValue();
                this.estado.put( each.getKey(), new LineaCompra(linea.getProducto(), linea.getCantidad(), linea.getPrecio()));
            }
        }
    }
}
