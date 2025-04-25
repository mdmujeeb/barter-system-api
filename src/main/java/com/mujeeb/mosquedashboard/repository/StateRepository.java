package com.mujeeb.mosquedashboard.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mujeeb.mosquedashboard.entity.State;

public interface StateRepository extends CrudRepository<State, Long> {

	State findById(int id);
	
	List<State> findAllStates();

    State findByName(String name);
}
