package com.br.bookshelf.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.br.bookshelf.dto.UserDTO;
import com.br.bookshelf.entity.User;
import com.br.bookshelf.mappers.interfaces.EntityMapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<User, UserDTO> {

	UserDTO toDTO(User source);
	
	User toEntity(UserDTO source);
}
