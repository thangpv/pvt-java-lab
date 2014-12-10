package com.fwa.lab.mygset.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fwa.lab.mygset.model.Book;

@Repository
public class BookDAOImpl implements BookDAO {

	private static final Logger logger = LoggerFactory
			.getLogger(BookDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addBook(Book p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.save(p);
		logger.info("Book saved successfully, Book Details=" + p);
	}

	@Override
	public void updateBook(Book p) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(p);
		logger.info("Book updated successfully, Book Details=" + p);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> listBooks() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Book> booksList = session.createQuery("from Book").list();
		for (Book p : booksList) {
			logger.info("Book List::" + p);
		}
		return booksList;
	}

	@Override
	public Book getBookById(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book p = (Book) session.load(Book.class, new Integer(id));
		logger.info("Book loaded successfully, Book details=" + p);
		return p;
	}

	@Override
	public void removeBook(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Book p = (Book) session.load(Book.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
		logger.info("Book deleted successfully, book details=" + p);
	}

}
