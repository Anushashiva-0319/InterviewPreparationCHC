package com.example.jdbc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.jdbc.entity.Book;

@Repository
public class BookDAo {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/*
	 * public String save(Book book) {
	 * 
	 * private static final String ="Insert into " jdbcTemplate. }
	 */
}
