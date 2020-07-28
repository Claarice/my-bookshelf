package com.br.bookshelf.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.bookshelf.demo.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, UUID>{

}
