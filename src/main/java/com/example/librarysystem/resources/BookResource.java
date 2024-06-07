package com.example.librarysystem.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarysystem.entities.Book;
import com.example.librarysystem.service.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {

	@Autowired
	private BookService service;

	@GetMapping
	public ResponseEntity<List<Book>> findAll() {
		List<Book> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Book> findById(@PathVariable Long id) {
		Book bookById = service.findById(id);
		return ResponseEntity.ok().body(bookById);
	}
}
