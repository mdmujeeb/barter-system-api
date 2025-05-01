package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {

	Country findById(Long id);
	
	List<Country> findAll();

    Country findByName(String name);
}
