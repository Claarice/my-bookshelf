package com.br.bookshelf.mappers.interfaces;

import org.mapstruct.Mapper;

public interface EntityMapper<E, DTO> {
	
	DTO toDTO(E source);	
	
	E toEntity(DTO source);
}
