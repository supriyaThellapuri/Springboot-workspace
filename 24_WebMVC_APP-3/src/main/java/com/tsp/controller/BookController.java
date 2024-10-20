package com.tsp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tsp.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/book")
	public String getBookData(Model model)
	{
		//setting dat to binding obj
		Book b = new Book(101,"spring", 550.0);
		
		//adding data to model obj to send to UI
		model.addAttribute("book", b);
		
		//return view name
		return "book";
	}
	
	@GetMapping("/books")
	public String getBooksData(Model model)
	{
		Book b1 = new Book(101,"aws",230.0);
		Book b2 = new Book(102,"java",320.90);
		Book b3 = new Book(103, "sql",450.00);
		List<Book> bookList = Arrays.asList(b1,b2,b3);
		model.addAttribute("books", bookList);
		return "books";
	}

}
