package com.br.bookshelf.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.EmbeddedId;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.br.bookshelf.dto.interfaces.DTOEntity;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.enums.RatingEnum;
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
public class ReviewDTO implements DTOEntity {

	@NotNull
	private UUID userId;
	
	@NotNull
	private UUID bookId;
	
	private String title;
	
	private RatingEnum rating;
	
	private String description;
	
	private List<LocalDateTime> readingDate;
	
	private boolean read;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date createdAt;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ssZ")
    private Date updatedAt;	
}
