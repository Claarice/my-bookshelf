package com.br.bookshelf.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.entity.Review;
import com.br.bookshelf.entity.ReviewId;

@Repository
public interface ReviewRepository extends JpaRepository<Review, ReviewId> {
	
	List<Review> findByIdUserId(UUID userId);
	
	List<Review> findByIdBookId(UUID bookId);
}
