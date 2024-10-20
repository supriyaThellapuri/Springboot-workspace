package com.tsp.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "WELCOME-API")
//@FeignClient(url = "http://localhost:8081/welcome")
public interface WelcomeApiClient 
{
	@GetMapping("welcome")
	public String invokeWelcomeApi();

}
