package com.demo.pattern.behavioral.chainofresponsability;

import java.util.Optional;

public class LectorPdf extends LectorBase {

    @Override
    public Optional<String> content(Documento doc) {
        if (TipoDocumento.PDF.equals(doc.getTipo())) {
            return Optional.of(doc.getTipo().getNombre() + " " + doc.getContenido());
        }
        else return Optional.empty();
    }
}
