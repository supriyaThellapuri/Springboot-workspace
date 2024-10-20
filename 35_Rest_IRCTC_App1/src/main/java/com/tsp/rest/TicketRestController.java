package com.tsp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.bindings.PassengerInfo;
import com.tsp.bindings.TicketInfo;

@RestController
public class TicketRestController {
	

	@PostMapping(value = "/ticket")//, produces = {"application/json"}, consumes = {"application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
		TicketInfo ticketInfo = new TicketInfo();
		ticketInfo.setTicketId(4321);
		ticketInfo.setPnr("GFR21");
		ticketInfo.setTicketStatus("Confirmed");
		return new ResponseEntity<>(ticketInfo, HttpStatus.CREATED);
	}
	
	@GetMapping("/ticket/{ticketId}")
	public ResponseEntity<String> getTicket(@PathVariable("ticketId") Integer ticketId)
	{
		return new ResponseEntity<>("Receive the Ticket Details", HttpStatus.OK);
	}
	
	@PutMapping("/ticket")
	public ResponseEntity<String> updateTicket(@RequestBody PassengerInfo request)
	{
		System.out.println(request);
	     
		
		return new ResponseEntity<>("Ticket Updated", HttpStatus.OK);
	}
	
	@DeleteMapping("/ticket/{ticketId}")
	public ResponseEntity<String> deleteTicket(@PathVariable("ticketId") Integer ticketId)
	{
		return new ResponseEntity<>("Ticket Deleted", HttpStatus.OK);
	}

}
