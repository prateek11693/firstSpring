package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class FirstxApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(FirstxApplication.class, args);
		System.out.println("hello");
		System.out.println("hello change");
		System.out.println("hello change two"); 
		System.out.println("changes");
		
		
	}

}
