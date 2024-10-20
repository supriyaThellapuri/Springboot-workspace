package com.tsp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@GetMapping("/")
	public String welcomeMsg()
	{
		String msg = "welcome to spring boot";
		return msg;
	}

}
