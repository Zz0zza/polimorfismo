package com.guardabosque.polimorfismo.models;

public class GuardabosqueParque implements Guardabosque {

    private final String nombre;

    public GuardabosqueParque(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " protege un Parque Nacional.";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}