package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Listing;

public interface ListingRepository extends CrudRepository<Listing, Integer> {

	Listing findById(Long id);
	
	List<Listing> findAll();
	
	List<Listing> findByUserId(Long userId);
	
	List<Listing> findByProductId(Long productId);
	
	List<Listing> findByCategoryId(Long categoryId);
	
	List<Listing> findBySubcategoryId(Long subcategoryId);
	
	List<Listing> findByDescription(String description);
}
