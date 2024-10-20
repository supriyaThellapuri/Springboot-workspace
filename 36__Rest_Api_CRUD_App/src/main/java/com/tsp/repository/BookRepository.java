package com.tsp.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsp.entity.Book;

public interface BookRepository extends JpaRepository<Book, Serializable> {
	

}
