package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.PublisherDTO;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface PublisherMapper extends EntityMapper<Publisher, PublisherDTO> {
	
	PublisherDTO toDTO(Publisher publisher);
	
	Publisher toEntity(PublisherDTO dto);
}
