package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Category;
import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.Subcategory;
import com.mujeeb.barter.entity.Unit;
import com.mujeeb.barter.entity.User;

public interface ListingRepository extends CrudRepository<Listing, Integer> {

	Listing findById(Long id);
	
	List<Listing> findByUnit(Unit unit);
	
	List<Listing> findByUser(User user);
	
	List<Listing> findByProduct(Product product);
	
	List<Listing> findByCategory(Category category);
	
	List<Listing> findBySubcategory(Subcategory subcategory);
	
	List<Listing> findByDescription(String description);
}
