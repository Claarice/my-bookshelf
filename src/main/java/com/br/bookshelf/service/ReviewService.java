package com.br.bookshelf.service;

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
}
