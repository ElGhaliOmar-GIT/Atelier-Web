package com.candidate.microservice.atelierweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AtelierWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtelierWebApplication.class, args);
	}

	@Autowired
	private CandidatRepository candidatRepo;

	@Bean
	ApplicationRunner init() {
		return(args) -> {
			// save
			candidatRepo.save(new Candidat("hsan", "hsin", "hsan@gmail"));
			candidatRepo.save(new Candidat("amir", "maamer", "amir@gmail"));
			candidatRepo.save(new Candidat("samir", "samara", "samir@gmail"));
			// fetch
			candidatRepo.findAll().forEach(System.out::println);
		};
	}
}

