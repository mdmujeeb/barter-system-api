package com.mujeeb.mosquedashboard.repository;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.Category;
import com.mujeeb.mosquedashboard.entity.Product;
import com.mujeeb.mosquedashboard.entity.Subcategory;
import com.mujeeb.mosquedashboard.entity.Unit;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findById(int id);
	
	Product findByName(String name);
	
	Product findByDescription(String description);
	
	Product findByCategory(Category category);
	
	Product findBySubcategory(Subcategory subcategory);
	
	Product findByUnit(Unit unit);
}
