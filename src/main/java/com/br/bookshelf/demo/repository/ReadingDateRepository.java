package com.br.bookshelf.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.bookshelf.demo.entity.ReadingDate;

public interface ReadingDateRepository extends JpaRepository<ReadingDate, UUID>{

}
