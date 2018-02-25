package com.demo.pattern.behavioral.chainofresponsability;

import java.util.Optional;

public interface ProcessChain {

    void init();

    Optional<String> processDocument(ProcessChain pc, Documento doc);

}
