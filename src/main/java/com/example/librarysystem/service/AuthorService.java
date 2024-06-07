package com.example.librarysystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarysystem.entities.Author;
import com.example.librarysystem.repositories.AuthorRepository;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository repository;
	
	public List<Author> findAll() {
		List<Author> list = repository.findAll();
		return list;
	}
	
	public Author findById(Long id) {
		Optional<Author> authorId = repository.findById(id);
		return authorId.get();
	}
	
	 
}
