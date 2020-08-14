package com.br.bookshelf.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.mappers.BookMapper;
import com.br.bookshelf.repository.BookRepository;
import com.br.bookshelf.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController extends BaseController<BookService, BookRepository, Book, UUID, BookMapper, BookDTO> {
	
	@Autowired
	public BookController(BookService service, BookMapper mapper) {
		super(service, mapper);
	}
	
	@GetMapping("/searchByIsbn10")
	@ResponseStatus(HttpStatus.OK)
	public Book searchByIsbn10(@RequestParam Long isbn10) {
		return service.searchByIsbn10(isbn10);
	}
	
	@GetMapping("/searchByIsbn13")
	@ResponseStatus(HttpStatus.OK)
	public Book searchByIsbn13(@RequestParam Long isbn13) {
		return service.searchByIsbn13(isbn13);
	}
	
	@GetMapping("/searchByTitle")
	@ResponseStatus(HttpStatus.OK)
	public List<Book> searchByTitle(@RequestParam String title) {
		return service.searchByTitle(title);
	}
	
	@GetMapping("/searchByAuthor")
	@ResponseStatus(HttpStatus.OK)
	public List<Book> searchByAuthor(@RequestParam String author) {
		return service.searchByAuthor(author);
	}
	
	@GetMapping("/searchByAuthor/{authorId}")
	@ResponseStatus(HttpStatus.OK)
	public List<Book> searchByAuthorId(@PathVariable UUID id) {
		return service.searchByAuthorId(id);
	}
	
	@GetMapping("/searchByGenre")
	public List<Book> searchByGenre(@RequestParam String genre) {
		return service.searchByGenre(genre);
	}

	@GetMapping("/searchByGenre/{id}")
	public List<Book> searchByGenreId(@PathVariable UUID id) {
		return service.searchByGenreId(id);
	}
	
	@GetMapping("/searchByPublisher")
	public List<Book> searchByPublisher(@RequestParam String publisher) {
		return service.searchByPublisher(publisher);
	}
	
	@GetMapping("/searchByPublisher/{publisherId}")
	public List<Book> searchByPublisherId(@PathVariable UUID id) {
		return service.searchByPublisherId(id);
	}
	
}
