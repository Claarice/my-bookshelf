package com.br.bookshelf.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.UserDTO;
import com.br.bookshelf.entity.User;
import com.br.bookshelf.mappers.UserMapper;
import com.br.bookshelf.repository.UserRepository;
import com.br.bookshelf.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserService, UserRepository, User, UUID> {
	
	private UserMapper mapper;
	
	@Autowired
	public UserController(UserService service) {
		super(service);
	}
		
	@GetMapping("/teste/{id}")
	@ResponseStatus(HttpStatus.OK)
	public UserDTO teste(@PathVariable UUID id) {
		return mapper.toDTO(service.findById(id));
	}
}
