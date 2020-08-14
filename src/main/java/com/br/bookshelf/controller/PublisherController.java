package com.br.bookshelf.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.dto.PublisherDTO;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.mappers.PublisherMapper;
import com.br.bookshelf.repository.PublisherRepository;
import com.br.bookshelf.service.PublisherService;

@RestController
@RequestMapping("/publisher")
public class PublisherController extends BaseController<PublisherService, PublisherRepository, Publisher, UUID, PublisherMapper, PublisherDTO> {
	
	@Autowired
	public PublisherController(PublisherService service, PublisherMapper mapper) {
		super(service, mapper);
	}
}
