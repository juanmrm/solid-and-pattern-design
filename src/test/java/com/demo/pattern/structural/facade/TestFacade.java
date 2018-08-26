package com.demo.pattern.structural.facade;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFacade {

	private String nombreCliente = "Antonia";
	private String emailCliente = "antonia@email.com";

	private ServicioConfiguracion configuracion = new ServicioConfiguracionImpl();
    private ServicioFidelizacion fidelizacion = new ServicioFidelizacionImpl();
    private ServicioComunicacion comunicacion = new ServicioComunicacionImpl();

	@Before
	public void init() {
	    BBDD.INSTANCE.clear();
	}
	
	@Test
	public void test_original() {

		// Codigo necesario para dar de alta un cliente con la configuracion tipica
		fidelizacion.crearTarjeta(nombreCliente, FidelizacionTipoEnum.BASICA);
		configuracion.addEmail(nombreCliente, emailCliente);
		PreferenciasComunicacion preferencias = new PreferenciasComunicacion(false, true, true);
		comunicacion.setPreferencias(nombreCliente, preferencias);
		
		// tests de la incripcion
		compruebaInscripion();
	}
	
	@Test
	public void test_facade() {
		// usa aqui tu servicio facade para dar de alta un usuario
		// con los datos particulares nombreCliente e emailCliente
		RegistroExpressFacade registro = new RegistroExpressFacade(configuracion, fidelizacion, comunicacion);
        registro.registroExpres(nombreCliente, emailCliente);

		// deja esta invocacion para comprobar el comportamiento de tu facade
		compruebaInscripion();
	}

	private void compruebaInscripion() {
		assertEquals(BBDD.INSTANCE.getTarjeta(nombreCliente), FidelizacionTipoEnum.BASICA);
		assertEquals(BBDD.INSTANCE.getEmail(nombreCliente), emailCliente);
		PreferenciasComunicacion preferencias = BBDD.INSTANCE.getPreferencias(nombreCliente);
		assertNotNull(preferencias);
		assertFalse("no recibe email diario", preferencias.isEmailDiario());
		assertTrue("recibe email semanal", preferencias.isEmailSemanal());
		assertTrue("recibe email html", preferencias.isEmailHtml());
	}

}
