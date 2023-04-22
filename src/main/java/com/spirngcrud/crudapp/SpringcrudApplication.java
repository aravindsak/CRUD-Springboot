package com.spirngcrud.crudapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcrudApplication {

	@GetMapping("/hello")
	public String hello(){
		return "springboot rest-api" ;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringcrudApplication.class, args);
	}

}
