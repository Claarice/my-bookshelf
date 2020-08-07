package com.br.bookshelf.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.repository.GenreRepository;

@Service
public class GenreService extends BaseService<GenreRepository, Genre, UUID> {
	
	@Autowired
	public GenreService(GenreRepository repository) {
		super(repository);
	}
}
