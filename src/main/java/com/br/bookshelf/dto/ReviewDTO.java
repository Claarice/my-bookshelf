package com.br.bookshelf.dto;

import java.util.List;
import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.entity.ReadingDate;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.enums.RatingEnum;
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
public class ReviewDTO {

	@NotNull
	private UUID userId;
	
	@NotNull
	private UUID bookId;
	
	private String title;
	
	private RatingEnum rating;
	
	private String description;
	
	private List<UUID> readingDateIds;
	
	private boolean read;
}
