package com.br.bookshelf.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.repository.PublisherRepository;

@Service
public class PublisherService extends BaseService<PublisherRepository, Publisher, UUID> {
		
	@Autowired
	public PublisherService(PublisherRepository repository) {
		super(repository);
	}
}
