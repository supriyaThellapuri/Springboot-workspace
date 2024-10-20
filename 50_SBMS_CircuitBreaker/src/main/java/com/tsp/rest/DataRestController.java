package com.tsp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataRestController {
	
	@GetMapping("/")
	@HystrixCommand(
			fallbackMethod = "grtDataDromDB",
			commandProperties = {
					@HystrixProperty(name = "circuitBreaker.requestVloumeThreshould", value = "5"),
                     @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "10000")
			}
		)
	public String getDataFromRedis()
	{
		System.out.println("Redius() method called");
		String msg = "*****Getting data from redis cache*******";
		//logic
		int i = 10/0;
		return msg;
		
	}
	public String getDataFromDB()
	{
		System.out.println("Getting data db() method called");
		String msg = "********Getting data  from Database";
		//logic
		return msg;
	}

}
