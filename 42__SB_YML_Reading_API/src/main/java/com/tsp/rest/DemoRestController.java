package com.tsp.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.props.AppProperties;

@RestController
public class DemoRestController {
	
	@Autowired
	private AppProperties props;
	
	@GetMapping("/")
	public String welcomeMsg()
	{
		Map<String,String> messages = props.getMessages();
		System.out.println("Hi Good Morning");
		String value = messages.get("welcomeMsg");
		return value;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		return props.getMessages().get("greetMsg");
		
	}
	
	@GetMapping("/wish")
	public String getWishMsg()
	{
		return props.getMessages().get("wishMsg");
	}
   
}
