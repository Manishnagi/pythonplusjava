package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@PostMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	@PostMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
