package com.example.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	private int isbn;
	private String title;
	private String author;
	private String genere;
	private String publishedYear;

}
