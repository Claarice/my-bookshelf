package com.br.bookshelf.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.GenreDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.mappers.GenreMapper;
import com.br.bookshelf.repository.GenreRepository;
import com.br.bookshelf.service.AuthorService;
import com.br.bookshelf.service.GenreService;

@RestController
@RequestMapping("/genre")
public class GenreController extends BaseController<GenreService, GenreRepository, Genre, UUID, GenreMapper, GenreDTO> {
	
	@Autowired
	private AuthorService authorService;
	
	@Autowired
	public GenreController(GenreService service, GenreMapper mapper) {
		super(service, mapper);
	}
	
}
