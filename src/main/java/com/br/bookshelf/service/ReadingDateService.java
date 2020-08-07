package com.br.bookshelf.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.bookshelf.entity.ReadingDate;
import com.br.bookshelf.repository.ReadingDateRepository;

@Service
public class ReadingDateService extends BaseService<ReadingDateRepository, ReadingDate, UUID> {
	
	@Autowired
	public ReadingDateService(ReadingDateRepository repository) {
		super(repository);
	}
}
