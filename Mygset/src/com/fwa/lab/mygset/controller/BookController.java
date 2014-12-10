package com.fwa.lab.mygset.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fwa.lab.mygset.model.Book;
import com.fwa.lab.mygset.service.BookService;

@Controller
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public String listBooks(Model model) {
		model.addAttribute("book", new Book());
		model.addAttribute("listBooks", this.bookService.listBooks());
		return "book";
	}

	// For add and update book both
	@RequestMapping(value = "/book/add", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") Book p) {

		if (p.getId() == null) {
			// new book, add it
			this.bookService.addBook(p);
		} else {
			// existing book, call update
			this.bookService.updateBook(p);
		}

		return "redirect:/books";

	}

	@RequestMapping("/removebook/{id}")
	public String removeBook(@PathVariable("id") int id) {

		this.bookService.removeBook(id);
		return "redirect:/books";
	}

	@RequestMapping("/editbook/{id}")
	public String editBook(@PathVariable("id") int id, Model model) {
		model.addAttribute("book", this.bookService.getBookById(id));
		model.addAttribute("listBooks", this.bookService.listBooks());
		return "book";
	}

}
