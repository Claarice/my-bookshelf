package com.br.bookshelf.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.entity.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, UUID> {

}
