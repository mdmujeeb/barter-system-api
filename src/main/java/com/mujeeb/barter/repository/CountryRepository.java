package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Long> {

	Country findById(int id);
	
	List<Country> findAllCountry();

    Country findByName(String name);
}
