package com.tsp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.client.WelcomeApiClient;

@RestController
public class GreetRestController {
	
	@Autowired
	private WelcomeApiClient welcomeClient;
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String greetMsg = "Good Morning!";
		String welcomeMsg = welcomeClient.invokeWelcomeApi();
		return greetMsg + welcomeMsg;
	}
	
	

}
