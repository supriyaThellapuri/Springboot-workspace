package com.tsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThirdController {
	@GetMapping("/hi")
	public ModelAndView getHelloMsg()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hello Everyone");
		mav.setViewName("hi");
		return mav;
	}
	
	
    @GetMapping("/hello")
	public ModelAndView getEveryone()
	{
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "Hello java");
		mav.setViewName("hello");
		return mav;
	}
}
