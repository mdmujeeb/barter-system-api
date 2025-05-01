package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.City;

public interface CityRepository extends CrudRepository<City, Integer> {

	City findById(Long id);
	
	List<City> findAll();

    City findByName(String name);
}
