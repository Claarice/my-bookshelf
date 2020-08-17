package com.br.bookshelf.dto;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.dto.interfaces.DTOEntity;
import com.br.bookshelf.entity.Genre;
import com.br.bookshelf.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
	
	private UUID userId;
	
	private List<Genre> genre;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date dateOfBirth;
	
	@Column(length = 2000)
	private String bio;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date updatedAt;	
}
