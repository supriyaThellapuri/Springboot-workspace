package com.jsp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appsecurity {

	public Appsecurity()
	{
		System.out.println("AppSecurity :: 0 param constuctor");
	}
	
	@Bean
	public Appsecurity createInstance()
	{
		Appsecurity as = new Appsecurity();
		return as;
		
	}
}
