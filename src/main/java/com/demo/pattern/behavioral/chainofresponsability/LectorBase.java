package com.demo.pattern.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public abstract class LectorBase implements DocumentProcess{

    @Override
    public Optional<String> processDocument(ProcessChain pc, Documento doc) {
        Optional<String> result = this.content(doc);
        return result.isPresent() ? result : pc.processDocument(pc, doc);
    }

    public abstract Optional<String> content(Documento documento);

}
