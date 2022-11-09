package com.application;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.aspect.LoggingAspect;

@RestController
public class MyController {

	public static final Log LOGGER = LogFactory.getLog(MyController.class);

	@RequestMapping("/login")
	public String getUser() {
		return "login";
	}

	@GetMapping("/login")
	public String display( String name) {
		if (name.equals("John")) {
			System.out.println("You  are not allowed to login");
			LOGGER.info("You are not allowed to login");
			return "You are not allowed to login";
		} else {
			System.out.println("Welcome " + name);
			LOGGER.info("Welcome " + name);
			return "Welcome " + name;
		}
	}

}
