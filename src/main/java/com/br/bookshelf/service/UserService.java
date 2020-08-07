package com.br.bookshelf.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.User;
import com.br.bookshelf.repository.UserRepository;

@Service
public class UserService extends BaseService<UserRepository, User, UUID> {
	
	@Autowired
	public UserService(UserRepository repository) {
		super(repository);
	}	
}
