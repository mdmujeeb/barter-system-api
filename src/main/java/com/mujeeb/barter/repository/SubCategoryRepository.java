package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Subcategory;

public interface SubCategoryRepository extends CrudRepository<Subcategory, Integer> {

	Subcategory findById(Long id);
	
	List<Subcategory> findAll();

    Subcategory findByName(String name);
}
