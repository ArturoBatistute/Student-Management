package com.master.studentManagement.student;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	CommandLineRunner commandLineRunner( StudentRepository repository) {
		
		return args -> {
				final Student marrie = new Student(1L,
						"Marrie",
						"marrie@gmail.com",
						LocalDate.of(2000, 1, 5),
						21
				);
				
				repository.save(marrie);
		};
	}
}
