package com.guardabosque.polimorfismo.abstracto;

public abstract class GuardabosqueBase {

    protected String nombre;

    public GuardabosqueBase(String nombre) {
        this.nombre = nombre;
    }

    public abstract String realizarTarea();
}