package com.br.bookshelf.dto;

import java.util.Date;
import java.util.UUID;

import javax.validation.constraints.NotNull;

import com.br.bookshelf.dto.interfaces.DTOEntity;
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
public class ReadingDateDTO implements DTOEntity {

	private UUID id;
	
	@NotNull
	private Date start_date;
	
	@NotNull
	private Date finish_date;
}
