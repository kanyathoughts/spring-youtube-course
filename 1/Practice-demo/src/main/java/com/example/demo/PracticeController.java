package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {
	
	@GetMapping("/")
	public String sayHello() {
		return "hello";
	}

}
