package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		System.out.println("Spring Boot application started successfully!");
	}
	
	public void stop() throws Exception {
		System.out.println("Spring Boot application stopped successfully!");
	}

}
