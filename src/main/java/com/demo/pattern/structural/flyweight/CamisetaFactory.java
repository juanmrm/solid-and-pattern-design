package com.demo.pattern.structural.flyweight;

import java.util.HashMap;

public class CamisetaFactory {

    private static final HashMap<String, Camiseta> camisetaEquiposMap = new HashMap();

    public static Camiseta getCamiseta(String equipo) {
        Camiseta camiseta = camisetaEquiposMap.get(equipo);
        if(camiseta == null) {
            camiseta = new Camiseta();
            camisetaEquiposMap.put(equipo, camiseta);
            System.out.println("Creada camiseta para equipo: " + equipo);
        }
        return camiseta;
    }
}
