package com.candidat.microservice.atelier_web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtelierWeb8Application {

	public static void main(String[] args) {
		SpringApplication.run(AtelierWeb8Application.class, args);
	}

	@Autowired
	private CandidatRepository candidatRepository;

	@Bean
	ApplicationRunner init() {
		return (args) -> {
			candidatRepository.save(new Candidat("Omar", "Gh", "@esprit.tn"));
			candidatRepository.save(new Candidat("Samir", "3antar", "@gmail.tn"));
			candidatRepository.save(new Candidat("mohsen", "ghassen", "@yahoo.tn"));
			candidatRepository.findAll().forEach(System.out::println);
		};
	}

}
