package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.Genre;
import com.br.bookshelf.demo.repository.GenreRepository;
import com.br.bookshelf.demo.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController extends BaseController<GenreService, GenreRepository, Genre, UUID> {
	
	@Autowired
	public GenreController(GenreService service) {
		super(service);
	}
}
