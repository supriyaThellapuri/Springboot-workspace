package com.tsp.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {
  public static void main(String[] args) throws Exception
  {
	  Author author = new Author();
	  author.setAuthorName("teo");
	  author.setAuthorEmail("thellapruo@gamil.com");
	
	  
	  
	  Book book = new Book();
	  book.setId(102);
	  book.setName("okj");
	  book.setPrice(102.90);
	  
	  ObjectMapper mapper = new ObjectMapper();
	  
	  //converting java obj to json and store into a file
	  mapper.writeValue(new File("book.json"), book);
	  System.out.println("Conversion completed");
  }

}
