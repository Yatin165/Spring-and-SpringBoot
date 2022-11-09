package com.project2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;

public class TestController  {

	@RequestMapping("/home")
	public String getString() {
		return "yatin";
	}
	
/*	@Autowired
	ApplicationContext context;
	
	
	@RequestMapping("/test")
	public String getString() {
		Environment env = context.getEnvironment();
		return env.getProperty("name");
	}*/
	
}