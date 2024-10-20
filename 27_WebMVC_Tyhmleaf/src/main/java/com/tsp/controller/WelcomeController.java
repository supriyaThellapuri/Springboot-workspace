package com.tsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/")
	public String welcomeMsg(Model model)
	{
    	model.addAttribute("msg","Welcome to Spring boot");
		return "index";
	}
}
