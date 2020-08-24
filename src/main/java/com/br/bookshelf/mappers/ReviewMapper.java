package com.br.bookshelf.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.ReviewDTO;
import com.br.bookshelf.entity.Book;
import com.br.bookshelf.entity.Review;
import com.br.bookshelf.entity.ReviewId;
import com.br.bookshelf.entity.User;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface ReviewMapper extends EntityMapper<Review, ReviewDTO> {
	
	ReviewDTO toDTO(Review review);
	
	Review toEntity(ReviewDTO dto);

	List<ReviewDTO> toListDTO(List<Review> source);
	
	List<Review> toListEntity(List<ReviewDTO> source);
	
	ReviewId reviewDTOToReviewId(ReviewDTO reviewDTO);
}
