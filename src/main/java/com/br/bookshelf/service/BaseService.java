package com.br.bookshelf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseService<R extends JpaRepository<E, ID>, E, ID> {
	
	protected final R repository;
	
	public E save(E entity) {
		return repository.save(entity);	
	}
	
	public List<E> saveAll(List<E> entities) {
		return repository.saveAll(entities);
	}
	
	public E update(ID id, E entity) throws IllegalAccessException {
		if (!repository.findById(id).isPresent()) {
			throw new IllegalAccessException();
		}
		
		return repository.save(entity);
	}
	
	public E findById(ID id) {
		return repository.findById(id).orElse(null);
	}
	
	public void delete(E entity) {
		repository.delete(entity);
	}	
	
	public List<E> findAll() {
		return repository.findAll();
	}
	
	public void deleteById(ID id) {
		repository.deleteById(id);
	}
	
	public E saveAndFlush(E entity) {
		return repository.saveAndFlush(entity);
	}
	
	
	
}
