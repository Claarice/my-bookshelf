package com.br.bookshelf.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.br.bookshelf.demo.entity.Author;
import com.br.bookshelf.demo.entity.Genre;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;

@SpringBootTest
public class AuthorRepositoryTest {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Test
	@Transactional
	public void author_whenFindByNameShouldBeSuccessful() {
		Author author = createAuthor();
		
		List<Author> result = authorRepository.findByNameContainingIgnoreCase("sidney");
		
		assertThat(result, hasSize(1));
		assertThat(result.get(0).getName(), equalTo("Sidney Sheldon"));
	}
	
	@Test
	@Transactional
	public void author_whenFindByGenreShouldBeSuccessful() {
		Author author = createAuthor();
		
		List<Author> result = authorRepository.findByGenre("Suspense");
		
		assertThat(result, hasSize(1));
		assertThat(result.get(0).getName(), equalTo("Sidney Sheldon"));
	}
	
	private Genre createGenre() {
		Genre genre = Genre.builder()
				.name("Suspense")
				.id(UUID.randomUUID())
				.build();
		
		return genreRepository.save(genre);
	}
	
	private Author createAuthor() {
		List<Genre> genres = new ArrayList();
		
		genres.add(createGenre());
		
		Author author = Author.builder()
				.name("Sidney Sheldon")
				.id(UUID.randomUUID())
				.genre(genres)
				.build();
		
		return authorRepository.save(author);
	}
}
