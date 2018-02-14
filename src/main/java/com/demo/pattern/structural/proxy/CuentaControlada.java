package com.demo.pattern.structural.proxy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CuentaControlada implements Cuenta{

    private final Cuenta cuenta;

    @Override
    public String getCliente() {
        return this.cuenta.getCliente();
    }

    @Override
    public int getCantidad() {
        return this.cuenta.getCantidad();
    }

    @Override
    public void movimiento(int importe) {
        if ((this.cuenta.getCantidad() + importe) < 0)
            throw new UnsupportedOperationException("La cuenta no puede quedarse en negativo");
        else this.cuenta.movimiento(importe);
    }
}
