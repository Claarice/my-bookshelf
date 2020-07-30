package com.br.bookshelf.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.bookshelf.demo.entity.Review;
import com.br.bookshelf.demo.entity.ReviewId;

public interface ReviewRepository extends JpaRepository<Review, ReviewId> {

}
