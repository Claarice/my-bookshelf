package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<Book, BookDTO> {
	
	@Mapping(source = "publisher.id", target = "publisher.id")
	BookDTO toDTO(Book source);

	@Mapping(source = "publisher.id", target = "publisher.id")
	Book toEntity(BookDTO dto);

	List<BookDTO> toListDTO(List<Book> source);
	
	List<Book> toListEntity(List<BookDTO> source);
}
