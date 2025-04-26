package com.mujeeb.barter.repository;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.Subcategory;
import com.mujeeb.barter.entity.Unit;

public interface ProductRepository extends CrudRepository<Product, Long> {

	Product findById(int id);
	
	Product findByName(String name);
	
	Product findByDescription(String description);
	
	Product findByCategory(Category category);
	
	Product findBySubcategory(Subcategory subcategory);
	
	Product findByUnit(Unit unit);
}
