package com.example.librarysystem.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.example.librarysystem.entities.category.CategoryEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private CategoryEnum category;
	private String authorName;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	public Book() {
	}

	public Book(Long id, String title, CategoryEnum category, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.authorName = author.getName();
		setAuthor(author);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CategoryEnum getCategory() {
		return category;
	}

	public void setCategory(CategoryEnum category) {
		this.category = category;
	}

	public String getAuthorName() {
		return authorName;
	}
	

	public void setAuthorName(Author author) {
		this.authorName = author.getName();
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
		if (author != null) {
			author.getBooks().add(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
