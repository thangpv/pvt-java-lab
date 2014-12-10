package com.fwa.lab.mygset.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fwa.lab.mygset.dao.BookDAO;
import com.fwa.lab.mygset.model.Book;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDAO bookDAO;

	@Override
	@Transactional
	public void addBook(Book p) {
		this.bookDAO.addBook(p);
	}

	@Override
	@Transactional
	public void updateBook(Book p) {
		this.bookDAO.updateBook(p);
	}

	@Override
	@Transactional
	public List<Book> listBooks() {
		return this.bookDAO.listBooks();
	}

	@Override
	@Transactional
	public Book getBookById(int id) {
		return this.bookDAO.getBookById(id);
	}

	@Override
	@Transactional
	public void removeBook(int id) {
		this.bookDAO.removeBook(id);
	}

}
