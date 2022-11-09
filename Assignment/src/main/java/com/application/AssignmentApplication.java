package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class AssignmentApplication {

	public static void main(String[] args) {
		System.out.println("main method");
		SpringApplication.run(AssignmentApplication.class, args);
		System.out.println("main method 2");
	}

}
