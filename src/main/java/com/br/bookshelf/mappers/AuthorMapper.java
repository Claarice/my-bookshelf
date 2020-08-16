package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.mappers.interfaces.EntityMapper;
import com.br.bookshelf.service.GenreService;
import com.br.bookshelf.service.UserService;

@Mapper(componentModel = "spring", uses = {UserService.class, GenreService.class})
public interface AuthorMapper extends EntityMapper<Author, AuthorDTO> {
	
	@Mapping(source = "user.id", target = "userId")
	AuthorDTO toDTO(Author source);
		
	@Mapping(source = "userId", target = "user.id")
	Author toEntity(AuthorDTO source);
	
	List<AuthorDTO> toDTO(List<Author> source);
	
	List<Author> toEntity(List<AuthorDTO> source);
}
