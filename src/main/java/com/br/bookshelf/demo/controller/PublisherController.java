package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.Publisher;
import com.br.bookshelf.demo.repository.PublisherRepository;
import com.br.bookshelf.demo.service.PublisherService;

@RestController
@RequestMapping("/publisher")
public class PublisherController extends BaseController<PublisherService, PublisherRepository, Publisher, UUID> {
	
	@Autowired
	public PublisherController(PublisherService service) {
		super(service);
	}
}
