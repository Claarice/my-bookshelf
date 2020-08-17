package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.mappers.interfaces.EntityMapper;
import com.br.bookshelf.service.GenreService;
import com.br.bookshelf.service.UserService;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends EntityMapper<Author, AuthorDTO> {
	
	AuthorDTO toDTO(Author source);
		
	List<AuthorDTO> toListDTO(List<Author> source);
		
	Author toEntity(AuthorDTO source);
	
	List<Author> toListEntity(List<AuthorDTO> source);	
}
