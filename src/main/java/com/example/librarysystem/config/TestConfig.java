package com.example.librarysystem.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.librarysystem.entities.Author;
import com.example.librarysystem.entities.Book;
import com.example.librarysystem.entities.category.CategoryEnum;
import com.example.librarysystem.repositories.AuthorRepository;
import com.example.librarysystem.repositories.BookRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private AuthorRepository authorRepository;

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Author a1 = new Author(null, "Jordan Petson");
		Author a2 = new Author(null, "Chris Kile");
		Author a3 = new Author(null, "Joko Willink");
		
		authorRepository.saveAll(Arrays.asList(a1, a2, a3));
		
		Book b1 = new Book(null, "12 Regras para a vida", CategoryEnum.SELF_HELP, a1);
		Book b2 = new Book(null, "American Sniper", CategoryEnum.MILITARY, a2);
		Book b3 = new Book(null, "Extreme Ownership", CategoryEnum.MILITARY, a3);

		bookRepository.saveAll(Arrays.asList(b1, b2, b3));

	}

}
