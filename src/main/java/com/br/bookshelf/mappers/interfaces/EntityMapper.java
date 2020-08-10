package com.br.bookshelf.mappers.interfaces;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.interfaces.DTOEntity;

public interface EntityMapper<E> {
	
	DTOEntity toDTO(E entity);
	
	E toEntity(DTOEntity dto);
}
