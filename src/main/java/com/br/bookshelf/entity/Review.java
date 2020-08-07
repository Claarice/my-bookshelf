package com.br.bookshelf.entity;

import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.br.bookshelf.enums.RatingEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review extends AbstractAuditingEntity {
	
	@EmbeddedId
	private ReviewId id;
	
	private String title;
	
	private RatingEnum rating;
	
	private String description;
	
	@OneToMany
	private List<ReadingDate> readingDates;
	
	private boolean read;
}
