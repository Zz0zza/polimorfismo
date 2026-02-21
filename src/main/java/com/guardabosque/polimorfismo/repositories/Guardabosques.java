package com.guardabosque.polimorfismo.repositories;

import com.guardabosque.polimorfismo.models.*;

import java.util.Arrays;
import java.util.List;

public class Guardabosques {

    public static final List<Guardabosque> lista = Arrays.asList(
            new GuardabosqueParque("Carlos"),
            new GuardabosqueReserva("Ana"),
            new GuardabosqueMarino("Luis")
    );
}