package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
	
import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.dto.RelatedAuthorDTO;
import com.br.bookshelf.dto.RelatedGenreDTO;
import com.br.bookshelf.dto.RelatedPublisherDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.mappers.interfaces.EntityMapper;


@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<Book, BookDTO> {
	
	BookDTO toDTO(Book source);

	Book toEntity(BookDTO source);

	List<BookDTO> toListDTO(List<Book> source);
	
	List<Book> toListEntity(List<BookDTO> source);
	
	Genre genreToGenreDto(RelatedGenreDTO dto);
	
	RelatedGenreDTO genreDtoToGenre(Genre source);
	
	RelatedPublisherDTO publisherToPublisherDto(Publisher source);
	
	RelatedAuthorDTO authorToAuthorDto(Author source);
}
