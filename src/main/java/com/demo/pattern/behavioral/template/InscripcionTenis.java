package com.demo.pattern.behavioral.template;

public class InscripcionTenis extends Inscripcion{

    public InscripcionTenis(Polideportivo polideportivo) {
        super(new Torneo("torneo tenis"), polideportivo);
    }

    @Override
    protected boolean validaRequisitos(Solicitud solicitud) {
        // menores de 10 no pueden apuntarse
        return solicitud.getEdad() >= 10;
    }

    @Override
    protected boolean plazasDisponibles(Torneo torneo) {
        return torneo.getAceptadas().size() < 4;
    }

    @Override
    protected boolean cupoCompleto(Torneo torneo) {
        return torneo.getAceptadas().size() == 4;
    }

    @Override
    protected void reservaTorneo(Polideportivo polideportivo, Torneo torneo) {
        polideportivo.reserva(torneo, 8);
    }
	
}
