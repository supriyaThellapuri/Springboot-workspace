package com.tsp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String getMessage()
	{
		
		return msg;
	}
	@GetMapping("/greet")
	public String greetMsg()
	{
		return msg;
	}
	@Value("${getMessage.msg}")
	private String msg;

}
