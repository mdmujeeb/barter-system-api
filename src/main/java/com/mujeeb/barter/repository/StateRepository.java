package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {

	State findById(Long id);
	
	List<State> findAll();

    State findByName(String name);
}
