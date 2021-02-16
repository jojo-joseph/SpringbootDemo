package com.example.newDemo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewDemoController {
	
	@RequestMapping("/")
	public String printHelloWorld() {
		return "Greetings from Spring Boot!";
	}
}

