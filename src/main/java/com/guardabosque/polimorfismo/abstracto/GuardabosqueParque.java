package com.guardabosque.polimorfismo.abstracto;

public class GuardabosqueParque extends GuardabosqueBase {

    public GuardabosqueParque(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " protege un parque nacional.";
    }
}