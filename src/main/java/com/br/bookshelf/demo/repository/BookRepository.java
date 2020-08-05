package com.br.bookshelf.demo.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.demo.entity.Book;
import com.sun.istack.Nullable;

@Repository
public interface BookRepository extends JpaRepository<Book, UUID> {
	
	Book findByIsbn10(Long isbn10);
	
	Book findByIsbn13(Long isbn13);
	
	List<Book> findByTitleContainingIgnoreCase(String title);
		
	@Query(value = "SELECT * FROM book as B " +
			"JOIN book_author as BA on BA.book_id = B.id " +
			"JOIN author as A on BA.author_id = A.id " + 
			"WHERE A.name = :authorName",
			nativeQuery = true)
	List<Book> findByAuthorName(String authorName);
	
	@Query(value = "SELECT * FROM book AS B " +
			"JOIN book_author AS BA ON BA.book_id = B.id " + 
			"JOIN author AS A ON BA.author_id = A.id " +
			"WHERE A.id = :authorId",
			nativeQuery = true)
	List<Book> findByAuthorId(UUID authorId);
	
	@Query(value = "SELECT * FROM book AS B " +
			"JOIN book_genre AS BG ON BG.book_id = B.id " +
			"JOIN genre AS G ON BG.genre_id = G.id " +
			"WHERE G.name = :genre",
			nativeQuery = true)
	List<Book> findByGenre(String genre);
	
	@Query(value = "SELECT * FROM book AS B " +
			"JOIN book_genre AS BG ON BG.book_id = B.id " +
			"JOIN genre AS G ON BG.genre_id = G.id " +
			"WHERE G.id = :genreId",
			nativeQuery = true)
	List<Book> findByGenreId(UUID genreId);
	
	List<Book> findByPublisherNameContainingIgnoreCase(String publisher);
	
	List<Book> findByPublisherId(UUID id);
 }
