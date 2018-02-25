package com.demo.pattern.behavioral.chainofresponsability;

import java.util.Optional;

public class LectorOdt extends LectorBase {

    @Override
    public Optional<String> content(Documento doc) {
        if (TipoDocumento.ODT.equals(doc.getTipo())) {
            return Optional.of(doc.getTipo().getNombre() + " " + doc.getContenido());
        }
        else return Optional.empty();
    }
}
