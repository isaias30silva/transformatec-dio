package com.aula109.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.*;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		//Mapeamento de classe para a tabela
		repo.save(new Student("Marcos", true));
		repo.save(new Student("João", false));
		repo.save(new Student("Paulo", true));
		repo.save(new Student("Lucas", false));
		repo.save(new Student("João", false));

		System.out.println("\n-->Lista de alunos:\n");

		//Mapeamento de tabela para classe
		for (Student student: repo.findAll()) {
			System.out.println("\n-->Dados do aluno:\n");
			System.out.println(student.toString());
		}

		for (Student student: repo.findByStatus(true)) {
			System.out.println("\n-->Dados dos alunos com status 'true':\n");
			System.out.println(student.toString());
		}

		for (Student student: repo.findByName("João")) {
			System.out.println("\n-->Dados dos alunos com nome João:\n");
			System.out.println(student.toString());
		}

		//Mapeamento de tabela para classe
		Student student = repo.findById(2);
			System.out.println("\n-->Dados dos alunos com Id 2:\n");
			System.out.println(student.toString());

	}

}
