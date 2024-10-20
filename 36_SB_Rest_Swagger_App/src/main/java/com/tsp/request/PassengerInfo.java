package com.tsp.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassengerInfo {
	private String fname;
	private String lname;
	private String from;
	private String to;
	private String flightId;
	private String journeyDate;

}
