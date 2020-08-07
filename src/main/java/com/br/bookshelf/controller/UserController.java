package com.br.bookshelf.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.entity.User;
import com.br.bookshelf.repository.UserRepository;
import com.br.bookshelf.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserService, UserRepository, User, UUID> {
	
	@Autowired
	public UserController(UserService service) {
		super(service);
	}
}
