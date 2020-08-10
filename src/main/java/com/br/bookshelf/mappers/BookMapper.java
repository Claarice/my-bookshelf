package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.BookDTO;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface BookMapper extends EntityMapper<Book, BookDTO> {
	
	BookDTO toDTO(Book book);
	
	Book toEntity(BookDTO dto);
}
