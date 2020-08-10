package com.br.bookshelf.dto;

import lombok.NoArgsConstructor;

import lombok.Setter;

import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.entity.Author;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.entity.Publisher;
import com.br.bookshelf.enums.CategoryEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookDTO {
	
	private UUID id;
	
	@NotNull
	private Long isbn13;
	
	private Long isbn10;
	
	@NotNull
	private String title;

	@NotNull
	private List<UUID> authorIds;
	
	@NotNull
	private UUID publisherId;
	
	@NotNull
	private int edition;
	
	private String year;
	
	private CategoryEnum category;
	
	@NotNull
	private int pageNumber;
	
	@NotNull
	private String language;

	private List<UUID> genreIds;
	
	@Column(length = 3000)
	private String synopsis;
}