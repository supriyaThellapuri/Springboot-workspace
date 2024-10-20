package com.tsp.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsp.binding.Product;

@RestController
public class ProductController {
	
	@GetMapping( 
			value = "/product",
			produces = { "application/json"}
			)
	public ResponseEntity<Product> getProduct()
	{
		Product productObj = new Product();
		productObj.setPid(101);
		productObj.setPname("mouse");
		productObj.setPrice(120.90);
		
		return new ResponseEntity<>(productObj, HttpStatus.OK);
	}
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts()
	{
		Product p1 = new Product(101, "Mouse", 350.0);
		Product p2 = new Product(102, "ram", 240.1);
		Product p3 = new Product(103, "CPU",1390.09);
		
		List<Product> products = Arrays.asList(p1,p2,p3);
		return new ResponseEntity<>(products, HttpStatus.OK);
				
	}

}
