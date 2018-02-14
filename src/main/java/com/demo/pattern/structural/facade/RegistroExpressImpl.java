package com.demo.pattern.structural.facade;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RegistroExpressImpl implements RegistroExpress {

    private final ServicioConfiguracion configuracion;
    private final ServicioFidelizacion fidelizacion;
    private final ServicioComunicacion comunicacion;

    @Override
    public void registro(final String nombreCliente, final String emailCliente) {
        fidelizacion.crearTarjeta(nombreCliente, FidelizacionTipoEnum.BASICA);
        configuracion.addEmail(nombreCliente, emailCliente);
        // crea una preferencia para email semanal en formato html
        PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
        comunicacion.setPreferencias(nombreCliente, preferencias);
    }

}
