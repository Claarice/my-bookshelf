package com.br.bookshelf.dto;

import lombok.NoArgsConstructor;

import lombok.Setter;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.dto.interfaces.DTOEntity;
import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.enums.CategoryEnum;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO implements DTOEntity {
	
	private UUID id;
	
	@NotNull
	private Long isbn13;
	
	private Long isbn10;
	
	@NotNull
	private String title;

	@NotNull
	private List<Author> author;
	
	@NotNull
	private Publisher publisher;
	
	@NotNull
	private int edition;
	
	private String year;
	
	private CategoryEnum category;
	
	@NotNull
	private int pageNumber;
	
	@NotNull
	private String language;

	private List<Genre> genre;
	
	@Column(length = 3000)
	private String synopsis;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date updatedAt;	
}
