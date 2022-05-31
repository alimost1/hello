package com.springdocker1.springdocker1.hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/rest/docker/hello")

public class Hello {
	
	@GetMapping String hello () {
		
		return "hello word ";
	}
}