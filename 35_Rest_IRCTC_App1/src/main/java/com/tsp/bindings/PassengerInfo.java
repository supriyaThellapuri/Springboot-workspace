package com.tsp.bindings;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassengerInfo {
	private String name;
	private Long phno;
	private String jdate;
	private String from;
	private String to;
	private Integer trainNum;

}
