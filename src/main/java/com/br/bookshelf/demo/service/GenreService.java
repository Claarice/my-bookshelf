package com.br.bookshelf.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.Genre;
import com.br.bookshelf.demo.repository.GenreRepository;

@Service
public class GenreService extends BaseService<GenreRepository, Genre, UUID> {
	
	@Autowired
	public GenreService(GenreRepository repository) {
		super(repository);
	}
}
