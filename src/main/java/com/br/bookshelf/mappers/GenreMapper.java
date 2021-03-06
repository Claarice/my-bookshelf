package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.dto.GenreDTO;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface GenreMapper extends EntityMapper<Genre, GenreDTO> {
	
	GenreDTO toDTO(Genre genre);
	
	Genre toEntity(GenreDTO dto);

	List<GenreDTO> toListDTO(List<Genre> source);
	
	List<Genre> toListEntity(List<GenreDTO> source);
}
