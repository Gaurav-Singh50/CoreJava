package com.nagarro.bookapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nagarro.bookapi.models.Book;
import com.nagarro.bookapi.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		return service.saveBook(book);
	}

	@GetMapping(path="/allBooks")
	public List<Book> findAllBooks() {
		return service.getBooks();
	}

	@GetMapping(path="/book/{id}", produces="application/json")
	public Book findProductById(@PathVariable int id) {
		return service.getBookById(id);
	}

	@PutMapping("/update")
	public Book updateProduct(@RequestBody Book book) {
		return service.updateBook(book);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return service.deleteBook(id);
	}
}
