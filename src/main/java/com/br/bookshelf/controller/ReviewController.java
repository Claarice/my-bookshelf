package com.br.bookshelf.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.ReviewDTO;
import com.br.bookshelf.entity.Review;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.mappers.ReviewMapper;
import com.br.bookshelf.repository.ReviewRepository;
import com.br.bookshelf.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController extends BaseController<ReviewService, ReviewRepository, Review, ReviewId, ReviewMapper, ReviewDTO> {
	
	@Autowired
	public ReviewController(ReviewService service, ReviewMapper mapper) {
		super(service, mapper);
	}
	
	@GetMapping("/user/{userId}")
	public List<ReviewDTO> findByUser(@PathVariable UUID userId) {
		return mapper.toDTO(service.findByUser(userId));
	}
	
	@GetMapping("/book/{bookId}")
	public List<ReviewDTO> findByBook(@PathVariable UUID bookId) {
		return mapper.toDTO(service.findByBook(bookId));
	}
}
