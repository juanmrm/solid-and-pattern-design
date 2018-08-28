package com.demo.pattern.behavioral.strategy;

public class Secretaria {

    public double precio (Matricula matricula) {
        // ajusta la estrategia segun considere
        Alumno alumno = matricula.getAlumno();
        alumno.setEstrategia(getEstrategiaParaAlumno(alumno));
        return matricula.getMaterias()
                .stream()
                .mapToDouble(alumno.getEstrategia()::precioPagado)
                .sum();
    }

    private EstrategiaDePago getEstrategiaParaAlumno(Alumno alumno) {
        EstrategiaDePago estrategia = new EstrategiaDePagoPorDefecto();
        if (alumno.getEdad() < 30) {
            estrategia = new EstrategiaDePagoMenores30();
        } else if (alumno.getEdad() > 50) {
            estrategia = new EstrategiaDePagoParaMayores();
        }
        return estrategia;
    }

}
