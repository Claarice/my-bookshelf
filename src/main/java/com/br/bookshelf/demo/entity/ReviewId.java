package com.br.bookshelf.demo.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class ReviewId implements Serializable {
	@ManyToOne
	private User user;
	
	@ManyToOne
	private Book book;
}
