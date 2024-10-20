package com.tsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tsp.binding.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String getProductForm(Model model)
	{
		Product p = new Product();
		model.addAttribute("product", p);
		return "index";
		
	}
	@PostMapping("/product")
	public String handleFormSubmit(Product product, Model model)
	{
		System.out.println(product);
		model.addAttribute("msg", "prodcut saved successfully");
		return "success";
	}

}
