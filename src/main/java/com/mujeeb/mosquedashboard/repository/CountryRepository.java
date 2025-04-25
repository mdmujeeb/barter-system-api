package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

	Country findById(int id);
	
	List<Country> findAllCountry();

    Country findByName(String name);
}
