package com.demo.pattern.behavioral.memento;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MementoTest {

    @Test
    public void restaura_cesta() {
        CestaCompra cesta = new CestaCompra();
        cesta.add(new Oferta3x2Leche());
        Producto leche = new Producto("leche", 100);
        Producto galletas = new Producto("galletas", 120);
        cesta.add(leche);
        cesta.add(galletas);
        cesta.add(leche);
        CestaCompra.Memento anterior = cesta.creaEstado();
        cesta.add(leche);

        Map<Producto, LineaCompra> lista = cesta.getLista();
        assertNotNull(lista.get(leche));
        assertNotNull(lista.get(galletas));

        System.out.println("Inicial \n" + cesta);

        LineaCompra lineaLeche = lista.get(leche);
        assertEquals(3, lineaLeche.getCantidad());
        assertEquals(200, lineaLeche.getPrecio());

        LineaCompra lineaGalletas = lista.get(galletas);
        assertEquals(1, lineaGalletas.getCantidad());
        assertEquals(120, lineaGalletas.getPrecio());

        cesta.restaura(anterior);

        System.out.println("Restaurada \n" + cesta);

        Map<Producto, LineaCompra> listaRestaurada = cesta.getLista();
        LineaCompra lineaLecheRestaurada = listaRestaurada.get(leche);
        assertEquals(2, lineaLecheRestaurada.getCantidad());
        assertEquals(200, lineaLecheRestaurada.getPrecio());

        LineaCompra lineaGalletasRestaurada = listaRestaurada.get(galletas);
        assertEquals(1, lineaGalletasRestaurada.getCantidad());
        assertEquals(120, lineaGalletasRestaurada.getPrecio());

    }
}
