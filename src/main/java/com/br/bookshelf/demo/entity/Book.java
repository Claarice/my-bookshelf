package com.br.bookshelf.demo.entity;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.br.bookshelf.demo.enums.CategoryEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book extends AbstractAuditingEntity {
	
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "uuid2")
	private UUID id;
	
	@NotNull
	private Long isbn13;
	
	private Long isbn10;
	
	@NotNull
	private String title;
	
	@OneToMany
	private List<User> author;

	@ManyToOne
	private Publisher publisher;
	
	@NotNull
	private int edition;
	
	private String year;
	
	private CategoryEnum category;
	
	@NotNull
	private int pageNumber;
	
	@NotNull
	private String language;	
}
