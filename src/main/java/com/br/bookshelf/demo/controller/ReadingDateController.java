package com.br.bookshelf.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.entity.ReadingDate;
import com.br.bookshelf.demo.repository.ReadingDateRepository;
import com.br.bookshelf.demo.service.ReadingDateService;

@RestController
@RequestMapping("/readingDate")
public class ReadingDateController extends BaseController<ReadingDateService, ReadingDateRepository, ReadingDate, UUID> {
	
	@Autowired
	public ReadingDateController(ReadingDateService service) {
		super(service);
	}
}
