package com.demo.pattern.behavioral.chainofresponsability;

import java.util.List;
import java.util.Optional;

public class ProcesadorDocumentos {

    private final ProcessChain pc;

    public ProcesadorDocumentos(final List<? extends DocumentProcess> processors) {
        this.pc = new ProcessChainImpl(processors);
    }

    public String concatena (List<Documento> documentos)  {
    	final StringBuilder resultado = new StringBuilder();

    	documentos.forEach(doc -> {
                this.pc.init();
                Optional<String> res = this.pc.processDocument(this.pc, doc);
                resultado.append(res.isPresent() ? res.get() : "No se ha podido procesar el tipo: " + doc.getTipo());
                resultado.append("\n");
            }
        );

  	    return resultado.toString();
    }

    public static class ProcessChainImpl implements ProcessChain {

        private final List<? extends DocumentProcess> procesadores;
        private int currentPosition = 0;

        public ProcessChainImpl(List<? extends DocumentProcess> procesadores) {
            this.procesadores = procesadores;
        }

        @Override
        public void init() {
            this.currentPosition = 0;
        }

        @Override
        public Optional<String> processDocument(ProcessChain pc, Documento doc) {
            if(currentPosition< procesadores.size()) {
                DocumentProcess processor = procesadores.get(currentPosition);
                currentPosition++;
                return processor.processDocument(pc, doc);
            } else {
                return Optional.empty();
            }
        }
    }

}
