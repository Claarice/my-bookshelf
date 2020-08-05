package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.Book;
import com.br.bookshelf.demo.repository.BookRepository;
import com.br.bookshelf.demo.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController extends BaseController<BookService, BookRepository, Book, UUID> {
	
	@Autowired
	public BookController(BookService service) {
		super(service);
	}

}
