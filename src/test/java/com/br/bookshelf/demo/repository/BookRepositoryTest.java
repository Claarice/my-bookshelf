package com.br.bookshelf.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.br.bookshelf.demo.entity.Book;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@SpringBootTest
public class BookRepositoryTest {
	
	Book book = createBook();
	
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	@Transactional
	public void book_whenFindByTitleShouldBeSuccessful() {
		List<Book> result = bookRepository.findByTitleContaining("Depois");
		
		assertThat(result.get(0).getTitle(), equalTo("Depois da Escuridão"));		
	}
	
	private Book createBook() {
		Book book = Book.builder()
				.isbn13(9788501090997L)
				.title("Depois da Escuridão")
				.build();
		
		return book;
	}
}
