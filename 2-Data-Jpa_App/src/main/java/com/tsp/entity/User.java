package com.tsp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_masters")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
	
	

	@Id
	@Column(name = "user_id")
    private Integer userId;
	
	@Column(name = "user_name")
    private String userName;
	
	@Column(name="user_gender")
    private String gender;
	
	@Column(name = "user_age")
    private Integer age;
	
	@Column(name = "user_country")
    private String country;
}
