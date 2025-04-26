package com.mujeeb.barter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.barter.entity.State;

public interface StateRepository extends CrudRepository<State, Long> {

	State findById(int id);
	
	List<State> findAllStates();

    State findByName(String name);
}
