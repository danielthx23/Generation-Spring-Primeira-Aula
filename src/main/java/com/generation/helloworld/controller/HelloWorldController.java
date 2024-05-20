package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {

	@GetMapping
	public String ola() {
		return "Olá mundo! Bom dia!";
	}
	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "sushi \nHamburguer";
	}
	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	@GetMapping("bsm")
	public String listaBsms() {
		return "BSM's da Generation: \nComunicação \nProatividade \nPersistência \nMentalidade de Crescimento \nResponsabilidade Pessoal \nOrientação ao Futuro \nTrabalho em Equipe \nOrientação ao Detalhe";
	}
	@GetMapping("objetivos")
	public String listaObjetivos() {
		return "Objetivos da semana: \n- Melhorar minha comunicação \n- Terminar meu Challenge da FIAP \n- Terminar de estudar uma nova linguagem";
	}
}
