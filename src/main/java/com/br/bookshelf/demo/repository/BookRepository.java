package com.br.bookshelf.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.bookshelf.demo.entity.Book;

public interface BookRepository extends JpaRepository<Book, UUID> {
	
	Book findByIsbn10(String isbn10);
	
	Book findByIsbn13(String isbn13);
	
	List<Book> findByTitleContaining(String title);
 }
