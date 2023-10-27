package com.exp.companyservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class CompanyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CovoiturageRepository companyRepository) {
		return args->{

			companyRepository.findAll().forEach(System.out::println);
		};
	}
}