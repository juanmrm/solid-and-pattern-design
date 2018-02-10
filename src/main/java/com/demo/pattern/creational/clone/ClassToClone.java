package com.demo.pattern.creational.clone;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ClassToClone implements Cloneable{ // Implementamos Cloneable

    private String s1;
    private String s2;

    @Override
    public ClassToClone clone() { // Ampliamos la visibilidad de protected a public
        try {
            return (ClassToClone) super.clone(); // Casteamos para devolver el tipo correcto
        } catch (CloneNotSupportedException ex) {
            // No es posible que se produzca
            throw new AssertionError(); // No obliga al cliente a tratar la excepcion.
        }
    }
}
