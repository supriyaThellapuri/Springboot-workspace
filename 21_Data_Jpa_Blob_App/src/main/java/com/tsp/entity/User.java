package com.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "USER_TBL")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	private Long userId;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "USER_EMAIL")
	private String userEmail;
	@Column(name = "USER_IMAGE",  length = 1000000)
	@Lob
	private byte[] userImage;
	
	

}
