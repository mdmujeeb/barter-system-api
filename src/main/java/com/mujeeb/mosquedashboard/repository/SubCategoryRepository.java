package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.Category;
import com.mujeeb.mosquedashboard.entity.Subcategory;

public interface SubCategoryRepository extends CrudRepository<Subcategory, Long> {

	Category findById(int id);
	
	List<Subcategory> findAllSubCategories();

    Subcategory findByName(String name);
}
