package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends EntityMapper<Author, AuthorDTO> {
	
	@Mapping(source = "user.id", target = "userId")
	@Mapping(source = "genre.id", target = "genreId")
	AuthorDTO toDTO(Author author);
	
	@Mapping(source = "userId", target = "user.id")
	@Mapping(source = "genre.id", target = "genreId")
	Author toEntity(AuthorDTO dto);
}
