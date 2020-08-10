package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;

import com.br.bookshelf.dto.UserDTO;
import com.br.bookshelf.entity.User;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<User, UserDTO> {
	
	UserDTO toDTO(User user);
	
	User toEntity(UserDTO dto);
}
