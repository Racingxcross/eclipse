package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class Config {
	
	public Config() {
		// TODO Auto-generated constructor stub
		System.out.println("created config");
	}

}
