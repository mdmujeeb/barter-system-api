package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.Unit;

public interface ProductRepository extends CrudRepository<Product, Integer> {

	Product findById(Long id);
	
	List<Product> findAll();
	
	List<Product> findByName(String name);
	
	List<Product> findByDescription(String description);
	
	List<Product> findByCategoryId(Long categoryId);
	
	List<Product> findBySubcategoryId(Long subcategoryId);
	
	List<Product> findByUnitId(Unit unitId);
}
