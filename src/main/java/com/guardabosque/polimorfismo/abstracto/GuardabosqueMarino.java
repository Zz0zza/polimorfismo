package com.guardabosque.polimorfismo.abstracto;

public class GuardabosqueMarino extends GuardabosqueBase {

    public GuardabosqueMarino(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " protege ecosistemas marinos.";
    }
}