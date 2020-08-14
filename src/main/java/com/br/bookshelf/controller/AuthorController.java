package com.br.bookshelf.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.mappers.AuthorMapper;
import com.br.bookshelf.repository.AuthorRepository;
import com.br.bookshelf.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController extends BaseController<AuthorService, AuthorRepository, Author, UUID, AuthorMapper, AuthorDTO> {
	
	@Autowired	
	public AuthorController(AuthorService service, AuthorMapper mapper) {
		super(service, mapper);	
	}
	
	@GetMapping("/searchByName")
	public List<Author> searchByName(@RequestParam String name) {
		return service.searchByName(name);
	}
	
	@GetMapping("/searchByGenre")
	public List<Author> searchByGenre(@RequestParam String genre) {
		return service.searchByGenre(genre);
	}
	
	@GetMapping("/searchByGenre/{id}")
	public List<Author> searchByGenreId(@PathVariable UUID genreId) {
		return service.searchByGenreId(genreId);
	}
}
