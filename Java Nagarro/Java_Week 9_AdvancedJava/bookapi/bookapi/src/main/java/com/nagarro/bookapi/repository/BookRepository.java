package com.nagarro.bookapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.bookapi.models.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
