package com.br.bookshelf.demo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.Author;
import com.br.bookshelf.demo.repository.AuthorRepository;

@Service
public class AuthorService extends BaseService<AuthorRepository, Author, UUID> {
	
	@Autowired
	public AuthorService(AuthorRepository repository) {
		super(repository);
	}
	
	public List<Author> searchByName(String name) {
		return repository.findByNameContainingIgnoreCase(name);
	}
	
	public List<Author> searchByGenre(String genre) {
		return repository.findByGenre(genre);
	}
}
