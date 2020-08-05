package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.User;
import com.br.bookshelf.demo.repository.UserRepository;
import com.br.bookshelf.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController<UserService, UserRepository, User, UUID> {
	
	@Autowired
	public UserController(UserService service) {
		super(service);
	}
}
