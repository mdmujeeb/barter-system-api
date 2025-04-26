package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Listing;
import com.mujeeb.barter.entity.Product;
import com.mujeeb.barter.entity.Unit;
import com.mujeeb.barter.entity.User;

public interface ListingRepository extends CrudRepository<Listing, Long> {

	Listing findByUnit(Unit unit);
	
	List<Listing> findByUser(User user);
	
	List<Listing> findByProduct(Product product);
}
