package com.tsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tsp.binding.Book;

@Controller
public class BookController {
	
	@GetMapping("/")
	public String displayForm(Model model)
	{
		Book book = new Book();
		model.addAttribute("book", book);
		return "index";
		
	}
	
	@PostMapping("/book")
	public String saveBook(Book book, Model model)
	{
		System.out.println(book);
		model.addAttribute("msg","Book detailsa re saved successfully");
		return "success";
	}

}
