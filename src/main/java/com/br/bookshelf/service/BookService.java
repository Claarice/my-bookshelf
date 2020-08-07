package com.br.bookshelf.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.Book;
import com.br.bookshelf.repository.BookRepository;

@Service
public class BookService extends BaseService<BookRepository, Book, UUID> {
	
	@Autowired
	public BookService(BookRepository repository) {
		super(repository);
	}
	
	public Book searchByIsbn10(Long isbn10) {
		return repository.findByIsbn10(isbn10);
	}
	
	public Book searchByIsbn13(Long isbn13) {
		return repository.findByIsbn13(isbn13);
	}
	
	public List<Book> searchByTitle(String title) {
		return repository.findByTitleContainingIgnoreCase(title);
	}
	
	public List<Book> searchByAuthor(String author) {
		return repository.findByAuthorName(author);
	}
	
	public List<Book> searchByAuthorId(UUID authorId) {
		return repository.findByAuthorId(authorId);
	}
	
	public List<Book> searchByGenre(String genre) {
		return repository.findByGenre(genre);
	}
	
	public List<Book> searchByGenreId(UUID genreId) {
		return repository.findByGenreId(genreId);
	}
	
	public List<Book> searchByPublisher(String publisher) {
		return repository.findByPublisherNameContainingIgnoreCase(publisher);
	}
	
	public List<Book> searchByPublisherId(UUID id) {
		return repository.findByPublisherId(id);
	}
}
