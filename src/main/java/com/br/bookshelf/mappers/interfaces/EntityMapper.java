package com.br.bookshelf.mappers.interfaces;

import org.mapstruct.Mapper;

public interface EntityMapper<E, DTO> {
	
	DTO toDTO(E entity);	
	
	E toEntity(DTO dto);
}
