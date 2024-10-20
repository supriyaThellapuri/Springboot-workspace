package com.tsp.bindings;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TicketInfo {
	private Integer ticketId;
	private String pnr;
	private String ticketStatus;

}
