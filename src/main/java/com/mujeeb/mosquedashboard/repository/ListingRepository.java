package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.Listing;
import com.mujeeb.mosquedashboard.entity.Product;
import com.mujeeb.mosquedashboard.entity.Unit;
import com.mujeeb.mosquedashboard.entity.User;

public interface ListingRepository extends CrudRepository<Listing, Long> {

	Listing findByUnit(Unit unit);
	
	List<Listing> findByUser(User user);
	
	List<Listing> findByProduct(Product product);
}
