package com.tsp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	@GetMapping("/home")
	public String home()
	{
		String msg = "Welcome to SBI Bank";
		return msg;
	}
    
	@GetMapping("/balance")
	public String getBalance()
	{
		String msg = "Your current balance is:5000 INR";
		return msg;
	}
	
	@GetMapping("/statement")
	public String getStatement()
	{
		String msg = "Your statement generated and sent to your email id";
		return msg;
	}
	
	@GetMapping("/myloan")
	public String getMyLoan()
	{
		String msg = "Your loan amount due to : 500000INR";
		return msg;
	}
	
	@GetMapping("/contact")
	public String contact()
	{
	String msg = "Please contact to this number if you have quiries: 1234567890";
	return msg;
	}
}
