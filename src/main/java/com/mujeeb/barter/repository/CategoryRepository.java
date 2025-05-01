package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

	Category findById(Long id);
	
	List<Category> findAll();
	
    Category findByName(String name);
}
