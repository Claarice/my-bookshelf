package com.br.bookshelf.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.Review;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.repository.ReviewRepository;

@Service
public class ReviewService extends BaseService<ReviewRepository, Review, ReviewId> {
		
	@Autowired	
	public ReviewService(ReviewRepository repository) {
		super(repository);
	}
	
	public List<Review> findByUser(UUID userId) {
		return repository.findByIdUserId(userId);
	}
	
	public List<Review> findByBook(UUID bookId) {
		return repository.findByIdBookId(bookId);
	}
	
}
