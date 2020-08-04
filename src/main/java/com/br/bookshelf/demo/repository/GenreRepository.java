package com.br.bookshelf.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.demo.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {

}
