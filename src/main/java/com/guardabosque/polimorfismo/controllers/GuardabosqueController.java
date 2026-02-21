package com.guardabosque.polimorfismo.controllers;

import com.guardabosque.polimorfismo.repositories.Guardabosques;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class GuardabosqueController {

    @GetMapping("/guardabosques")
    public String mostrarTareas(Model model){

        List<String> tareas = Guardabosques.lista.stream()
                .map(g -> g.realizarTarea())
                .collect(Collectors.toList());

        model.addAttribute("tareas", tareas);

        return "vistaGuardabosques";
    }
}