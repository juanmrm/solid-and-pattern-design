package com.demo.pattern.behavioral.template;

import lombok.Data;

@Data
public abstract class Inscripcion {

    private final Torneo torneo;
    private final Polideportivo polideportivo;

    protected final boolean apunta (Solicitud solicitud) {

        if (!validaRequisitos(solicitud)) {
            return false;
        }

        if (!plazasDisponibles(torneo)) {
            return false;
        }

        torneo.apunta(solicitud);

        if (cupoCompleto(torneo)) {
            reservaTorneo(polideportivo, torneo);
        }

        return true;
    }

    protected abstract boolean validaRequisitos(Solicitud solicitud);

    protected abstract boolean plazasDisponibles(Torneo torneo);

    protected abstract boolean cupoCompleto(Torneo torneo);

    protected abstract void reservaTorneo(Polideportivo polideportivo, Torneo torneo);
}
