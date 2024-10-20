package com.tsp.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name= "PRODUCT_LIST")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
	
	@Id
	@Column(name = "PRODUCT_ID")
	private int pid;
	
	@Column(name = "PRODUCT_NAME")
	private String pname;
	
	@Column(name = "PRODUCT_PRICE")
	private double price;

	@CreationTimestamp
	@Column(name = "CREATED_DATE", updatable = false)
	private LocalDate createdDate;
	
	@UpdateTimestamp
	@Column(name = "UPDATED_DATE", insertable = false)
	private LocalDate updatedDate;
	

}
