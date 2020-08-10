package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.ReadingDateDTO;
import com.br.bookshelf.entity.ReadingDate;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface ReadingDateMapper extends EntityMapper<ReadingDate, ReadingDateDTO> {

	ReadingDateDTO toDTO(ReadingDate entity);
	
	ReadingDate toEntity(ReadingDateDTO dto);
}
