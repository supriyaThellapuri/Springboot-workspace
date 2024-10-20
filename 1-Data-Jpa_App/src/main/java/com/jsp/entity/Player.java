package com.jsp.entity;

import javax.persistence.Entity;

@Entity
@Table(name = "CRICKET_PLAYER")

public class Player {
	private Integer playerId;
	private String playerNAme;
	private Integer playerAge;
	private String playerLocation;

}