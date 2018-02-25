package com.demo.pattern.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class LectorBase implements LectorDocumentos{

    private final TipoDocumento tipo;

    @Override
    public String contenido(Documento documento) {
        return this.tipo.getNombre() + " " + documento.getContenido();
    }

    @Override
    public boolean puedeProcesarDocumento(Documento documento) {
        return this.tipo.equals(documento.getTipo());
    }

}
