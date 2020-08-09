package com.br.bookshelf.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.repository.GenreRepository;
import com.br.bookshelf.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController extends BaseController<GenreService, GenreRepository, Genre, UUID> {
	
	@Autowired
	public GenreController(GenreService service) {
		super(service);
	}
}