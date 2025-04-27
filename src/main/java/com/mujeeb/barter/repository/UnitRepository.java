package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Unit;

public interface UnitRepository extends CrudRepository<Unit, Integer> {

	Unit findById(Long id);
	
	List<Unit> findAllUnits();

    Unit findByName(String name);
}
