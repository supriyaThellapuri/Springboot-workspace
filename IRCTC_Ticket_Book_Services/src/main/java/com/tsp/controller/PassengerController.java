package com.tsp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.binding.PassengerDetails;
import com.tsp.binding.TicketDetails;

@RestController
public class PassengerController {
	
	@PostMapping(
		value = "/ticket",
		produces = {"application/json"},
		consumes = {"application/json"})
	public ResponseEntity<TicketDetails> addBookDetails(@RequestBody PassengerDetails passengerDetails) {
		System.out.println(passengerDetails);
		TicketDetails t1 = new TicketDetails();
		t1.setTrainNum(12345);
		t1.setTicketType("sleeper");
		t1.setTicketNum(21);
		return new ResponseEntity<>(t1, HttpStatus.OK);
	}
}
