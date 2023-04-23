package com.spirngcrud.crudapp;

import com.spirngcrud.crudapp.item.Item;
import com.spirngcrud.crudapp.item.ItemRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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

	 @Bean
	public CommandLineRunner commandLineRunner(
			ItemRepository repository

	) {
		 return args -> {
			 var item = Item.builder()
					 .name("samsung")
					 .details("M series")
					 .build();
			 repository.insert(item);


		 };
	 }
}
