package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class EmployeeAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAPIApplication.class, args);
	}
	
	@Bean
    public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
