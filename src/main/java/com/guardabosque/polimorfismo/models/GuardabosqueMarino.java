package com.guardabosque.polimorfismo.models;

public class GuardabosqueMarino implements Guardabosque {

    private final String nombre;

    public GuardabosqueMarino(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " protege ecosistemas marinos.";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}   