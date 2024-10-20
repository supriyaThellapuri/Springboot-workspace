package com.tsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tsp.bindings.Book;

@Controller
public class BookController {
	
	@GetMapping("/books")
	public String getBookDetails(Model model)
	{
		List<Book> books = new ArrayList<>();
		books.add(new Book(1, "The Great Gatsby",  10.99));
	    books.add(new Book(2, "To Kill a Mockingbird",  12.99));
	    books.add(new Book(3, "Title of George Orwell's Book", 8.99));

	    
		
		model.addAttribute("books", books);
		
		return "books";
	}

}
