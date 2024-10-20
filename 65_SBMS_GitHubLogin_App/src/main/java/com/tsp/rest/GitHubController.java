package com.tsp.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GitHubController {

	@GetMapping("/")
	public String message(Principal principal)
	{
		return "Welcome" + principal.getName() + ". You are succesfully logged in";
	}
}
