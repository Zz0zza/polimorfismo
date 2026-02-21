package com.guardabosque.polimorfismo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import com.guardabosque.polimorfismo.abstracto.*;

@Controller
public class GuardabosqueAbstractoController {

    @GetMapping("/guardabosques-abstracto")
    public String mostrarGuardabosquesAbstracto(Model model) {

        List<String> mensajes = new ArrayList<>();

        List<GuardabosqueBase> lista = new ArrayList<>();

        lista.add(new GuardabosqueParque("Carlos"));
        lista.add(new GuardabosqueReserva("Ana"));
        lista.add(new GuardabosqueMarino("Luis"));

        for (GuardabosqueBase g : lista) {
            mensajes.add(g.realizarTarea());
        }

        model.addAttribute("mensajes", mensajes);

        return "guardabosquesAbstracto";
    }
}