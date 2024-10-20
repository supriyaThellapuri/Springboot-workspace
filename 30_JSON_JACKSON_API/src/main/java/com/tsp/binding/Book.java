package com.tsp.binding;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIncludeProperties
public class Book {
	@JsonProperty(value = "bookId")
	private Integer id;
	private String name;
	private Double price;
	private Author author;
}
