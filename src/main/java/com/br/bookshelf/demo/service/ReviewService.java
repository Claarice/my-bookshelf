package com.br.bookshelf.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.Review;
import com.br.bookshelf.demo.entity.ReviewId;
import com.br.bookshelf.demo.repository.ReviewRepository;

@Service
public class ReviewService extends BaseService<ReviewRepository, Review, ReviewId> {
		
	@Autowired	
	public ReviewService(ReviewRepository repository) {
		super(repository);
	}
}
