package com.br.bookshelf.demo.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.demo.entity.ReadingDate;
import com.br.bookshelf.demo.repository.ReadingDateRepository;

@Service
public class ReadingDateService extends BaseService<ReadingDateRepository, ReadingDate, UUID> {
	
	@Autowired
	public ReadingDateService(ReadingDateRepository repository) {
		super(repository);
	}
}
