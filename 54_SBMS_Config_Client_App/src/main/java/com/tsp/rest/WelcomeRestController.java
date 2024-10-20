package com.tsp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class WelcomeRestController {
	
	@Value("${msg: config server is not working}")
	private String msg;
	
	@GetMapping("/")
	public String welcomeMsg()
	{
		return msg;
	}
	
	

}
