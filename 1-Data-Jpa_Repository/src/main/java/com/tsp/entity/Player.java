package com.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cricket_players")
public class Player {
	@Id
	@Column(name="player_id")
	private Integer palyerId;
	
	@Column(name="player_name")
	private String playerName;
	
	@Column(name="player_age")
	private Integer playerAge;
	
	private String playerLocation;

	public Integer getPalyerId() {
		return palyerId;
	}

	public void setPalyerId(Integer palyerId) {
		this.palyerId = palyerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getPlayerAge() {
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge) {
		this.playerAge = playerAge;
	}

	public String getPlayerLocation() {
		return playerLocation;
	}

	public void setPlayerLocation(String playerLocation) {
		this.playerLocation = playerLocation;
	}

	@Override
	public String toString() {
		return "Player [palyerId=" + palyerId + ", playerName=" + playerName + ", playerAge=" + playerAge
				+ ", playerLocation=" + playerLocation + "]";
	}

	
}
