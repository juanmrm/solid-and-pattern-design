package com.demo.pattern.behavioral.chainofresponsability;

public interface LectorDocumentos {

    String contenido(Documento documento);

	boolean puedeProcesarDocumento(Documento documento);

}
