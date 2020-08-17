package com.br.bookshelf.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.mappers.interfaces.EntityMapper;
import com.br.bookshelf.service.BaseService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseController<S extends BaseService<R, E, ID>, R extends JpaRepository<E, ID>, E, ID, M extends EntityMapper<E, DTO>, DTO> {
		
	protected S service;
	
	protected M mapper;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<DTO> findAll() {
		return mapper.toListDTO(service.findAll());
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public DTO save(@RequestBody DTO dto) {
		E entity = mapper.toEntity(dto);
		return mapper.toDTO(service.save(entity));
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public DTO getById(@PathVariable ID id) {
		return mapper.toDTO(service.findById(id));
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public DTO update(@PathVariable ID id, @RequestBody DTO dto) throws IllegalAccessException {
		E entity = mapper.toEntity(dto);
		return mapper.toDTO(service.update(id, entity));
	}
	
	@PostMapping("/saveAll")
	@ResponseStatus(HttpStatus.OK)
	public List<DTO> saveAll(@RequestBody List<DTO> dto) {
		List<E> entities = mapper.toListEntity(dto);
		return mapper.toListDTO(service.saveAll(entities));
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void delete(ID id) {
		service.deleteById(id);
	}	
	
	@PostMapping("/saveAndFlush")
	@ResponseStatus(HttpStatus.OK)
	public DTO saveAndFlush(@RequestBody DTO dto) {
		E entity = mapper.toEntity(dto);
		return mapper.toDTO(service.saveAndFlush(entity));
	}
}
