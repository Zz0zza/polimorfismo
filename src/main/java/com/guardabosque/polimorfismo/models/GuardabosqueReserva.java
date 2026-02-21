package com.guardabosque.polimorfismo.models;

public class GuardabosqueReserva implements Guardabosque {

    private final String nombre;

    public GuardabosqueReserva(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " cuida una Reserva Natural.";
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}