package com.br.bookshelf.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.entity.ReadingDate;
import com.br.bookshelf.repository.ReadingDateRepository;
import com.br.bookshelf.service.ReadingDateService;

@RestController
@RequestMapping("/readingDate")
public class ReadingDateController extends BaseController<ReadingDateService, ReadingDateRepository, ReadingDate, UUID> {
	
	@Autowired
	public ReadingDateController(ReadingDateService service) {
		super(service);
	}
}
