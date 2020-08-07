package com.br.bookshelf.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.repository.AuthorRepository;
import com.br.bookshelf.repository.BookRepository;
import com.br.bookshelf.repository.PublisherRepository;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@SpringBootTest
public class BookRepositoryTest {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private PublisherRepository publisherRepository;

	@Test
	@Transactional
	public void book_whenFindByTitleShouldBeSuccessful() {	
		Book book = createBook();
			
		List<Book> result = bookRepository.findByTitleContainingIgnoreCase("escur");
			
		assertThat(result, hasSize(1));
		assertThat(result.get(0).getTitle(), equalTo("Depois da Escuridão"));		
	}
	
	@Test 
	@Transactional
	public void book_whenFindByIsbn13ShouldBeSuccessful() {
		Book book = createBook();
		
		Book result = bookRepository.findByIsbn13(9788501090997L);
		
		assertThat(result.getTitle(), equalTo("Depois da Escuridão"));
	}
	
	@Test 
	@Transactional
	public void book_whenFindByAuthorNameShouldBeSuccessful() {
		Book book = createBook();
		Book book2 = createBook2();
		
		List<Book> result = bookRepository.findByAuthorName("Sidney Sheldon");
		
		assertThat(result, hasSize(2));
		assertThat(result.get(0).getTitle(), equalTo("Depois da Escuridão"));
		assertThat(result.get(1).getTitle(), equalTo("Se houver amanhã"));
	}
	
	@Test
	@Transactional 
	public void book_whenFindByAuthorIdShouldBeSuccessful() {
		Book book = createBook();
		
		UUID idAuthor1 = book.getAuthor().get(0).getId();
		
		List<Book> result = bookRepository.findByAuthorId(idAuthor1);
		
		assertThat(result, hasSize(1));
		assertThat(result.get(0).getTitle(), equalTo("Depois da Escuridão"));
	}	
	
	@Test
	@Transactional
	public void book_whenFindByPublisherNameShouldBeSuccessful() {
		createBook();
		createBook2();
		
		List<Book> result = bookRepository.findByPublisherNameContainingIgnoreCase("verso");
		
		assertThat(result, hasSize(2));
		assertThat(result.get(0).getTitle(), equalTo("Depois da Escuridão"));
		assertThat(result.get(1).getTitle(), equalTo("Se houver amanhã"));
	}
	
	private Publisher createPublisher() {
		Publisher publisher = Publisher.builder()
				.id(UUID.fromString("69f8385a-d8ce-4d4f-8833-b03e6ea3b452"))
				.name("Universo Geek")
				.country("Brasil")
				.build();
		return publisherRepository.save(publisher);
	}
	
	private Author createAuthor() {
		Author author = Author.builder()
				.id(UUID.fromString("eecd4f83-7d66-47aa-8ba7-223b81038194"))
				.name("Sidney Sheldon")
				.build();
		return authorRepository.save(author);
	}
	
	private Author createAuthor2() {
		Author author = Author.builder()
			.id(UUID.fromString("798dc093-98f4-48e4-b303-bb8646ed4c7f"))
			.name("Tilly Bagshawe")
			.build();
		return authorRepository.save(author);
	}
	
	private Book createBook() {
		List<Author> authors = new ArrayList();
		
		authors.add(createAuthor());
		authors.add(createAuthor2());
		
		Book book = Book.builder()
				.isbn13(9788501090997L)
				.title("Depois da Escuridão")
				.edition(1)
				.pageNumber(250)
				.language("Português")
				.author(authors)
				.publisher(createPublisher())
				.build();
		
		return bookRepository.save(book);
	}

	private Book createBook2() {
		List<Author> authors = new ArrayList();
		
		authors.add(createAuthor());
		
		Book book = Book.builder()
				.isbn13(9788501026255L)
				.title("Se houver amanhã")
				.edition(1)
				.pageNumber(402)
				.language("Português")
				.author(authors)
				.publisher(createPublisher())
				.build();
		
		return bookRepository.save(book);
	}
}
