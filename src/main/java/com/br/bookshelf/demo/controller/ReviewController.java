package com.br.bookshelf.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.Review;
import com.br.bookshelf.demo.entity.ReviewId;
import com.br.bookshelf.demo.repository.ReviewRepository;
import com.br.bookshelf.demo.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController extends BaseController<ReviewService, ReviewRepository, Review, ReviewId> {
	
	@Autowired
	public ReviewController(ReviewService service) {
		super(service);
	}
}
