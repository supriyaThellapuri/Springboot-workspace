package com.tsp.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitHubController {
	
	@GetMapping("/")
	public String msg(Principal principal)
	{
		return "Message "+ principal.getName() + ". you are successfully logged";
	}

}
