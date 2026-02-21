package com.guardabosque.polimorfismo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

import com.guardabosque.polimorfismo.abstracto.*;

@SpringBootApplication
public class PolimorfismoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PolimorfismoApplication.class, args);
	}

	@Override
	public void run(String... args) {

		System.out.println("----- PRUEBA PARTE 2 (CLASE ABSTRACTA) -----");

		List<GuardabosqueBase> lista = new ArrayList<>();

		lista.add(new GuardabosqueParque("Carlos"));
		lista.add(new GuardabosqueReserva("Ana"));
		lista.add(new GuardabosqueMarino("Luis"));

		for (GuardabosqueBase g : lista) {
			System.out.println(g.realizarTarea());
		}

		System.out.println("----- FIN PRUEBA -----");
	}
}