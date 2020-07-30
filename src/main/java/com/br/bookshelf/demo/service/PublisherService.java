package com.br.bookshelf.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.Publisher;
import com.br.bookshelf.demo.repository.PublisherRepository;

@Service
public class PublisherService extends BaseService<PublisherRepository, Publisher, UUID> {
		
	@Autowired
	public PublisherService(PublisherRepository repository) {
		super(repository);
	}
}
