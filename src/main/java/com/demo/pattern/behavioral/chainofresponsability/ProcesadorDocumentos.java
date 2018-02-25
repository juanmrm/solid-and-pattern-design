package com.demo.pattern.behavioral.chainofresponsability;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
public class ProcesadorDocumentos {

    private final List<LectorDocumentos> lectores;

	public String concatena (List<Documento> documentos)  {
    	final StringBuilder resultado = new StringBuilder();

    	documentos.forEach(
    	        doc -> {
                    Optional<LectorDocumentos> lector = this.lectores.stream()
                        .filter(lec -> lec.puedeProcesarDocumento(doc))
                        .findFirst();

                    if (lector.isPresent()) {
                        resultado.append(lector.get().contenido(doc));
                    }
                    else {
                        resultado.append("No se ha podido procesar el tipo: ")
                                .append(doc.getTipo());
                    }
                    resultado.append("\n");
                }
        );

  	    return resultado.toString();
    }

}
