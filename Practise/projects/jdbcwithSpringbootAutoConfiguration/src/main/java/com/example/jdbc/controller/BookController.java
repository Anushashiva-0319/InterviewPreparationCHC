package com.example.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.jdbc.dao.BookDAo;
import com.example.jdbc.entity.Book;

@RestController
public class BookController {

	
	
	@Autowired
	BookDAo bookDao;
	
	@PostMapping("/save")
	public String addBook(@RequestBody Book book) {
		return bookDao.save(book);
	}
}
