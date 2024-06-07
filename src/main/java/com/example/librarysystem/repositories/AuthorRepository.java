package com.example.librarysystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librarysystem.entities.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

}
