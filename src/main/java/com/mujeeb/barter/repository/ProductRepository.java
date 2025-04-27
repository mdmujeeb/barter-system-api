package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.Subcategory;
import com.mujeeb.barter.entity.Unit;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findById(Long id);
	
	List<Product> findByName(String name);
	
	List<Product> findByDescription(String description);
	
	List<Product> findByCategory(Category category);
	
	List<Product> findBySubcategory(Subcategory subcategory);
	
	List<Product> findByUnit(Unit unit);
}
