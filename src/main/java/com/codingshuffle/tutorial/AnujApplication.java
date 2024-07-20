package com.codingshuffle.tutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnujApplication implements CommandLineRunner {

	ProdDB prodDB;

	public static void main(String[] args) {
		SpringApplication.run(AnujApplication.class, args);

		prodDB = new ProdDB();
		System.out.println(prodDB.getData());
	}

	@Override
	public void run(String... args) throws Exception {
	}

}