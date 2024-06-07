package com.example.librarysystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarysystem.entities.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
