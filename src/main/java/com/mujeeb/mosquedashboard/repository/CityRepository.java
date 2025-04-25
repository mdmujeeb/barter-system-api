package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.City;

public interface CityRepository extends CrudRepository<City, Long> {

	City findById(int id);
	
	List<City> findAllCities();

    City findByName(String name);
}
