package com.tsp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.service.WelcomeService;

@RestController
public class WelcomeRestController {
	@Autowired
	private WelcomeService service;
	
	@GetMapping("/welcome")
	public String welcomeMsg()
	{
		String msg = service.getMsg();
		return msg;
	}

}
