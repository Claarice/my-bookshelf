package com.br.bookshelf.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.demo.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {
	
	List<Author> findByNameContainingIgnoreCase(String name);
	
	@Query(value = "SELECT * FROM Author AS A " + 
			"JOIN author_genre AS AG ON AG.author_id = A.id " +
			"JOIN genre AS G on AG.genre_id = G.id " + 
			"WHERE G.name = :genre",
			nativeQuery = true)	
	List<Author> findByGenre(String genre);

	@Query(value = "SELECT * FROM Author AS A " + 
			"JOIN author_genre AS AG ON AG.author_id = A.id " +
			"JOIN genre AS G on AG.genre_id = G.id " + 
			"WHERE G.id = :genreId",
			nativeQuery = true)	
	List<Author> findByGenreId(UUID genreId);
}
