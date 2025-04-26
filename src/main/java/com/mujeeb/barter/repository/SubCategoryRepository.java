package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.Subcategory;

public interface SubCategoryRepository extends CrudRepository<Subcategory, Long> {

	Category findById(int id);
	
	List<Subcategory> findAllSubCategories();

    Subcategory findByName(String name);
}
