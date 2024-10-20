package com.tsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.jsp.security.Appsecurity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tsp", "com.walmart.security"})

public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public Appsecurity createInstance()
//	{
//	Appsecurity as = new Appsecurity();
//	return as;
//	}
	
}
