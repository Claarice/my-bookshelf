package com.br.bookshelf.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, UUID> {

}
