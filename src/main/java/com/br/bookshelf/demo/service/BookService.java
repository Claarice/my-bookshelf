package com.br.bookshelf.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.Book;
import com.br.bookshelf.demo.repository.BookRepository;

@Service
public class BookService extends BaseService<BookRepository, Book, UUID> {
	
	@Autowired
	public BookService(BookRepository repository) {
		super(repository);
	}
}
