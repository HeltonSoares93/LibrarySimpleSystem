package com.example.librarysystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarysystem.entities.Author;
import com.example.librarysystem.entities.Book;
import com.example.librarysystem.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public List<Book> findAll() {
		List<Book> list = repository.findAll();
		return list;
	}

	public Book findById(Long id) {
		Optional<Book> bookId = repository.findById(id);
		return bookId.get();
	}

}
