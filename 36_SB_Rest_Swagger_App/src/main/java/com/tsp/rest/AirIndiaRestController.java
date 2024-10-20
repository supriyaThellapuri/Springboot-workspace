package com.tsp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.request.PassengerInfo;
import com.tsp.response.TicketInfo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class AirIndiaRestController {
	
	@PostMapping("/bookFlightTicket")
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		TicketInfo ticketInfo = new TicketInfo();
		ticketInfo.setName(request.getFname()+" "+request.getLname());
		ticketInfo.setFrom(request.getFrom());
		ticketInfo.setTo(request.getTo());
		ticketInfo.setTicketStatus("Confirmed");
		ticketInfo.setTicketPrice("4500 INR");
		ticketInfo.setJourneyDate(request.getJourneyDate());
		return new ResponseEntity<>(ticketInfo,HttpStatus.CREATED);
	}

}
