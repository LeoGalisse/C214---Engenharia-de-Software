package com.project.inas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class InasApplication {
	private static Logger logger = LoggerFactory.getLogger(InasApplication.class);

	public static void main(String[] args) {
		logger.info("Iniciando a API JAVA");
		SpringApplication.run(InasApplication.class, args);
		System.out.println("Hello, World!");
		logger.info("API iniciada");
	}
}
