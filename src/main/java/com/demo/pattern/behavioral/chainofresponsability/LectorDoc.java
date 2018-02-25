package com.demo.pattern.behavioral.chainofresponsability;

import java.util.Optional;

public class LectorDoc extends LectorBase {

    @Override
    public Optional<String> content(Documento doc) {
        if (TipoDocumento.DOC.equals(doc.getTipo())) {
            return Optional.of(doc.getTipo().getNombre() + " " + doc.getContenido());
        }
        else return Optional.empty();
    }
}
