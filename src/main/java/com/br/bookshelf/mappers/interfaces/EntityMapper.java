package com.br.bookshelf.mappers.interfaces;

import java.util.List;

import org.mapstruct.Mapper;

public interface EntityMapper<E, DTO> {
	
	DTO toDTO(E source);	
	
	E toEntity(DTO source);
	
	List<DTO> toListDTO(List<E> source);
	
	List<E> toListEntity(List<DTO> source);
}
