package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(CryptoRepository repo) {

		return (arg) -> {

			repo.save(new Crypto("Bitcoin", "BTC"));
			repo.save(new Crypto("Ethereum", "ETH"));
			repo.save(new Crypto("Ethereum Classic", "ETC"));
			repo.save(new Crypto("Litecoin", "LTC"));
			repo.save(new Crypto("Monero", "XMR"));

			System.out.println("_____________________");
			System.out.println("Lista de criptomoedas");
			System.out.println("_____________________");

			for (Crypto crypto: repo.findAll()) {
				System.out.println(crypto.toString());
			}

			Crypto crypto = repo.findById(2);
			System.out.println("_____________________");
			System.out.println("Criptomoeda encontrada com ID 2");
			System.out.println("_____________________");
			System.out.println(crypto.toString());


			Crypto bitcoin = repo.findByName("Bitcoin");
			System.out.println("_____________________");
			System.out.println("Criptomoeda encontrada com o nome 'Bitcoin'");
			System.out.println("_____________________");
			System.out.println(bitcoin.toString());

			Crypto ethereum = repo.findBySymbol("ETH");
			System.out.println("_____________________");
			System.out.println("Criptomoeda encontrada com o símbolo 'ETH'");
			System.out.println("_____________________");
			System.out.println(ethereum.toString());

		};

	}

}
