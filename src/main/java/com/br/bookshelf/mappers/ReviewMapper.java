package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.ReadingDateDTO;
import com.br.bookshelf.dto.ReviewDTO;
import com.br.bookshelf.entity.ReadingDate;
import com.br.bookshelf.entity.Review;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper extends EntityMapper<Review, ReviewDTO> {
	
	ReviewDTO toDTO(Review review);
	
	Review toEntity(ReviewDTO dto);

	List<ReviewDTO> toDTO(List<Review> source);
	
	List<Review> toEntity(List<ReviewDTO> source);
}
