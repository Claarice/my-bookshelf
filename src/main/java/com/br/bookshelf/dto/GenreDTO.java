package com.br.bookshelf.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.dto.interfaces.DTOEntity;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Book;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenreDTO implements DTOEntity {
	
	private UUID id;
	
	@NotNull
	private String name;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date updatedAt;	
}
