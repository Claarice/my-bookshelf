package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.AuthorDTO;
import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<Book, BookDTO> {
	
	BookDTO toDTO(Book book);
	
	Book toEntity(BookDTO dto);

	List<BookDTO> toDTO(List<Book> source);
	
	List<Book> toEntity(List<BookDTO> source);
}
