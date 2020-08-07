package com.br.bookshelf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.entity.Review;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.repository.ReviewRepository;
import com.br.bookshelf.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController extends BaseController<ReviewService, ReviewRepository, Review, ReviewId> {
	
	@Autowired
	public ReviewController(ReviewService service) {
		super(service);
	}
}
