package com.codingshuffle.tutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnujApplication implements CommandLineRunner {

	DB db;

	public static void main(String[] args) {
		SpringApplication.run(AnujApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(db.getData());
	}
}