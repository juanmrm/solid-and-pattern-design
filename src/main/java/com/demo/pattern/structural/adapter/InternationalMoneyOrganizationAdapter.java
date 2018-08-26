package com.demo.pattern.structural.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InternationalMoneyOrganizationAdapter implements InternationalMoneyOrganization{

    private final BancoNostrum bancoNostrum;

    @Override
    public void transfer(int cantidad, String cliente) {
        this.bancoNostrum.movimiento(cliente, cantidad);
    }

    @Override
    public int state(String cliente) {
        Integer estado = this.bancoNostrum.estado(cliente);
        return estado == null ? 0 : estado;
    }
}
