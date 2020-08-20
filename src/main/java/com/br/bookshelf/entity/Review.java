package com.br.bookshelf.entity;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Transient;

import org.springframework.data.domain.Persistable;

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
	
	private LocalDateTime startDate;
	
	private LocalDateTime endDate;
	
	private boolean read;
	
	@Transient
	private Book book;
	
	@Transient
	private User user;

	@PrePersist
	private void prePersist() {
		if (this.getId() == null) {
			ReviewId reviewId = new ReviewId();
			reviewId.setBook(this.getBook());
			reviewId.setUser(this.getUser());
			this.setId(reviewId);
		}
	}
	
}
