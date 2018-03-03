package com.demo.pattern.behavioral.template;

public class InscripcionLucha extends Inscripcion {

	public InscripcionLucha(Polideportivo polideportivo) {
		super(new Torneo("torneo lucha"), polideportivo);
	}

	@Override
	protected boolean validaRequisitos(Solicitud solicitud) {
        // menores de 15 no pueden apuntarse y peso minimo, 60 kilos
		return solicitud.getEdad() >= 15 && solicitud.getPeso() >= 60;
	}

	@Override
	protected boolean plazasDisponibles(Torneo torneo) {
		return torneo.getAceptadas().size() < 6;
	}

	@Override
	protected boolean cupoCompleto(Torneo torneo) {
		return torneo.getAceptadas().size() == 6;
	}

	@Override
	protected void reservaTorneo(Polideportivo polideportivo, Torneo torneo) {
		polideportivo.reserva(torneo, 4);
	}

}
