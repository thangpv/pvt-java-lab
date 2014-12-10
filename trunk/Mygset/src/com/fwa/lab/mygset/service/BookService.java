package com.fwa.lab.mygset.service;

import java.util.List;

import com.fwa.lab.mygset.model.Book;

public interface BookService {

	public void addBook(Book p);

	public void updateBook(Book p);

	public List<Book> listBooks();

	public Book getBookById(int id);

	public void removeBook(int id);

}
