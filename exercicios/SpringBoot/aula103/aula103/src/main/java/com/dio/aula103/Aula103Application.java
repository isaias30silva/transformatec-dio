package com.dio.aula103;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Aula103Application {

	public static void main(String[] args) {
		SpringApplication.run(Aula103Application.class, args);
	}

@GetMapping("/hello")
public String hello(@RequestParam(value="Isaias", defaultValue="Isaias") String name) {

	return String.format("Hello, %s", name);
}

@GetMapping("/salve")
public String salve(@RequestParam(value="Galera", defaultValue="Galera") String name) {

	return String.format("Hello, %s", name);
}

}
