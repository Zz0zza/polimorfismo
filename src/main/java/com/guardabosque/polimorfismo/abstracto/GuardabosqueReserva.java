package com.guardabosque.polimorfismo.abstracto;

public class GuardabosqueReserva extends GuardabosqueBase {

    public GuardabosqueReserva(String nombre) {
        super(nombre);
    }

    @Override
    public String realizarTarea() {
        return "El guardabosque " + nombre + " cuida una reserva natural.";
    }
}