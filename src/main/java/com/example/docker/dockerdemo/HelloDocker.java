package com.example.docker.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker/demo")
public class HelloDocker {
	
	@GetMapping
	public String demo() {
		return "Hello Docker!";
	}
}
