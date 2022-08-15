package com.nagarro.bookapi.service;

import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.bookapi.models.Book;
import com.nagarro.bookapi.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public Book saveBook(Book book) {
        return repository.save(book);
    }

    public List<Book> saveBooks(List<Book> books) {
        return repository.saveAll(books);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public Book getBookById(int id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteBook(int id) {
        repository.deleteById(id);
        return "Book removed !! " + id;
    }

    public Book updateBook(Book book) {
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setName(book.getName());
        existingBook.setAuthor(book.getAuthor());
//        existingBook.setDateAdded(book.getDateAdded());
        return repository.save(existingBook);
    	
    }
   

}