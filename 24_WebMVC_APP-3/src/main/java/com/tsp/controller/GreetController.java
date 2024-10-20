package com.tsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model)
	{
		String msgTxt = "Good morning";
		model.addAttribute("msg",msgTxt);
		
		return "greet";
	}

}
