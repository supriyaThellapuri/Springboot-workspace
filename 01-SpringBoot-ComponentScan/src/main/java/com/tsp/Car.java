package com.tsp;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.jsp.security.Appsecurity;

@Component
public class Car {

	public Car()
	{
		System.out.println("Car :: Constructor");
	}
	
//	@Bean
//	public Appsecurity createInstance()
//	{
//	Appsecurity as = new Appsecurity();
//	return as;
//	}
}
