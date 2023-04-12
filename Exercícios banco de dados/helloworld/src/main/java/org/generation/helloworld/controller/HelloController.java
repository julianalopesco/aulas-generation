package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// indica para o spring que o codigo abaixo vai ser um controller
@RestController

//indica o endpoint da classe controladora
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/olaMundo") //sub-rota
	public String olaMundo() {
		return "Olá Mundo";
	}
}
