package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Category findById(int id);
	
	List<Category> findAllCategories();

    Category findByName(String name);
}
