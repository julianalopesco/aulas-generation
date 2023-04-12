package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

// indica para o spring que o codigo abaixo vai ser um controller
@RestController

//indica o endpoint da classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/listaBsm") //sub-rota
	public String olaMundo() {
		return  "BSMs Valorizadas pela Generation Brasil\n"
				+ "Mentalidade de crescimento\n"
				+ "Persistência\n"
				+ "Responsabilidade Pessoal\n"
				+ "Comunicação\n"
				+ "Orientação ao detalhe\n"
				+ "Proatividade\n"
				+ "Trabalho em equipe\n";			
	}
	
	@GetMapping("/meta")
	public String olamundo() {
		return "Minha meta da semana:\n"
				+"Essa semana, minha meta é me desenvolver melhor em Trabalho em Equipe\n";
	}
}
