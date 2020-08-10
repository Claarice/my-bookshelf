package com.br.bookshelf.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.entity.User;
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
public class AuthorDTO {
	
	private UUID id;
	
	@NotNull
	private String name;
	
	private User user;
	
	private List<Genre> genre;
	
	private Date dateOfBirth;
	
	@Column(length = 2000)
	private String bio;

}
