package com.demo.pattern.behavioral.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.Instant;

@Getter
@AllArgsConstructor
public class RegistroEntrada {

    private final String cliente;
    private final Instant fecha;
    private final int importe;
    private final int pagado;

}
