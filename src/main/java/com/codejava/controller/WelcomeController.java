package com.codejava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@GetMapping("/hello")
	public String getMsg() {
		return "Welcome to Docker Tutrial";
	}

}
