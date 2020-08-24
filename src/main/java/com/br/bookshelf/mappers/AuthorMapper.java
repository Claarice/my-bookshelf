package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.dto.GenreDTO;
import com.br.bookshelf.dto.RelatedGenreDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface AuthorMapper extends EntityMapper<Author, AuthorDTO> {
	
	AuthorDTO toDTO(Author source);	

	List<AuthorDTO> toListDTO(List<Author> source);
			
	Author toEntity(AuthorDTO source);
	
	List<Author> toListEntity(List<AuthorDTO> source);	

	Genre relatedGenreDTOToGenre(RelatedGenreDTO dto);
		
	RelatedGenreDTO genreToRelatedGenreDTO(Genre genre);
	
	List<Genre> relatedGenreDTOListToGenreList(List<RelatedGenreDTO> dto);
		
	List<RelatedGenreDTO> genreListToRelatedGenreDTOList(List<Genre> genre);
}
	