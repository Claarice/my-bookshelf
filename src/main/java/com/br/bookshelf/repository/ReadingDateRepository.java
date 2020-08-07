package com.br.bookshelf.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.entity.ReadingDate;

@Repository
public interface ReadingDateRepository extends JpaRepository<ReadingDate, UUID>{

}
