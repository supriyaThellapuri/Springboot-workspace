package com.tsp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.jsp.security.Appsecurity;

@Component
public class Motor {
	public Motor()
	{
		System.out.println("Motor :: Constructor");
		
	}
	
//	@Bean
//	public Appsecurity createInstance()
//	{
//	Appsecurity as = new Appsecurity();
//	return as;
//	}

}
