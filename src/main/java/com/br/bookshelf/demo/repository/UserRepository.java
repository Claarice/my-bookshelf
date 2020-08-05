package com.br.bookshelf.demo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.bookshelf.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

}