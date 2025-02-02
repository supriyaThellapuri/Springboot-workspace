package com.tsp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tsp.entity.Book;
import com.tsp.repository.BookRepository;
import com.tsp.service.BookService;


@Service
public class BookServiceImpl implements BookService{
	
	
	private BookRepository repository;
	

	public BookServiceImpl(BookRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public String upsertBook(Book book) {
		// TODO Auto-generated method stub
		 repository.save(book);
		 if(book.getBookId() == null)
		 {
			 return "Record Inserted";
		 }
		 else
		 {
			 return "Record Updated";
		 }
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
	repository.deleteById(bookId);
	return "Book deleted";
	
	}
	
}
