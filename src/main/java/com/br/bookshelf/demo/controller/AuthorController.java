package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.Author;
import com.br.bookshelf.demo.repository.AuthorRepository;
import com.br.bookshelf.demo.service.AuthorService;

@RestController
@RequestMapping("/author")
public class AuthorController extends BaseController<AuthorService, AuthorRepository, Author, UUID> {
	
	@Autowired
	public AuthorController(AuthorService service) {
		super(service);
	}
}
