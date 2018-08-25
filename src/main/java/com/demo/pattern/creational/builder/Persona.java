package com.demo.pattern.creational.builder;

import lombok.Getter;

@Getter
public class Persona {

	private String nombre;
	private int edad;
	private String municipio;
	private String colegio;
	private String lugarTrabajo;
	
	private Persona() {}
	
	public static class Builder {
		private Persona persona;
		
		public Builder(String nombre) {
			persona = new Persona();
			persona.nombre = nombre;
		}
		
		public Builder setMunicipio (String municipio) {
			persona.municipio = municipio;
			return this;
		}
		
		public BuilderMayor setMayor(int edad) {
			if (edad < 18) throw new IllegalArgumentException("es menor de edad " + edad);
			persona.edad = edad;
			return new BuilderMayor(persona);
		}
		
		public BuilderMenor setMenor(int edad) {
			if (edad >= 18) throw new IllegalArgumentException("es mayor de edad " + edad);
			persona.edad = edad;
            return new BuilderMenor(persona);
		}

		public Persona build() {
			return this.persona;
		}
	}

	public static class BuilderMayor {

	    private Persona persona;

        private BuilderMayor(Persona persona) {
            this.persona = persona;
        }

        public BuilderMayor setLugarTrabajo(String lugarTrabajo) {
            persona.lugarTrabajo = lugarTrabajo;
            return this;
        }

        public Persona build() {
            return this.persona;
        }
    }

    public static class BuilderMenor {

	    private Persona persona;

        private BuilderMenor(Persona persona) {
            this.persona = persona;
        }

        public BuilderMenor setColegio(String colegio) {
            this.persona.colegio = colegio;
            return this;
        }

        public Persona build() {
            return this.persona;
        }
    }
}
