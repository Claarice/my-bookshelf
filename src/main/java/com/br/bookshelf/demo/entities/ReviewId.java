package com.br.bookshelf.demo.entities;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ReviewId {
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Book book;
}
