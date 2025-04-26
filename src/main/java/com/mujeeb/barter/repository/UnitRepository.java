package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.Unit;

public interface UnitRepository extends CrudRepository<Unit, Long> {

	Unit findById(int id);
	
	List<Unit> findAllUnits();

    Unit findByName(String name);
}
