package com.tsp.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	public String getMsg()
	{
		String msg = "Good Morning";
		return msg;
	}

}
