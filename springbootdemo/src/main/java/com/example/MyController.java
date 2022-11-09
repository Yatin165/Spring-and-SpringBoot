package com.example;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class MyController implements CommandLineRunner {

/*	@RequestMapping("/test")
	public String getString() {
		return "test";
	}*/
	public static final Log LOGGER = LogFactory.getLog(SpringbootdemoApplication.class);
	
		@Autowired
	ApplicationContext context;
	
	
	@RequestMapping("/test")
	public String getString() {
		Environment env = context.getEnvironment();
		LOGGER.info("Mapping");
		return env.getProperty("name");
	}
	

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Runner is working");
	}
}
