package com.br.bookshelf.demo.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.br.bookshelf.demo.service.BaseService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseController<S extends BaseService<R, E, ID>, R extends JpaRepository<E, ID>, E, ID> {
	
	protected S service;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<E> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public E save(E entity) {
		return service.save(entity);
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public E getById(@PathVariable ID id) {
		return service.findById(id);
	}
	
	@PutMapping
	@ResponseStatus(HttpStatus.OK)
	public E update(E entity) {
		return service.update(entity);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public List<E> saveAll(List<E> entities) {
		return service.saveAll(entities);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.OK)
	public void delete(E entity) {
		service.delete(entity);
	}	
}
