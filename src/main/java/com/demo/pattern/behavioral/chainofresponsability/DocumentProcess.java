package com.demo.pattern.behavioral.chainofresponsability;

import java.util.Optional;

public interface DocumentProcess {
    Optional<String> processDocument(ProcessChain pc, Documento doc);
}
