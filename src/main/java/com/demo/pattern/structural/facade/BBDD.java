package com.demo.pattern.structural.facade;

import java.util.HashMap;
import java.util.Map;

public enum BBDD {

	INSTANCE;
	
	private Map<String, String> emails = new HashMap<>();
    private Map<String, FidelizacionTipoEnum> tarjetas = new HashMap<>();
    private Map<String, PreferenciasComunicacion> preferencias = new HashMap<>();

	public void clear() {
		emails.clear();
		tarjetas.clear();
		preferencias.clear();
	}
	
	public void setEmail(String cliente, String email) {
	    emails.put(cliente, email);
	}
	
	public String getEmail(String cliente) {
	    return emails.get(cliente);
	}
	
	public void addTarjeta (String cliente, FidelizacionTipoEnum tipo) {
	    tarjetas.put(cliente, tipo);
	}
	
	public FidelizacionTipoEnum getTarjeta (String cliente) {
	    return tarjetas.get(cliente);
	}
	
	public void setPreferencias (String cliente, PreferenciasComunicacion preferencia) {
		preferencias.put(cliente, preferencia);
	}
	
	public PreferenciasComunicacion getPreferencias (String cliente) {
	    return preferencias.get(cliente);
	}
}
