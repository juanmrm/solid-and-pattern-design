package com.demo.pattern.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum TipoDocumento {

    DOC ("doc", "Documento de tipo doc"),
    ODT ("odt", "Documento de tipo odt"),
    PDF ("pdf", "Docuemnto de tipo pdf");

    private final @Getter String nombre;
    private final @Getter String descripcion;

}
